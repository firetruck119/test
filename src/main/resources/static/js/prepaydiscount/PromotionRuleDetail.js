/**
 * Created by tchu on 2017/12/15.
 */
var PrepayDiscountRuleConfigureId=0;//促销规则key
var typeMap = new Map();
var hotelCostType = new Array();

function initData() {
    prepayDiscountTypeConfigureEvent(1);

    //获取传参
    var id = $.trim(getUrlParam("id"));
    if (id != null && id != "" && Number(id) > 0) {
        PrepayDiscountRuleConfigureId = id;
        queryRuleData(id);
        $("#PrepayDiscountRuleId").val(id);
        //这里页面加载时需要手动调用“活动”下拉列表函数
        getCampaignsByStatusAndTypeId(0)
        
        var typeConfigureId = $("#PrepayDiscountTypeConfigure").val();
        prepayDiscountTypeConfigureEvent(typeConfigureId);
    } else {
        PrepayDiscountRuleConfigureId = 0;
        // $("#PrepayDiscountRuleId").val("");
        addOfferDetailRow();
        //getTagsByStatusAndTypeId(0);
        getCampaignsByStatusAndTypeId(0);
    }
    $("#prepaydiscountruleconfigure").val(PrepayDiscountRuleConfigureId);
}


function initLogData() {
    //获取传参
    var id = $.trim(getUrlParam("id"));
    if (id != null && id != "" && Number(id) > 0) {
        queryRuleLogData(id);
    }
}


//获取url中的参数
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return decodeURIComponent(r[2]); return null; //返回参数值
}
/**
 * 编辑时初始化选择的促销类型
 * @param selectItem
 */

function selectPrepayDiscountTypeConfigure(selectItem){
    var items=$("input[name='PrepayDiscountTypeConfigure']");
    //var items=$("#")
    items.each(function(){
        if($(this).val()==selectItem){
            $(this).attr("disabled",false);
            $(this).attr("checked","checked");
            prepayDiscountTypeConfigureEvent(selectItem);
        }else{
            $(this).attr("disabled",true);
        }
    });
}

function setofferDetailDate(type){
    var datestr="";
    var ruleId=$("#prepaydiscountruleconfigure").val();
    var cdate=getLocaleDateString();
    if(type==1){
        var PromotionStartDate=$.trim($("#PromotionStartDate").val());
        if(PromotionStartDate==""){
            alert("促销有效期开始时间不能为空!");
            return false;
        }
        if(ruleId==0){
            if(compareDate(PromotionStartDate,cdate)>0){
                alert("促销有效期开始日期不能早于今天!");
                return false;
            }
        }
        datestr=$("#PromotionStartDate").val();
        if($("#StartDate1").val()==""){
            $("#StartDate1").val(datestr);
        }
    }else if(type==2){
        var PromotionStartDate=$.trim($("#PromotionStartDate").val());
        var PromotionEndDate=$.trim($("#PromotionEndDate").val());
        if(PromotionEndDate==""){
            alert("促销有效期结束时间不能为空!");
            return false;
        }
        if(compareDate(PromotionStartDate,PromotionEndDate)>0){
            alert("促销有效期结束日期不能早于开始日期!");
            return false;
        }

        datestr=$("#PromotionEndDate").val();
        if($("#EndDate1").val()==""){
            $("#EndDate1").val(datestr);
        }
    }
}

var offerDetailsDivsCount=0;//优惠详情行数据，默认1行
/**
 * 优惠详情增加一行html
 */
