package com.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Start {
    @RequestMapping(value="/app" ,method =RequestMethod.GET )

    public String start(){
        System.out.println("start");
        return "Html/Login";
    }
    @RequestMapping(value = "/indext",method = RequestMethod.GET)

    public String index(){
        System.out.println("登录成功");
        return "Html/indext";
    }

}
