package com.springboot.project06.controller;

import com.springboot.project06.dao.BoardDao;
import com.springboot.project06.domain.Board;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by nick on 16. 9. 25.
 */
@Controller
//@RestController
public class BoardController {

    private static final Logger log = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardDao boardDao;

    @RequestMapping(value = "/selectBoard", method = RequestMethod.GET)
    public String boardList(Model model){
        List<Board> boardList = null;

        try {
            boardList = boardDao.findAll();

            for(Board board : boardDao.findAll()){
                //log.info("###board.toString: " + board.toString());
            }

            model.addAttribute("board", boardDao.findAll());
        }catch (Exception e){
            e.getMessage();
        }
        return "views/board/board";

    }

    @RequestMapping(value = "/board_grid")
    public String selectBoardGrid(Model model){
        return "views/board/board_grid";
    }

    @RequestMapping(value = "/selectBoard_grid")
    public void selectBoard_gird(HttpServletRequest request, HttpServletResponse response){
        log.info("############selectBoard_grid#########");

        List<Board> boardList = null;

        try {
            boardList = boardDao.findAll();

            //response.

//            model.addAttribute("board", boardDao.findAll());
        }catch (Exception e){
            e.getMessage();
        }
    }

    @RequestMapping(value = "/selectBoard_json")
    public @ResponseBody Object getJson(){
        List<Board> jsonList = boardDao.findAll();

        return jsonList;
    }
}