function addOfferDetailRow(){
    offerDetailsDivsCount=offerDetailsDivsCount+1;

    var PStartDate=$("#PromotionStartDate").val();
    var PEndDate=$("#PromotionEndDate").val();
    
    var offerDetailsDivs=$('#offerDetailsDivs');
    var htmlStr='<div id="offerDetailsDiv'+offerDetailsDivsCount+'" style="margin: 2px;">';
    htmlStr+='<input class="se-con" style="width: 70px;height: 28px;" value="'+PStartDate+'" name="StartDate'+offerDetailsDivsCount+'" id="StartDate'+offerDetailsDivsCount+'" onClick="WdatePicker()" />';
    htmlStr+=' ~ ';
    htmlStr+='<input class="se-con" style="width: 70px;height: 28px;" value="'+PEndDate+'" name="EndDate'+offerDetailsDivsCount+'" id="EndDate'+offerDetailsDivsCount+'" onClick="WdatePicker()" />';
    var PromotionMethod=$("input[name='PromotionMethod']:checked").val();
    var PrepayDiscountTypeValue = $("#PrepayDiscountTypeConfigure").val();
    if(PromotionMethod == 1) {    	
    	htmlStr+=' &nbsp;每间夜卖价优惠:';
    	//htmlStr+=' <input class="se-con" style="width: 60px;height: 28px;" name="Amount'+offerDetailsDivsCount+'" id="Amount'+offerDetailsDivsCount+'" />';
    	htmlStr+=" <input class=\"se-con\" style=\"width: 30px;height: 28px;\" name=\"Amount"+offerDetailsDivsCount+"\" id=\"Amount"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />";
    	htmlStr+=' 元';
    	//如果为返现，那么隐藏底价优惠，并设置默认值
    	if(PrepayDiscountTypeValue == 8){
    		//建立一个隐藏域，存放默认值
    		htmlStr+=" <input type=\"hidden\" class=\"se-con\" style=\"width: 30px;height: 28px;\" value=\"0\" name=\"CostAmount"+offerDetailsDivsCount+"\" id=\"CostAmount"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />";  		
    	}else{
    		htmlStr+='&nbsp;底价优惠:';
    		htmlStr+=" <input class=\"se-con\" style=\"width: 30px;height: 28px;\" value=\"0\" name=\"CostAmount"+offerDetailsDivsCount+"\" id=\"CostAmount"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />";
    		htmlStr+=' 元';
    	}
    }
    if(PromotionMethod == 2) {
    	if(PrepayDiscountTypeValue == 8){	
    		htmlStr+=" <input type=\"hidden\" class=\"se-con\" style=\"width: 30px;height: 28px;\" value=\"100\" name=\"CostFactor"+offerDetailsDivsCount+"\" id=\"CostFactor"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />%";
    	}else{
    		htmlStr+=' &nbsp;每间夜比例 &nbsp; 底价:';
    		//htmlStr+=' <input class="se-con" style="width: 60px;height: 28px;" name="Amount'+offerDetailsDivsCount+'" id="Amount'+offerDetailsDivsCount+'" />';
    		htmlStr+=" <input class=\"se-con\" style=\"width: 30px;height: 28px;\" name=\"CostFactor"+offerDetailsDivsCount+"\" id=\"CostFactor"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />%";
    	}
    	htmlStr+=' &nbsp; 卖价:';
    	htmlStr+=" <input class=\"se-con\" style=\"width: 30px;height: 28px;\" name=\"PriceFactor"+offerDetailsDivsCount+"\" id=\"PriceFactor"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />%";
    }

    var array = getPromotionStrategy();;
	for(var i = 0 ; i < array.length ; i++) {
		if("1"==array[i]) {
		    htmlStr+=' &nbsp;&nbsp;连住:';
			htmlStr+=" <input class=\"se-con\" style=\"width: 30px;height: 28px;\" name=\"ContinuousDays"+offerDetailsDivsCount+"\" id=\"ContinuousDays"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />";
		    htmlStr+=' 天';

		} else if("2"==array[i]) {
		    htmlStr+=' &nbsp;&nbsp;提前预订:';
			htmlStr+=" <input class=\"se-con\" style=\"width: 30px;height: 28px;\" name=\"PredeterminedDays"+offerDetailsDivsCount+"\" id=\"PredeterminedDays"+offerDetailsDivsCount+"\" onkeyup=\"value=value.replace(/[^\\d]/g,'');\" />";
		    htmlStr+=' 天 ';
		}
	}

	htmlStr+=' &nbsp;&nbsp;星期：';
    htmlStr+=' <input type="checkbox" name="Mon" id="Mod'+offerDetailsDivsCount+'" checked="checked" value="一">一';
    htmlStr+=' &nbsp;<input type="checkbox" name="Tue" id="Tue'+offerDetailsDivsCount+'" checked="checked" value="二">二';
    htmlStr+=' &nbsp;<input type="checkbox" name="Wed" id="Wed'+offerDetailsDivsCount+'" checked="checked" value="三">三';
    htmlStr+=' &nbsp;<input type="checkbox" name="Thu" id="Thu'+offerDetailsDivsCount+'" checked="checked" value="四">四';
    htmlStr+=' &nbsp;<input type="checkbox" name="Fri" id="Fri'+offerDetailsDivsCount+'" checked="checked" value="五">五';
    htmlStr+=' &nbsp;<input type="checkbox" name="Sat" id="Sat'+offerDetailsDivsCount+'" checked="checked" value="六">六';
    htmlStr+=' &nbsp;<input type="checkbox" name="Sun" id="Sun'+offerDetailsDivsCount+'" checked="checked" value="日">日';
    //新增的ID为0 
    htmlStr+='<input type="hidden" name="offerDetailId" id="offerDetailId'+offerDetailsDivsCount+'" value="0" />';

    htmlStr+='</div>';
    offerDetailsDivs.append(htmlStr);
////onclick="WdatePicker({isShowClear:false,readOnly:true})"
}
/**
 * 根据不同的促销类型显示不同内容，新增促销类型为“返现”，隐藏“底价”或者是“底价优惠”
 * @param selectItem
 */
