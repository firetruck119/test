/**
 * Created by tchu on 2017/12/15.
 */
var PrepayDiscountRuleConfigureId=0;//促销规则key

var typeMap = new Map();

function initData() {
    prepayDiscountTypeConfigureEvent(1);
    getTagsByStatusAndTypeId(0);
    $("#PrepayDiscountTypeConfigure").change(function(){
    	//PromotionTypeChange();
    	var selectItem = $(this).val();
    	prepayDiscountTypeConfigureEvent(selectItem);
    	getTagsByStatusAndTypeId(0);
    	
	});
    
    //获取传参,从“新建”、“编辑”跳转获得
    //PrepayDiscountRuleConfigureId = 0用于区别是新建还是编辑，编辑地址带参数，则其不为0
    var id = $.trim(getUrlParam("id"));
    if (id != null && id != "" && Number(id) > 0) {
        PrepayDiscountRuleConfigureId = id;
        queryCampaignData(id);
        $("#PrepayCampaignID").val(id);
    } else {
        PrepayDiscountRuleConfigureId = 0;
        // $("#PrepayDiscountRuleId").val("");
        getTagsByStatusAndTypeId(0);
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
//该函数无用
function selectSourceTypeConfigure(selectItem){
    var items=$("input[name='SourceType']");
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
        var StartDate=$.trim($("#StartDate").val());
        if(StartDate==""){
            alert("促销有效期开始时间不能为空!");
            return false;
        }
        if(ruleId==0){
            if(compareDate(cdate,StartDate)>0){
                alert("促销有效期开始日期不能早于今天!");
                return false;
            }
        }
        datestr=$("#StartDate").val();
        if($("#StartDate1").val()==""){
            $("#StartDate1").val(datestr);
        }
    }else if(type==2){
        var StartDate=$.trim($("#StartDate").val());
        var EndDate=$.trim($("#EndDate").val());
        if(EndDate==""){
            alert("促销有效期结束时间不能为空!");
            return false;
        }
        if(compareDate(StartDate,EndDate)>0){
            alert("促销有效期结束日期不能早于开始日期!");
            return false;
        }

        datestr=$("#EndDate").val();
        if($("#EndDate1").val()==""){
            $("#EndDate1").val(datestr);
        }
    }
}

/**
 * 根据不同的促销类型显示不同内容
 * @param selectItem
 */
function prepayDiscountTypeConfigureEvent(selectItem){
	//var typeMap = new Map();
	var strategy = typeMap.get(Number(selectItem));
	if(strategy == null) {
		return;
	}
	//策略ID列表，1：多天连住，2：提前预订，3：门店新客，4：携程新客，5:限时抢购,6:今夜特惠,7交叉用户特惠  如:1,2,3,4
	//这里添加代码，获取typeMap里对应selectItem的策略字符串，然后拆分
	var array = strategy.split(",");
	for(var i = 0 ; i < array.length ; i++) {
		if("7"==array[i]) {
		    $("#tdBuUserGroupTR").css("display","table-row");
		}
		else{
			$("#tdBuUserGroupTR").css("display","none");
		}
		
	}
	
	
	
    if(selectItem==1){
        $("#PredeterminedDayTR").css("display","none");
        $("#offerDetailsTR").css("display","table-row");
        $("#roomsTR").css("display","table-row");

        $("#userSelTR").css("display","none");
        $("#hotelRoomSelTR").css("display","none");
        $("#DiscountsConfigurationTR").css("display","none");
        $("#btnSubmit").attr("disabled",false);

    }else if(selectItem==2){
        $("#PredeterminedDayTR").css("display","none");
        $("#offerDetailsTR").css("display","table-row");
        $("#roomsTR").css("display","table-row");

        $("#userSelTR").css("display","none");
        $("#hotelRoomSelTR").css("display","none");
        $("#DiscountsConfigurationTR").css("display","none");
        $("#btnSubmit").attr("disabled",false);
    }else if(selectItem==3){
        $("#PredeterminedDayTR").css("display","table-row");
        $("#offerDetailsTR").css("display","table-row");
        $("#roomsTR").css("display","table-row");

        $("#userSelTR").css("display","none");
        $("#hotelRoomSelTR").css("display","none");
        $("#DiscountsConfigurationTR").css("display","none");
        $("#btnSubmit").attr("disabled",false);
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

}

function checkData(){
	//var PrepayDiscountTypeConfigure=$("input[name='PrepayDiscountTypeConfigure']:checked").val();
	var PrepayDiscountTypeConfigure = $("#PrepayDiscountTypeConfigure").val();
	
    var cdate=getLocaleDateString();
    var ruleId=$("#prepaydiscountruleconfigure").val();
    var PrepayCampaignName=$.trim($("#PrepayCampaignName").val());
    if(PrepayCampaignName==""){
        alert("活动名称不能为空!");
        $("#PrepayCampaignName").focus();
        return false;
    }
    //判断用户群是否为空（显示才判断）
    if($("#tdBuUserGroupTR").is(':visible')){
    	var userGroupItems=$("input[name='buUserGroup']:checked");
    	if(userGroupItems.length > 0){
    		
    	} else{
    		alert("用户群还没有选择!");
    		return false;
    	}
    	
    }
    var StartDate=$.trim($("#StartDate").val());
    if(StartDate==""){
        alert("活动有效期开始时间不能为空!");
        $("#StartDate").focus();
        return false;
    }
    var EndDate=$.trim($("#EndDate").val());
    if(EndDate==""){
        alert("活动有效期结束时间不能为空!");
        $("#EndDate").focus();
        return false;
    }
    //开始日期不能早于今天
    if(ruleId==0){
        if(compareDate(cdate,StartDate)>0){
            alert("活动有效期开始日期不能早于今天!");
            $("#StartDate").focus();
            return false;
        }
    }

    if(compareDate(StartDate,EndDate)>0){
        alert("活动有效期结束日期不能早于开始日期!");
        $("#EndDate").focus();
        return false;
    }

    if($("#Tags").val() > 0){

    } else {
        alert("标签还没有选择");
        $("#Tags").focus();
        return false;
    }
    
    //判断“售卖渠道”是否为空
    var items=$("input[name='cbSaleChannel']:checked");
    if(items.length > 0){
    	
    } else{
    	alert("售卖渠道还没有选择");
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
            url: "../prepaydiscount/saveCampaign",
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
                    $("#PrepayCampaignID").val(data.status);
                    if(data.data==null || data.data.length<1){
                        alert("保存可能失败!");
                        return;
                    }

                    //convertRuleData(data);
                    //直接跳转到列表页 : 
                    window.location.href = "PromotionCampaignManage";
                }
            }
        });

    }//if
}

