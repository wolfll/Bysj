package com.Spring.Controller;

import com.Spring.Model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value = "/loginconfirm",method = RequestMethod.POST)
    @ResponseBody
    public String Loginconfirm(UserModel user, Model model){
        if(user.getId().equals("admin")&&user.getPassword().equals("admin")){
            System.out.println("登录成功  :："+user.getId());
            model.addAttribute("name",user.getId());
            return "success";


        }else if(user.getId().equals(" ")||user.getPassword().equals(" ")){

            System.out.println("密码或账号为空");
            return "code_null";
        }else{
            System.out.println("登录失败");
            return "fail";
        }




    }
}