function prepayDiscountTypeConfigureEvent(selectItem){
	//var typeMap = new Map();
	var strategy = typeMap.get(Number(selectItem));
	if(strategy == null) {
		return;
	}
	//策略ID列表，1：多天连住，2：提前预订，3：门店新客，4：携程新客，5:限时抢购,6:今夜特惠  如:1,2,3,4
	var array = strategy.split(",");

	for(var i = 0 ; i < array.length ; i++) {
		if("5"==array[i]) {
		    $("#ReserveLimitTR").css("display","table-row");
		} else if("6"==array[i]) {
		    $("#ReserveLimitTR").css("display","table-row");
		}
	}
	
    //$("#PredeterminedDayTR").css("display","none");
	//控制提前天数是否显示，selectItem == 3表示“提前预定减价”
	if(selectItem == 3){
		$("#PredeterminedDayTR").css("display","table-row");
	}
	else{
		$("#PredeterminedDayTR").css("display","none");
	}
	
	/*//当促销类型为“返现”时（selectItem == 8）,隐藏“底价”或者是“底价优惠”
	var PromotionMethod=$("input[name='PromotionMethod']:checked").val();
	if(selectItem == 8){
		if(PromotionMethod == 1){
			$("#PredeterminedDayTR").css("display","table-row");
		}else{
			
		}
		
	}*/
	
    if(selectItem <= 3) {
        $("#btnSubmit").attr("disabled",false);
        $("#roomsTR").css("display","table-row");
        $("#offerDetailsTR").css("display","table-row");
        $("#userSelTR").css("display","none");
        $("#hotelRoomSelTR").css("display","none");
        $("#DiscountsConfigurationTR").css("display","none");
    }
    if(selectItem >= 6 && selectItem <= 8) {
        $("#roomsTR").css("display","none");
        $("#roomIdList").val("");
    }
    
//    }else if(selectItem==4){
//        $("#PredeterminedDayTR").css("display","none");
//        $("#offerDetailsTR").css("display","none");
//        $("#roomsTR").css("display","none");
//
//        $("#userSelTR").css("display","table-row");
//        $("#hotelRoomSelTR").css("display","table-row");
//        $("#DiscountsConfigurationTR").css("display","table-row");
//        $("#btnSubmit").attr("disabled",true);
//    }else if(selectItem==5){
//        $("#PredeterminedDayTR").css("display","none");
//        $("#offerDetailsTR").css("display","none");
//        $("#roomsTR").css("display","none");
//
//        $("#userSelTR").css("display","table-row");
//        $("#hotelRoomSelTR").css("display","table-row");
//        $("#DiscountsConfigurationTR").css("display","table-row");
//        $("#btnSubmit").attr("disabled",true);
}


