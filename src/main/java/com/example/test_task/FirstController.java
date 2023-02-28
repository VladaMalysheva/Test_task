package com.example.test_task;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class FirstController {
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


}