function aggregationData(){
    var data="{";
    var PrepayCampaignID=$("#PrepayCampaignID").val();
    data+='"prepayCampaignID":'+Number(PrepayCampaignID)+',';
    var PrepayCampaignName=$.trim($("#PrepayCampaignName").val());
    data+='"prepayCampaignName":"'+PrepayCampaignName+'",';
    //var PrepayDiscountTypeConfigure=$("input[name='PrepayDiscountTypeConfigure']:checked").val();
    var PrepayDiscountTypeConfigure = $("#PrepayDiscountTypeConfigure").val();
    data+='"prepayDiscountTypeConfigureId":'+Number(PrepayDiscountTypeConfigure)+',';
    var SourceType=$("input[name='SourceType']:checked").val();
    data+='"sourceType":'+Number(SourceType)+',';
    var StartDate=$.trim($("#StartDate").val());
    data+='"startDate":"'+StartDate+'",';
    var EndDate=$.trim($("#EndDate").val());
    data+='"endDate":"'+EndDate+'",';
    var eid = $("#loginID").text();
    data+='"eid":"' + eid + '",';
    data+='"tagId":"'+$("#Tags option:selected").val()+'",';
    
    var saleChannel = getCheckedSaleChannel();
    data+='"saleChannel":"' + saleChannel +'",';
    var buUserGroupList = getCheckedBuUserGroup();
    data+='"buUserGroupList":' + buUserGroupList; //buUserGroupList
    data+="}";
    console.log(data);

    return data;//JSON.stringify(data);
}


//获取多选“用户群”,(注意判断，如果修改时选择相关“促销类型”，导致“用户群”被隐藏，那么原有用户群数据不能被上传)
function getCheckedBuUserGroup(){
	var checkedBuUserGroup = '[';
	//如果用户群被隐藏，传空“用户群”对象
	if($("#tdBuUserGroupTR").is(':visible')){
		var groups = document.getElementsByName("buUserGroup");
		var isFirst = true;
		for(k in groups){
			var propertyId = groups[k].value;
			//var name = groups[k].nextSibling.nodeValue;
			if(groups[k].checked && isFirst==true){
				checkedBuUserGroup += '{';
				checkedBuUserGroup += '"propertyId":"' + propertyId +'"';
				checkedBuUserGroup += '}';
				isFirst = false;
			}
			else if(groups[k].checked){
				checkedBuUserGroup += ',{';
				checkedBuUserGroup += '"propertyId":"' + propertyId +'"';
				checkedBuUserGroup += '}';
			}
		}
	}	
	checkedBuUserGroup += ']';
	return checkedBuUserGroup;
}
/*function getCheckedBuUserGroup(){
	var checkedBuUserGroup = "[";
	var groups = $("input:checkbox[name='buUserGroup']:checked").each()
	
}*/