function checkData(){
	//var PrepayDiscountTypeConfigure=$("input[name='PrepayDiscountTypeConfigure']:checked").val();
	var PrepayDiscountTypeConfigure = $("#PrepayDiscountTypeConfigure").val();
	for(var i = 0 ; i < hotelCostType.length ; i++) {
		if(Number(PrepayDiscountTypeConfigure) == hotelCostType[i]) {
	        alert("酒店促销规则不能修改");
	        return false;
		}
	}
	
    var cdate=getLocaleDateString();
    var ruleId=$("#prepaydiscountruleconfigure").val();
    var RuleName=$.trim($("#RuleName").val());
    if(RuleName==""){
        alert("规则名称不能为空!");
        $("#RuleName").focus();
        return false;
    }
    var PromotionStartDate=$.trim($("#PromotionStartDate").val());
    if(PromotionStartDate==""){
        alert("促销有效期开始时间不能为空!");
        $("#PromotionStartDate").focus();
        return false;
    }
    var PromotionEndDate=$.trim($("#PromotionEndDate").val());
    if(PromotionEndDate==""){
        alert("促销有效期结束时间不能为空!");
        $("#PromotionEndDate").focus();
        return false;
    }
    //开始日期不能早于今天
    if(ruleId==0){
        if(compareDate(cdate,PromotionStartDate)>0){
            alert("促销有效期开始日期不能早于今天!");
            $("#PromotionStartDate").focus();
            return false;
        }
    }

    if(compareDate(PromotionStartDate,PromotionEndDate)>0){
        alert("促销有效期结束日期不能早于开始日期!");
        $("#PromotionEndDate").focus();
        return false;
    }
    
    
    var isLimit = false;
    var isPredeterminedDays = false;
    var isContinuousDays = false;
	var array = getPromotionStrategy();
	for(var i = 0 ; i < array.length ; i++) {
		if("1"==array[i]) {
			isContinuousDays = true;
		} else if("2"==array[i]) {
			isPredeterminedDays = true;
		} else if("5"==array[i]) {
			isLimit = true;
		} else if("6"==array[i]) {
			isLimit = true;
		}
	}
	
	if(isLimit) {
	    //预订时间校验
		var StartDateLimit = $.trim($("#StartDateLimit").val());
        var EndDateLimit = $.trim($("#EndDateLimit").val());
        var StartHourLimit = $.trim($("#StartHourLimit").val());
        var StartMinuteLimit = $.trim($("#StartMinuteLimit").val());
        var EndHourLimit = $.trim($("#EndHourLimit").val());
        var EndMinuteLimit = $.trim($("#EndMinuteLimit").val());
        
        if(ruleId==0){
            if(compareDate(cdate,StartDateLimit)>0){
                alert("预订开始日期不能早于今天!");
                $("#StartDateLimit").focus();
                return false;
            }
        }
        if(compareDate(StartDateLimit,EndDateLimit)>0){
            alert("预订结束日期不能早于开始日期!");
            $("#EndDateLimit").focus();
            return false;
        }
        
        if(StartHourLimit > EndHourLimit || StartHourLimit < 0 || EndHourLimit > 36) {
            alert("预订小时的结束时间不能大于开始时间，开始时间不能小于0，结束时间不能大于36!");
            $("#StartHourLimit").focus();
            return false;
        }
        if(StartMinuteLimit < 0 || StartMinuteLimit > 59) {
            alert("预订开始分钟数必须大于0且小于59!");
            $("#StartMinuteLimit").focus();
            return false;
        }
        if(EndMinuteLimit < 0 || EndMinuteLimit > 59) {
            alert("预订结束分钟数必须大于0且小于59!");
            $("#EndMinuteLimit").focus();
            return false;
        }
	}
	
    var PromotionMethod = $("input[name='PromotionMethod']:checked").val();
    for(var i=1;i<=offerDetailsDivsCount;i++){
        var StartDate=$.trim($("#StartDate"+i).val());
        var EndDate=$.trim($("#EndDate"+i).val());
        var Amount=$.trim($("#Amount"+i).val());
        var CostAmount=$.trim($("#CostAmount"+i).val());
        var PriceFactor=$.trim($("#PriceFactor"+i).val());
        var CostFactor=$.trim($("#CostFactor"+i).val());
        var ContinuousDays=$.trim($("#ContinuousDays"+i).val());
        var PredeterminedDays=$.trim($("#PredeterminedDays"+i).val());
        //三个值同时为空，认为此条数据不要
        if(StartDate!=""||EndDate!=""||Amount!="") {
            if (StartDate == "") {
                alert("优惠详情开始时间不能为空!");
                $("#StartDate" + i).focus();
                return false;
            }
            if(compareDate(PromotionStartDate,StartDate)>0){
                alert("优惠详情开始时间不能早于促销有效期开始日期!");
                $("#StartDate" + i).focus();
                return false;
            }

            if (EndDate == "") {
                alert("优惠详情结束时间不能为空!");
                $("#EndDate" + i).focus();
                return false;
            }

            if(compareDate(EndDate,PromotionEndDate)>0){
                alert("促销有效期结束时间不能早于优惠详情结束日期!");
                $("#EndDate" + i).focus();
                return false;
            }

            if(compareDate(StartDate,EndDate)>0){
                alert("优惠详情结束日期不能早于开始日期!");
                $("#EndDate").focus();
                return false;
            }

            if ((Amount == "" || Number(Amount) <= 0) && PromotionMethod == 1) {
                alert("优惠详情金额不能为空且要大于零!");
                $("#Amount" + i).focus();
                return false;
            }
            
//            if ((CostAmount == "" || Number(CostAmount) <= 0) && PromotionMethod == 1) {
//                alert("优惠详情金额不能为空且要大于零!");
//                $("#CostAmount" + i).focus();
//                return false;
//            }
            if ((CostFactor == "" || Number(CostFactor) <= 0 || Number(CostFactor) > 100) && PromotionMethod == 2) {
                alert("优惠详情折扣不能为空且要大于零!");
                $("#CostFactor" + i).focus();
                return false;
            }
            
            if ((PriceFactor == "" || Number(PriceFactor) <= 0 || Number(PriceFactor) > 100) && PromotionMethod == 2) {
                alert("优惠详情折扣不能为空且要大于零!");
                $("#PriceFactor" + i).focus();
                return false;
            }
            
            if(isPredeterminedDays && (PredeterminedDays == "" || Number(PredeterminedDays) < 0) ) {
                alert("提前入住天数不能 小于0!");
                $("#PredeterminedDays" + i).focus();
                return false;
            }
            if(isContinuousDays && (ContinuousDays == "" || Number(ContinuousDays) < 1) ) {
                alert("连住天数不能 小于1!");
                $("#ContinuousDays" + i).focus();
                return false;
            }
        }
    }
    if($("#Campaigns").val() > 0){

    } else {
        alert("活动还没有选择");
        $("#Campaigns").focus();
        return false;
    }
    if($("input[name='Channel']:checked").length < 1){
        alert("渠道还没选择");
        $("input[name='Channel']").focus();
        return false;
    }

    return true;
}
function getDate(dateStr){
    return new Date(dateStr.replace("-", "/").replace("-", "/"));
}
function compareDate(time1,time2){
    var start = new Date(time1.replace("-", "/").replace("-", "/"));
    var end = new Date(time2.replace("-", "/").replace("-", "/"));
    if(start<end){
        return -1;
    }else if(start==end){
        return 0;
    }else if(start>end){
        return 1;
    }
}
function getLocaleDateString(){
    var myDate = new Date();
    //获取当前年
    var year=myDate.getFullYear();
    //获取当前月
    var month=myDate.getMonth()+1;
    //获取当前日
   var date=myDate.getDate();
   // var h=myDate.getHours();       //获取当前小时数(0-23)
   // var m=myDate.getMinutes();     //获取当前分钟数(0-59)
  //  var s=myDate.getSeconds();

    //var now=year+'-'+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);
    var now=year+'-'+p(month)+"-"+p(date);
    return now;
}
function p(s) {
    return s < 10 ? '0' + s: s;
}
function submitData(){
    var checkResult =checkData();
    if(checkResult){
      var data= aggregationData();

        $.ajax({
            url: "../prepaydiscount/saveRuleConfigure",
            type: "POST",
            contentType: "application/json",
            dataType: "json",
            data: data,//JSON.stringify(data),
            async: true,
            success: function(data) {
                ///var ss = JSON.stringify(data);
               // console.log("Data: " + data + "\nStatus: " + status);
                if(data.status=="0"){
                    alert("保存失败:"+data.message);
                }else{
                    $("#prepaydiscountruleconfigure").val(data.status);
                    $("#PrepayDiscountRuleId").val(data.status);
                    //设置不可修改项
                    if(data.data==null || data.data.length<1){
                        alert("保存可能失败!");
                        return;
                    }

                    //convertRuleData(data);
                    //直接跳转到列表页 : 
                    window.location.href = "PromotionRuleManage";
                }
            }
        });

    }//if
}

