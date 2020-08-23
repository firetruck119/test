(function () {
    var getData = window["getData"] = {
        data: window["data"],
        //从后台获取id列表，并生成datalist
        getIDList: function () {
            $.ajax({
                url: "/getBatchIdList",
                type: "POST",
                contentType: "application/json",
                dataType: "json",
                async: false,
                success: function (e) {
                    var list=[];
                    list=list.concat(e);
                    if (list != null) {
                        var html = '';
                        for (var valueIndex = 0; valueIndex < list.length; valueIndex++) {
                            var value = list[valueIndex];
                            html += '<option value="';
                            html += value;
                            html += '">';
                        }
                        $('#txtBatchId').html(html)
                    }
                }
            });
        },
        //从后台读取数据
        geteDataFromDB: function (url, id) {
            $.ajax({
                url: url,
                type: "get",
                async: false,
                data: {'batchId': id},
                dataType: "json",
                cache: false,
                success: function (e) {
                    console.log(e)
                    getData.dataToDataList(e['datalist']);
                    getData.dataToImage(e['imagelist']);
                    var list = {};
                    var dataObj = e['datalist'];
                    for (var temp in dataObj) {
                        if (isTrue(dataObj[temp])) {
                            var funlist = data.datalist[temp].calList;
                            for (var key in funlist) {
                                if (dataObj[key] == null) {
                                    list[key] = funlist[key]
                                }
                            }
                        }
                    }
                    data.datacalculate({calList: list},true)
                    data.listtoform();
                }
            })
        },

        //将数据对象填充到现有的数据对象
        dataToDataList: function (e) {
            for (var key in e) {
                if(String(e[key])!='null') {
                    var temp = new dataType(key, e[key]);
                    temp.color = 'yellow';
                    if (data.datalist[key] != null && data.datalist[key]!=' ')
                        data.datalist[key].changeValueAndColor(e[key], 'yellow');
                    else
                        data.datalist[key] = temp;
                }
            }
        },
        //将二进制图片流加载进img
        dataToImage: function (e) {
            if (e != {})
                for (var key in e) {
                    var temp = e[key];
                    var img=$("img[name= '" + key + "']")[0];
                    if(!img)
                        continue;
                    $("img[name= '" + key + "']")[0].src = ' ';
                    $("img[name= '" + key + "']")[0].src = '/pdf/getImg?filename='+temp['inputvalue']+'&tempid='+Math.random();
                    if ($('input[name=tu_' + key + ']')[0]){
                        $('input[name=tu_' + key + ']').val(temp['inputvalue']);
                    } else
                        $('form').append('<input name="tu_' + key + '" type="hidden" value="' + temp['inputvalue'] + '"/>');
                    $('input[name=' + key + ']').val('');
                }
        },
    };
    var data = window["data"] = {
        datalist: {},
        imglist: {},
        calculateFunction: {},

        changeValue: function (e) {
            var obj = this.datalist[e.name];
            obj.value = e.value;
            obj.color = 'white';
            this.datacalculate(this.datalist[e.name]);
            this.listtoform();
        },

        datacalculate: function (e,isGetByDB) {
            var calList;
            var calObjList = {};
            calList = e.calList;
            for (var temp in this.datalist) {
                var o = this.datalist[temp];
                var val = parseFloat(o.value);
                val = (String(val) != 'NaN') ? val : undefined;
                if ((o.value != "" && (new String(val) != o.value))) {
                    val = o.value;
                    eval.call(temp, 'var ' + temp + ' = "' + o.value + '"');
                } else
                    eval.call(temp, 'var ' + temp + ' = ' + val);
            }
            f(calList);
            function f(calList) {
                var list = {};
                for (var key in calList) {
                    var fun = calList[key];
                    if(fun==null){
                        continue;
                    }
                    // if((function(){
                    //     for(var a in data.datalist[key].fatherValue)
                    //         if((!isTrue(eval(a))||String(data.datalist[a])==' ') && data.datalist[a].type!='SELECT')
                    //             return true
                    // })())continue;
                    var temp;
                    if (typeof fun == 'string')
                        eval(  'temp =' + fun)
                    else if (typeof fun == 'function'){
                        temp=fun()
                    }
                    var o = data.datalist[key];
                    if (['NaN', 'undefined', 'null'].indexOf(String(temp)) < 0 ) {
                        if (String(temp) != ' '){
                            o.color = 'grey';
                            o.value = temp;
                            eval(key+'=temp');
                        }
                        else if (o.color != 'white')
                            o.color = 'white';
                    }else{
                        continue;
                    }
                    if (isGetByDB) {
                        for (var e in data.datalist[key].calList) {
                            if (data.datalist[e].color == 'yellow') {
                                continue;
                            }
                            list[e] = data.datalist[key].calList[e]
                        }
                    } else {
                        list = $.extend(list, data.datalist[key].calList)
                    }
                }
                if (!$.isEmptyObject(list)) {
                    f(list)
                }
            }
        },
        //将表单文本数据添加入数组对象
        formtolist: function () {
            var inputlist = $('input[type=text],select')
            $.each(inputlist, function (i, val) {
                if (data.datalist[i])
                    return true;
                if (val.name == 'sjht')
                    return true;
                data.datalist[val.name];
                var value;
                if (val.value == "" && $(val).attr('definevalue')) {
                    value = $(val).attr('definevalue');
                    val.value = value;
                } else
                    value = val.value;
                var temp = new dataType(val.name, value, val.tagName,val);
                data.datalist[val.name] = temp;
            })
        },

        //将数组对象写入表单
        listtoform: function () {
            console.log(2)
            for (var data in this.datalist) {
                var temp = this.datalist[data];
                if (temp.value != null) {
                    var s = String(temp.value);
                    if ((s.indexOf('NaN') < 0
                            && s.indexOf('undefined') < 0)
                        ||(temp.type=='SELECT')) {
                        var e = $(temp.type + '[name="' + temp.name + '"]');
                        e.val(String(temp.value)!=' '?getString(temp.value):'');
                        e.css('background-color', temp.color);
                    }
                }
            }
        },

        clear: function () {
            for (var key in this.datalist) {
                this.datalist[key].value = "";
                this.datalist[key].color = "white";
            }
            $('img[name]').attr('src', '');
            $('form')[0].reset();
            $('input[type=hidden]').remove();
            this.listtoform();
        },
        isinit:true,
        init: function (dataf) {
            this.clear();
            data.formtolist();
            if (dataf != null) {
                data.calculateFunction = dataf;
                var list = {};
                for (var key in dataf) {
                    var cal = dataf[key].toString();
                    var have = false;
                    for (var temp in this.datalist) {
                        var obj = this.datalist[temp].calList;
                        if (cal.indexOf(' ' + temp + ' ') > -1) {
                            obj[key] = dataf[key];
                            data.datalist[key].fatherValue[temp]=1
                            have = true;
                        }
                    }
                    if (!have) {
                        list[key] = dataf[key];
                    }
                }
                this.datacalculate({calList: list});
                this.listtoform();
            }
            if(this.isinit){
                getData.getIDList();
                $('input[type=text],select').change(function () {
                    if (this.name == 'sjht')
                        return;
                    data.changeValue(this);
                })
                $('input[type=reset]').click(function () {
                    data.clear();
                    data.listtoform();
                    data.init(data.calculateFunction);
                    return false;
                })
                $('input[type=text]').keydown(function (e) {
                    if(e.keyCode==32)
                        return false;
                })
                this.isinit=!this.isinit;
            }
        },
    };
}())


