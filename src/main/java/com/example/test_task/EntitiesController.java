package com.example.test_task;

import com.example.test_task.data.KpacEntityDaoImpl;
import com.example.test_task.data.KpacRelationDaoImpl;
import com.example.test_task.data.KpacSetDaoImpl;
import com.example.test_task.data.daoInterfaces.KpacEntityDAO;
import com.example.test_task.data.entities.KpacEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;

@Controller
@RequestMapping("/entity")
public class EntitiesController {

    KpacEntityDAO dao;

    @Autowired
    public EntitiesController(KpacEntityDAO dao){
        this.dao=dao;
    }


//    @RequestMapping("/showForm")
//    public String showForm(){
//
//
////        System.out.println(dao.getKpacEntityById(1));
////        System.out.println(setDao.getKpacSetById(1));
//        System.out.println(relationDao.getKpacRelationById(1));
//        return "helloworld-form";
//    }

    @RequestMapping("/kpacs")
    public String kpacs(Model model){

        model.addAttribute("kpacs", dao.getAllKpacEntities());
        model.addAttribute("kpacEntity", new KpacEntity());
        return "kpacs";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("kpacEntity") KpacEntity kpacEntity){

        kpacEntity.setCreationDate(Date.valueOf(LocalDate.now()));
        dao.createKpacEntity(kpacEntity);
        return "redirect:/entity/kpacs";
    }

    @RequestMapping ("/delete/{id}")
    public String deleteKpac(@PathVariable int id){
        dao.deleteKpacEntity(id);
        return "redirect:/entity/kpacs";
    }


}