//策略ID列表，1：多天连住，2：提前预订，3：门店新客，4：携程新客，5:限时抢购,6:今夜特惠  如:1,2,3,4
function getPromotionStrategy(){
   // 根据促销类型，查找对应的促销策略
	var typeConfigure = $("#PrepayDiscountTypeConfigure").val();
    var strategy = typeMap.get(Number(typeConfigure));
	var array = strategy.split(",");
	return array;
}

function aggregationData(){
    var data="{";
    var ruleId=$("#prepaydiscountruleconfigure").val();
    data+='"prepayDiscountRuleConfigureId":'+Number(ruleId)+',';
    var RuleName=$.trim($("#RuleName").val());
    data+='"ruleName":"'+RuleName+'",';
    //var PrepayDiscountTypeConfigure=$("input[name='PrepayDiscountTypeConfigure']:checked").val();
    var PrepayDiscountTypeConfigure = $("#PrepayDiscountTypeConfigure").val();
    data+='"prepayDiscountTypeConfigureId":'+Number(PrepayDiscountTypeConfigure)+',';
    var PromotionStartDate=$.trim($("#PromotionStartDate").val());
    data+='"promotionStartDate":"'+PromotionStartDate+'",';
    var PromotionEndDate=$.trim($("#PromotionEndDate").val());
    data+='"promotionEndDate":"'+PromotionEndDate+'",';
    var PromotionUnit=$("input[name='PromotionUnit']:checked").val();
    data+='"promotionUnit":'+Number(PromotionUnit)+',';
    var PromotionMethod=$("input[name='PromotionMethod']:checked").val();
    data+='"promotionMethod":'+Number(PromotionMethod)+',';
    var WithOthersPromotion=$("input[name='WithOthersPromotion']:checked").val();
    data+='"withOthersPromotion":'+Number(WithOthersPromotion)+',';
    //如果促销类型不是“提前预定减价”，则设置默认提前0天
    if(PrepayDiscountTypeConfigure == 3){   	
    	var PredeterminedDays=$("#PredeterminedDays").val();
    	data+='"predeterminedDays":'+Number(PredeterminedDays)+',';
    }else{ 
    	var PredeterminedDays="0";
    	data+='"predeterminedDays":'+Number(PredeterminedDays)+',';
    }

    var week="";
    week+=getWeekSelectData("ModLimit",-1);
    week+=getWeekSelectData("TueLimit",-1);
    week+=getWeekSelectData("WedLimit",-1);
    week+=getWeekSelectData("ThuLimit",-1);
    week+=getWeekSelectData("FriLimit",-1);
    week+=getWeekSelectData("SatLimit",-1);
    week+=getWeekSelectData("SunLimit",-1);
    data+='"week":"'+week+'",';
    //优惠详情 s

    var isLimit = false;
    var isPredeterminedDays = false;
    var isContinuousDays = false;
	var array = getPromotionStrategy();
	for(var i = 0 ; i < array.length ; i++) {
		if("1"==array[i]) {
			isContinuousDays = true;
		} else if("2"==array[i]) {
			isPredeterminedDays = true;
		} else if("5"==array[i]) {
			isLimit = true;
		} else if("6"==array[i]) {
			isLimit = true;
		}
	}
	
	if(isLimit) {
		var StartDateLimit = $.trim($("#StartDateLimit").val());
        var EndDateLimit = $.trim($("#EndDateLimit").val());
        var StartHourLimit = $.trim($("#StartHourLimit").val());
        var StartMinuteLimit = $.trim($("#StartMinuteLimit").val());
        var EndHourLimit = $.trim($("#EndHourLimit").val());
        var EndMinuteLimit = $.trim($("#EndMinuteLimit").val());
        data+='"startDateLimit":"'+StartDateLimit+'",';
        data+='"endDateLimit":"'+EndDateLimit+'",';
        data+='"startHourLimit":'+Number(StartHourLimit)+',';        
        data+='"startMinuteLimit":'+Number(StartMinuteLimit)+',';        
        data+='"endHourLimit":'+Number(EndHourLimit)+',';        
        data+='"endMinuteLimit":'+Number(EndMinuteLimit)+',';        
	}
	
    data+='"prePayDiscountRuleDetails":[';
    for(var i=1;i<=offerDetailsDivsCount;i++) {
        var StartDate = $.trim($("#StartDate" + i).val());
        var EndDate = $.trim($("#EndDate" + i).val());
        var Amount = $.trim($("#Amount" + i).val());
        var CostAmount = $.trim($("#CostAmount" + i).val());
        var CostFactor = $.trim($("#CostFactor" + i).val());
        var PriceFactor = $.trim($("#PriceFactor" + i).val());
        var offerDetailId=$.trim($("#offerDetailId" + i).val());
        var week="";
        week+=getWeekSelectData("Mod",i);
        week+=getWeekSelectData("Tue",i);
        week+=getWeekSelectData("Wed",i);
        week+=getWeekSelectData("Thu",i);
        week+=getWeekSelectData("Fri",i);
        week+=getWeekSelectData("Sat",i);
        week+=getWeekSelectData("Sun",i);
        if(i==1){
            data+="{";
        }else{
            data+=",{";
        }
        data+='"offerDetailId":'+Number(offerDetailId)+',';
        if(PromotionMethod == 1) {
        	data+='"amount":'+Number(Amount)+',';
        	data+='"costAmount":'+Number(CostAmount)+',';
        }
        if(PromotionMethod == 2) {
        	data+='"costFactor":'+Number(CostFactor) / 100+',';
        	data+='"priceFactor":'+Number(PriceFactor) / 100+',';
        }
        if(isContinuousDays) {
            var ContinuousDays = $.trim($("#ContinuousDays" + i).val());
        	data+='"continuousDays":'+Number(ContinuousDays) +',';
        }
        if(isPredeterminedDays) {
            var PredeterminedDays = $.trim($("#PredeterminedDays" + i).val());
        	data+='"predeterminedDays":'+Number(PredeterminedDays) +',';
        }

        data+='"startDate":"'+StartDate+'",';
        data+='"endDate":"'+EndDate+'",';
        data+='"week":"'+week+'"';

        data+="}";
    }
    data+='],';
    //优惠详情 e
    var eid = $("#loginID").text();
    data+='"eid":"' + eid + '",';
    var Channel='';
    $("input[name='Channel']:checked").each(function(){
    	Channel += $(this).val() + ',';
      });
    data+='"saleChannel":"'+Channel+'",';
    data+='"roomIdList":"'+$("#roomIdList").val()+'",';
    data+='"prepayCampaignId":"'+$("#Campaigns option:selected").val()+'"';
    data+="}";
    console.log(data);
    return data;//JSON.stringify(data);
}

