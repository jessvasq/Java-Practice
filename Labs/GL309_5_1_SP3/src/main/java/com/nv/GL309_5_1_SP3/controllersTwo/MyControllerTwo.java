package com.nv.GL309_5_1_SP3.controllersTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerTwo {
    @GetMapping({"login"})
    public String showIndex(){
        return "index";
    }


}
