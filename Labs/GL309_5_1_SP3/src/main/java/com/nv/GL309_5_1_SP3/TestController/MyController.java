package com.nv.GL309_5_1_SP3.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {
    @RequestMapping({"/login"})
    public String showLogin(){
        return "inboxPage";
    }

    @RequestMapping("/")
    public String simpleMethod(){
        return "inboxPage";
    }

    @RequestMapping("/index")
    public String showIndex(){
        return "inboxPage";
    }
}
