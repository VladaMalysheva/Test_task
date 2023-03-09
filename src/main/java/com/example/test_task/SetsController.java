package com.example.test_task;


import com.example.test_task.data.KpacEntityDaoImpl;
import com.example.test_task.data.KpacRelationDaoImpl;
import com.example.test_task.data.KpacSetDaoImpl;
import com.example.test_task.data.daoInterfaces.KpacSetDAO;
import com.example.test_task.data.entities.KpacEntity;
import com.example.test_task.data.entities.KpacSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.time.LocalDate;

@Controller
@RequestMapping("/set")
public class SetsController {

    KpacSetDAO dao;

    @Autowired
    public SetsController(KpacSetDAO dao){
        this.dao=dao;
    }

    @RequestMapping("/sets")
    public String sets(Model model){
        model.addAttribute("sets", dao.getAllKpacSets());
        model.addAttribute("kpacSet", new KpacSet());
        return "sets";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("kpacSet") KpacSet kpacSet){

        dao.createKpacSet(kpacSet);
        return "redirect:/set/sets";
    }

    @RequestMapping("/delete/{id}")
    public String processForm(@PathVariable int id){

        dao.deleteKpacSet(id);
        return "redirect:/set/sets";
    }


}
