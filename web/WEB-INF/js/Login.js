function checkform(){
    var id=document.getElementById("id");
    var password=document.getElementById("password");
    if(id.value==""){
         id.focus();
       return false;
    }
    if(password.value==""){
        password.focus();
        return false;
    }
    return true;
}
function login_fail(str){
    document.getElementById("login_result").innerHTML=str;
    setTimeout("login_clear()",3000);
}
function login_clear(){
    document.getElementById("login_result").innerHTML=" ";
}

function login(){
   if(!checkform()){
       console.log("false");
       return false;
   }

   console.log("use ajax")
    $.ajax({

        type:"POST",
        dataType:"text",
        url:getRootPath()+"/loginconfirm",
        data: $('#login_form').serialize(),
        contentType:"application/x-www-form-urlencoded",
        success:function(result){
            console.log(result);
            if(result=="success"){
                console.log(result);//打印服务端返
                console.log(getRootPath());

                console.log(getRootPath()+"/indext");
                window.location.replace(getRootPath()+"/indext");
            }
            if(result=="code_null"){
                login_fail("密码或账号不能为空");
            }
            if(result=="fail"){

                login_fail("密码或账号错误");


            }
        },
        error:function(){
            alert("请重试!!");
        }

    });
}

//js获取项目根路径,如： http://localhost:8083/uimcardprj
function getRootPath(){
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPaht);
}