function getWeekSelectData(week,i){
	if(i == -1) {
	    if ($("#"+week).is(':checked')) {
	        return "1";
	    }else{
	        return "0";
	    }
	} else {
	    if ($("#"+week + i).is(':checked')) {
	        return "1";
	    }else{
	        return "0";
	    }
	}
}

function setWeekSelectData(week,i,value){
	if(value == -1) {
		$("#"+week).attr("checked", true);
	} else if(value==1){
        $("#"+week + i).attr("checked", true);
    }else{
        $("#"+week + i).attr("checked", false);
    }
}

function queryRuleData(id){
    $.ajax({
        url: "../prepaydiscount/queryRuleConfigure?ruleId="+id,
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: null,
        async: false,
        success: function(data) {
            //console.log("Data: " + data + "\nStatus: " + status);
            //JSON.parse(data) 转json对象
            console.log("Data: " + JSON.stringify(data) );
            if(data.status=="0"){
                alert("查询失败:"+data.message);
            }else{
                //var ruleData = JSON.stringify(data);
                if(data.data==null || data.data.length<1){
                    alert("没有查询到数据");
                    return;
                }
                convertRuleData(data);
            }
        }
    });
}

function queryRuleLogData(id){
    $.ajax({
        url: "../prepaydiscount/queryRuleConfigureLog?logId="+id,
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: null,
        async: false,
        success: function(data) {
            //console.log("Data: " + data + "\nStatus: " + status);
            //JSON.parse(data) 转json对象
            console.log("Data: " + JSON.stringify(data) );
            if(data.status=="0"){
                alert("查询失败:"+data.message);
            }else{
                //var ruleData = JSON.stringify(data);
                if(data.data==null || data.data.length<1){
                    alert("没有查询到数据");
                    return;
                }
                convertRuleData(data);
                $("#PrepayDiscountRuleId").val(data.data[0].prepayDiscountRuleConfigureId);
            }
        }
    });
}

//售卖渠道在该页面已经删除
/*
function selectChannel(channel, saleChannel){
	var selectItem = 0; 
	if( saleChannel != '' && saleChannel != null) {
		var array = saleChannel.split(",");
	    var items=$("input[name='Channel']");
	    items.each(function(){
	    	var isCheck = false;
			for(var i = 0 ; i < array.length ; i++) {
				if($(this).val()==array[i]) {
					isCheck = true;
					break;
				}
			}
			if(isCheck){
				$(this).attr("disabled",false);
			    $(this).attr("readonly", true);
				$(this).attr("checked","checked");
			}else{
				$(this).attr("disabled",true);
			}
	    });

	} else {
		if(channel == 1 ) {
			selectItem = 2;
		} else if(channel == 2 ) {
			selectItem = 6;
		} else if(channel == 3 ) {
			selectItem = 9;
		} else if(channel == 4 ) {
			selectItem = 18;
		}
		
	    var items=$("input[name='Channel']");
	    items.each(function(){
	        if($(this).val()==channel){
	            $(this).attr("disabled",false);
	            $(this).attr("checked","checked");
	        }else{
	            $(this).attr("disabled",true);
	        }
	    });
	}
}*/

