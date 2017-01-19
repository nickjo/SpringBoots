package com.springboot.project06.controller;

import com.springboot.project06.dao.BoardDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 16. 9. 4.
 */
@Controller
//@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private BoardDao boardDao;

    @RequestMapping("/test")
    public String index(){
        return "helloPage";
    }

    @RequestMapping("/mainPage")
    public String mainPage(){
        return "views/main/mainPage";
    }

    @RequestMapping("/main")
    public String indexMethod(){
        return "views/mainPage";
    }

    @RequestMapping("/selectMainPageData")
    public void selectMainPage(Model model){
        model.addAttribute("board", boardDao.findAll());

        log.info("###selectMainPage: " + model.toString());
    }

    @RequestMapping("/board")
    public String board(Model model){
        List<String> list = new ArrayList<>();

        list.add("n1");
        list.add("n2");
        list.add("n3");
        list.add("n4");
        list.add("n5");
        list.add("n6");
        list.add("n7");
        list.add("n8");
        list.add("n9");
        list.add("n10");
        list.add("n11");
        list.add("n12");
        list.add("n13");
        list.add("n14");
        list.add("n15");

        model.addAttribute("board", list);

        return "views/board/board";
    }

    @RequestMapping("/daumeditor")
    public String daumeditor(){
        return "daumeditor/editor";
    }

    @RequestMapping("/board_insert")
    public String board_insert(){
        return "views/board/board_insert";
    }

    @RequestMapping("/board_insert_1")
    public String board_insert_1(){
        return "board_insert";
    }

    @RequestMapping("/testPage")
    public String cssTestPage(){
        return "views/testPage";
    }
}
