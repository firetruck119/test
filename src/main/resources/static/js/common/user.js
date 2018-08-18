/**
 * Created by chenjw on 2017/9/6.
 */

function headinit(){
    $.ajax(
        {
            url: "/getUserInfo",
            type: "post",
            async: true,
            dataType:'json',
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Test", "testheadervalue");
            },
            success: function (data) {
                $("#loginID").text(data.eid);
                $("#corp").text(data.corp);
            },
            error: function (error) {
                //alert(error);
            }
        }
    );
}

function logout(){
    var data = {
        corp: $("#corp").text()
    };

    $.ajax(
        {
            url: "/logout",
            type: "post",
            async: false,
            data: data,
            dateType: "json",
            success: function (responseData) {

                alert("用户已经登出");
                responseData = JSON.parse(responseData);

                var corp = $("#corp").text();
                if (corp == "C") {
                    window.location.href = responseData.cLogoutUrl;
                } else if (corp == "E") {
                    window.location.href = responseData.eLogoutUrl;
                } else if (corp == "Q") {
                    //head.logoutBack(responseData.qLogoutUrl, responseData.cLogoutUrl);
                    window.location.href = responseData.qLogoutUrl;
                }


            },
            error: function (error) {
                alert(error);
            }
        }
    );

    return false;
}

function OnShortcut()
{
    var sModuleCode=window.prompt("请输入需要跳转到的模块号:","");

    if(sModuleCode==null)
        return;
    else
    {
        if (isNaN(sModuleCode))
            window.alert("需要跳转到的模块号必须为一串数字");
        else
        {
            $.ajax(
                    {
                        url: "/redirection",
                        type: "post",
                        async: false,
                        data: "",
                        dateType: "json",
                        success: function (responseData) {
                            window.location.href = responseData + sModuleCode;
                            console.log('redirectURL', "responseData:" + responseData);
                        },
                        error: function (error) {
                            alert(error);
                        }
                    }
                );
        }
    }
}