function convertRuleData(data){
    //清理行
    $("#offerDetailId1").val("");
    $("#StartDate1").val("");
    $("#EndDate1").val("");
    $("#Amount1").val("");
    $("#CostAmount1").val("");
    $("#CostFactor1").val("");
    $("#PriceFactor1").val("");
    var weekstr="1111111";
    setWeekSelectData("Mod",1,weekstr.substr(0,1));
    setWeekSelectData("Tue",1,weekstr.substr(1,1));
    setWeekSelectData("Wed",1,weekstr.substr(2,1));
    setWeekSelectData("Thu",1,weekstr.substr(3,1));
    setWeekSelectData("Fri",1,weekstr.substr(4,1));
    setWeekSelectData("Sat",1,weekstr.substr(5,1));
    setWeekSelectData("Sun",1,weekstr.substr(6,1));

//    for(var i=2;i<=offerDetailsDivsCount;i++) {
//        var obj=$("#offerDetailsDiv"+i).remove();
//    }
    offerDetailsDivsCount=0;//优惠详情行数据，默认0行
    //

    var ruleData =data.data[0];
    $("#RuleName").val(ruleData.ruleName);
   // $("input[type='radio'][name='PrepayDiscountTypeConfigure'][value='"+ruleData.prepayDiscountTypeConfigureId+"']").attr("checked", "checked");
    $("#PrepayDiscountTypeConfigure").find("option[value="+ruleData.prepayDiscountTypeConfigureId+"]").prop("selected",true);
    $("#Campaigns").find("option[value="+ruleData.prepayCampaignId+"]").prop("selected",true);
    $("#PromotionStartDate").val(ruleData.promotionStartDate);
    $("#PromotionEndDate").val(ruleData.promotionEndDate);

    
    var isLimit = false;
    var isPredeterminedDays = false;
    var isContinuousDays = false;
	var array = getPromotionStrategy();
	for(var i = 0 ; i < array.length ; i++) {
		if("1"==array[i]) {
			isContinuousDays = true;
		} else if("2"==array[i]) {
			isPredeterminedDays = true;
		} else if("5"==array[i]) {
			isLimit = true;
		} else if("6"==array[i]) {
			isLimit = true;
		}
	}
	
	if(isLimit) {
	    $("#StartDateLimit").val(ruleData.startDateLimit);
	    $("#StartHourLimit").val(ruleData.startHourLimit);
	    $("#StartMinuteLimit").val(ruleData.startMinuteLimit);
	    $("#EndDateLimit").val(ruleData.endDateLimit);
	    $("#EndHourLimit").val(ruleData.endHourLimit);
	    $("#EndMinuteLimit").val(ruleData.endMinuteLimit); 
	    
        setWeekSelectData("ModLimit", -1,ruleData.week.substr(0,1));
        setWeekSelectData("TueLimit", -1,ruleData.week.substr(1,1));
        setWeekSelectData("WedLimit", -1,ruleData.week.substr(2,1));
        setWeekSelectData("ThuLimit", -1,ruleData.week.substr(3,1));
        setWeekSelectData("FriLimit", -1,ruleData.week.substr(4,1));
        setWeekSelectData("SatLimit", -1,ruleData.week.substr(5,1));
        setWeekSelectData("SunLimit", -1,ruleData.week.substr(6,1));
	}

    $("input[type='radio'][name='PromotionUnit'][value='"+ruleData.promotionUnit+"']").attr("checked", "checked");
    
    $("input[type='radio'][name='WithOthersPromotion'][value='"+ruleData.withOthersPromotion+"']").attr("checked", "checked");
    $("#PredeterminedDays").val(ruleData.predeterminedDays);
    
    var channelArray = ruleData.saleChannel.split(',');
    for(var i = 0 ; i < channelArray.length; i++) {
    	if(Number(channelArray[i]) > 1) {
    		$("input[type='checkbox'][name='Channel'][value='"+channelArray[i]+"']").attr("checked", "checked");
    	}
    }
    
    
    
    $("input[type='radio'][name='PromotionMethod'][value='"+ ruleData.promotionMethod +"']").attr("checked", "checked");
    var promotionMethodItems=$("input[name='PromotionMethod']");
    promotionMethodItems.each(function(){
		if($(this).val()==ruleData.promotionMethod) {
			$(this).attr("disabled",false);
			$(this).attr("checked","checked");
		} else {
			$(this).attr("disabled",true);
		}
    });

    //优惠详情
    if(ruleData.prePayDiscountRuleDetails!=null&&ruleData.prePayDiscountRuleDetails.length>0){
        for(var i=1;i<=ruleData.prePayDiscountRuleDetails.length;i++){
            addOfferDetailRow();
            
            var detail=ruleData.prePayDiscountRuleDetails[i-1];
            $("#offerDetailId" + i).val(detail.offerDetailId);
            $("#StartDate" + i).val(detail.startDate);
            $("#EndDate" + i).val(detail.endDate);
            if(ruleData.promotionMethod == 1) {
            	$("#detailPriceDiv" + i).hide();
                $("#Amount" + i).val(detail.amount);
                $("#CostAmount" + i).val(detail.costAmount);
            }
            if(ruleData.promotionMethod == 2) {
            	$("#detailFactorDiv" + i).hide();
                $("#CostFactor" + i).val(detail.costFactor * 100);
                $("#PriceFactor" + i).val(detail.priceFactor * 100);
            }

            if(isContinuousDays) {
                $("#ContinuousDays" + i).val(detail.continuousDays);
            }
            if(isPredeterminedDays) {
                $("#PredeterminedDays" + i).val(detail.predeterminedDays);
            }
            
            var week=detail.week;
            setWeekSelectData("Mod",i,week.substr(0,1));
            setWeekSelectData("Tue",i,week.substr(1,1));
            setWeekSelectData("Wed",i,week.substr(2,1));
            setWeekSelectData("Thu",i,week.substr(3,1));
            setWeekSelectData("Fri",i,week.substr(4,1));
            setWeekSelectData("Sat",i,week.substr(5,1));
            setWeekSelectData("Sun",i,week.substr(6,1));
            
            //$("#offerDetailId" + i).val(offerDetailsDivsCount);
        }
    }

    //设置不可修改项
    //selectPrepayDiscountTypeConfigure(ruleData.prepayDiscountTypeConfigureId);
    //售卖渠道在该页面已经删除
    //selectChannel(ruleData.channel, ruleData.saleChannel);
    //注：select不支持readonly属性
    $("#PrepayDiscountTypeConfigure").attr("disabled","disabled");
    $("#Campaigns").attr("disabled","disabled");
    $("#PromotionStartDate").attr("readonly", true);
    $("#PromotionEndDate").attr("readonly", true);
    $("#PromotionStartDate").removeAttr("onclick");
    $("#PromotionEndDate").removeAttr("onclick");
    
    //getTagsByStatusAndTypeId(ruleData.tagId);
    getCampaignsByStatusAndTypeId(ruleData.prepayCampaignId);
}