function dataType(name, value, type,$element) {
    this.name = name;
    this.value = value;
    this.color = 'white';
    this.fatherValue={};
    this.calList = {};
    this.type = type;
    this.$element=$element;
    this.changeValueAndColor = function (v, c) {
        this.value = v;
        this.color = c;
    }
}

function janyan(URL) {
    var dataJson = $("form").serialize();
    dataJson["check"] = true;
    $.ajax({
        url: URL,
        type: "post",
        data: dataJson,
        async: false,
        dataType: "json",
        cache: false,
        success: function (data) {
            console.log(data)
            Object.keys(data).forEach(function (id) {
                $("#" + id).text(data[id]);
            })
        }
    })
    return false;
}

function getString(v) {
    if (typeof v =='string')
        return v;
    var s = 3;
    while (v.toFixed(s)[v.toFixed(s).length-1]==0&&--s){
    }
    return v.toFixed(s);
}

function isCheck(t) {
    var e = $('input[name=check]');
    if (e.length == 0) {
        $('form').append('<input name="check" type="hidden"/>');
    }
    e = $('input[name=check]');
    e.val(t);
}

function isTrue(value) {
    var v= String(value);
    if(['null','undefined',''].indexOf(v)>-1){
        return false;
    }
    return true;
}
function getTable(tablename,tableSy){
    if(! window['model'] )window['model']={};
    var temp=tablename?tablename:tableSy;
    if(! model[temp] )model[temp]={};
    ajaxFirstTable(tablename,tableSy);
    if(!tablename)
        return ;
    var $select=$("select[name="+tablename+"]");
    $select.change((e)=>{
        var $element=$(e.target);
        var val=$element.val();
        var d=model[tablename][val];
        data.datalist[tablename].value=val;
        for(var key in d){
            var $e=$("[name="+key+"]");
            if($e.length>0 && !$e.attr("undb")){
                data.datalist[key].value=parseFloat(d[key])==d[key]?parseFloat(d[key]):d[key];
                data.changeValue(data.datalist[key])
            }
        }
    })
}
function getMultilevelTable(first,second,dblist){
    if(! window['model'] )window['model']={};
    if(! model[first] )model[first]={};
    for(var i in dblist){
        ajaxMultilevelTable(first,second,dblist[dblist.length-1-i]);
    }
    var $select=$("select[name="+first+"]");
    var $e=$("[name="+second+"]");
    $select.prepend('<option value="" style="display: none"></option>');
    $select.change((e)=>{
        var $element=$(e.target);
        var val=$element.val();
        var ds= model[first][val];
        $e.empty();
        $e.prepend('<option value="" style="display: none"></option>');
        for(var key in ds){
            $e.append('<option value="'+key+'" >'+key+'</option>');
        }
    })
    $e.change((e)=>{
        var $element=$(e.target);
        var val=$element.val();
        data.datalist[second].value=val;
        var d=model[first][$select.val()][val];
        for(var key in d){
            var $e=$("[name="+key+"]");
            if($e.length>0 && !$e.attr("undb")){
                data.datalist[key].value=parseFloat(d[key])==d[key]?parseFloat(d[key]):d[key];
                data.changeValue(data.datalist[key])
            }
        }
    })
}
function ajaxMultilevelTable(first,second,dbname){
    var datas = [];
    var dataobjs={};
    axios.get('/dataTable/getTableByName/' +dbname).then(
        (e) => {
            var data = e.data.columnsJSON;
            var rowData = e.data.rowsJSON;
            var name=e.data.tablename;
            $("select[name="+first+"]").append('<option value="'+name+'" >'+name+'</option>');
            rowData = JSON.parse(rowData);
            rowData = (() => {
                for (i in rowData) {
                    datas.push(rowData[i])
                    if(!model[first][name]) model[first][name]=dataobjs;
                    dataobjs[rowData[i].key]=rowData[i];
                }
            })(rowData)
        }
    ).catch(
        (e) => {
            console.log(e)
        }
    )
}

function ajaxFirstTable(tablename,name){
    var datas = [];
    axios.get('/dataTable/getTableByName/' +name).then(
        (e) => {
            var columnData = e.data.columnsJSON;
            var rowData = e.data.rowsJSON;
            rowData = JSON.parse(rowData);
            rowData = (() => {
                for (i in rowData) {
                    datas.push(rowData[i]);
                    var temp=tablename?tablename:name;
                    model[temp][rowData[i].key]=rowData[i];
                }
            })(rowData)
            if(!tablename)
                return ;
            $("select[name="+tablename+"]").prepend('<option value="" style="display: none"></option>');
            for(var a=0;a<datas.length;a++ ){
                $("select[name="+tablename+"]").append('<option value="'+datas[a].key+'" >'+datas[a].key+'</option>');
            }
        }
    ).catch(
        (e) => {
            console.log(e)
        }
    )
}

