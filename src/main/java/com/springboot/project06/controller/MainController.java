package com.springboot.project06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 16. 9. 4.
 */
@Controller
public class MainController {

    @RequestMapping("/test")
    public String index(){
        return "helloPage";
    }

    @RequestMapping("/mainPage")
    public String mainPage(){
        return "views/mainPage";
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

        model.addAttribute("name", list);

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
}