function getTagsByStatusAndTypeId(tagId){
	//var PrepayDiscountTypeConfigure=$("input[name='PrepayDiscountTypeConfigure']:checked").val();
	var PrepayDiscountTypeConfigure = $("#PrepayDiscountTypeConfigure").val();

    $.ajax({
        url: "../prepaydiscount/getTagsByStatusAndTypeId?isDel=false&typeId="+ PrepayDiscountTypeConfigure,
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: null,
        async: true,
        success: function(data) {
            //console.log("Data: " + data + "\nStatus: " + status);
            //JSON.parse(data) 转json对象
            console.log("Data: " + JSON.stringify(data) );
            if(data.status=="0"){
                alert("查询失败:"+data.message);
            }else{
            	$("#Tags").empty();
            	$("#TagDesc").val("");
                //var ruleData = JSON.stringify(data);
                if(data.data==null || data.data.length<1){
                    alert("请先创建标签");
                    return;
                }
                for(var i=0;i<data.data.length;i++) {
                	var tag = data.data[i];
                	$("#Tags").append("<option value='"+tag.prepayDiscountTagID+"'>" +tag.name+ "</option>");
                	if(tag.prepayDiscountTagID == tagId) {
                		$("#TagDesc").val(tag.description);
                	}
                }
                if(tagId > 0) {
                	$("#Tags").val(tagId);
                } else {
                	$("#Tags").val("");
                }
            }
        }
    });
}


//junyin
function getCampaignsByStatusAndTypeId(campaignId){
   // var PrepayDiscountTypeConfigure=$("input[name='PrepayDiscountTypeConfigure']:checked").val();
	//根据PrepayDiscountTypeConfigureId查询对应的活动，然后初始化活动下拉列表
	var PrepayDiscountTypeConfigure = $("#PrepayDiscountTypeConfigure").val();

    $.ajax({
        url: "../prepaydiscount/getCampaignsByStatusAndTypeId?isDel=false&typeId="+ PrepayDiscountTypeConfigure,
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: null,
        async: true,
        success: function(data) {
            //console.log("Data: " + data + "\nStatus: " + status);
            //JSON.parse(data) 转json对象
        	//console.log("Data: " + JSON.stringify(data) );
            if(data.status=="0"){
                alert("查询失败:"+data.message);
            }else{
                $("#Campaigns").empty();
                //var ruleData = JSON.stringify(data);
                if(data.data==null || data.data.length<1){
                    alert("请先创建活动");
                    return;
                }
                for(var i=0;i<data.data.length;i++) {
                    var campaign = data.data[i];
                    $("#Campaigns").append("<option value='"+campaign.prepayCampaignID+"'>" +campaign.prepayCampaignName+ "</option>");
                }
                if(campaignId > 0) {
                    $("#Campaigns").val(campaignId);
                } else {
                   // $("#Campaigns").val("");
                }
            }
        }
    });
}

function getTagById(){
	var id = $("#Tags").val();
    $.ajax({
        url: "../prepaydiscount/getTagById?id="+ id,
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: null,
        async: true,
        success: function(data) {
            //console.log("Data: " + data + "\nStatus: " + status);
            //JSON.parse(data) 转json对象
            console.log("Data: " + JSON.stringify(data) );
            if(data.status=="0"){
                alert("查询失败:"+data.message);
            }else{
                //var ruleData = JSON.stringify(data);
                if(data.data==null || data.data.length<1){
                    alert("请先创建标签");
                    return;
                } else {
                	$("#TagDesc").val(data.data[0].description);
                }
            }
        }
    });
}

//function getCampaignById() {
//    var id = $("#Campaigns").val();
//    $.ajax({
//        url: "../prepaydiscount/getCampaignById?id=" + id,
//        type: "POST",
//        contentType: "application/json",
//        dataType: "json",
//        data: null,
//        async: true,
//        success: function (data) {
//            //console.log("Data: " + data + "\nStatus: " + status);
//            //JSON.parse(data) 转json对象
//            console.log("Data: " + JSON.stringify(data));
//            if (data.status == "0") {
//                alert("查询失败:" + data.message);
//            } else {
//                //var ruleData = JSON.stringify(data);
//                if (data.data == null || data.data.length < 1) {
//                    alert("请先创建活动");
//                    return;
//                } else {
//                    $("#PrepayCampaignName").val(data.data[0].prepayCampaignName);
//                }
//            }
//        }
//    });
//}