package com.dbq.controller;

import com.dbq.aop.DemoAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by DBQ on 2017/3/28.
 */

@Controller
public class HelloController {

    @Autowired
    private DemoAnnotationService demoAnnotationService;

    @GetMapping("/test")
    public String test(Model model){
        demoAnnotationService.doSomething();
        model.addAttribute("html","Welcome to our <b>uniops</b> platform!");
        return "test";
    }
}
