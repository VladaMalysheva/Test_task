package com.example.test_task;

import com.example.test_task.data.KpacEntityDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class FirstController {

    KpacEntityDaoImpl dao;

    @Autowired
    public FirstController(KpacEntityDaoImpl dao){
        this.dao=dao;
    }

    @RequestMapping("/showForm")
    public String showForm(){


        System.out.println(dao.getKpacEntityById(1));
        return "helloworld-form";
    }


}
