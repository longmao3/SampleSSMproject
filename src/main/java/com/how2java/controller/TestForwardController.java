package com.how2java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

import javax.xml.ws.RequestWrapper;

@Controller
public class TestForwardController {

    @RequestMapping("/test")
    public String test(){
        //最好是去进入另外一个路径，进入另外一个handler
        return "forward:/listCategory";
    }
}