//获取多选销售渠道
function getCheckedSaleChannel(){
	var checkedSaleChannel = "";
	var channels = document.getElementsByName("cbSaleChannel")
	var isFirst = true;
	for(k in channels){
		if(channels[k].checked && isFirst==true){
			checkedSaleChannel += channels[k].value;
			isFirst=false;
		}
		else if(channels[k].checked){
			checkedSaleChannel += "," + channels[k].value;
		}
	}
	return checkedSaleChannel;
}

function getWeekSelectData(week,i){
    if ($("#"+week + i).is(':checked')) {
        return "1";
    }else{
        return "0";
    }
}

function setWeekSelectData(week,i,value){
    if(value==1){
        $("#"+week + i).attr("checked", true);
    }else{
        $("#"+week + i).attr("checked", false);
    }
}

function queryCampaignData(id){
    $.ajax({
        url: "../prepaydiscount/queryCampaign?prepayCampaignId="+id,
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
                    alert("没有查询到数据");
                    return;
                }
                convertRuleData(data);
                $("#PrepayDiscountRuleId").val(data.data[0].prepayDiscountRuleConfigureId);
            }
        }
    });
}


function convertRuleData(data){
    //清理行
    $("#offerDetailId1").val("");
    $("#StartDate1").val("");
    $("#EndDate1").val("");
    $("#Amount1").val("");
    $("#CostFactor1").val("");
    $("#PriceFactor1").val("");

//    for(var i=2;i<=offerDetailsDivsCount;i++) {
//        var obj=$("#offerDetai	lsDiv"+i).remove();
//    }
    offerDetailsDivsCount=0;//优惠详情行数据，默认0行
    //

    var ruleData =data.data[0];
    $("#PrepayCampaignName").val(ruleData.prepayCampaignName);
    //$("input[type='radio'][name='PrepayDiscountTypeConfigure'][value='"+ruleData.prepayDiscountTypeConfigureId+"']").attr("checked", "checked");
    $("input[type='radio'][name='SourceType'][value='"+ruleData.sourceType+"']").attr("checked", "checked");
    $("#PrepayDiscountTypeConfigure").find("option[value="+ruleData.prepayDiscountTypeConfigureId+"]").prop("selected",true);
    $("#Tags").find("option[value="+ruleData.tagId+"]").prop("selected",true);
    $("#StartDate").val(ruleData.startDate);
    $("#EndDate").val(ruleData.endDate);
    prepayDiscountTypeConfigureEvent(ruleData.prepayDiscountTypeConfigureId);
    getSaleChannels(ruleData);
    getBuUserGroups(ruleData);
    
    //编辑时，如果活动关联了规则，则“促销类型”和“来源”不可修改
    if(ruleData.isNew == 0){
    	$("#PrepayDiscountTypeConfigure").attr("disabled","disabled");
    	var items = $("input[type='radio'][name='SourceType']");
    	items.each(function(){
    		$(this).attr("disabled", "disabled");
    	});	
    }
    
    //设置不可修改项（“编辑”时，时间可自定义修改）
    //selectPrepayDiscountTypeConfigure(ruleData.prepayDiscountTypeConfigureId);//以前radio用的
   // selectSourceTypeConfigure(ruleData.sourceType);  //以前radio用的
   /* $("#StartDate").attr("readonly", true);
    $("#EndDate").attr("readonly", true);
    $("#StartDate").removeAttr("onclick");
    $("#EndDate").removeAttr("onclick");
    */
    
    getTagsByStatusAndTypeId(ruleData.tagId);

}

//“编辑”->获取之前选中的用户群
function getBuUserGroups(data){
	var groups = data.buUserGroupList;
	for(var i=0; i<groups.length; i++){
		$("input[type='checkbox'][name='buUserGroup'][value='" +groups[i].propertyId + "']").attr("checked","checked");
	}
}

//“编辑”->获取之前选中的销售渠道
function getSaleChannels(data){
	var channels = data.saleChannel;
	var channelsArray = new Array();
	channelsArray = channels.split(",");
	for(var i=0; i<channelsArray.length; i++){
		 $("input[type='checkbox'][name='cbSaleChannel'][value='"+channelsArray[i]+"']").attr("checked", "checked");
	}
}

//根据促销类型修改
function getTagsByStatusAndTypeId(tagId){
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
                //jun
                if(tagId > 0) {
                	$("#Tags").val(tagId);
                } else {
                	//$("#Tags").val("");
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