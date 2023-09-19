package com.example.sjboard.controller;

import com.example.sjboard.entity.Board;
import com.example.sjboard.entity.LargeCode;
import com.example.sjboard.entity.MiddleCode;
import com.example.sjboard.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping
@RestController
// 상수의 생성자 만듬
@RequiredArgsConstructor

public class BoardController {

    // 객체를 연결
    private final BoardService boardService;

    @GetMapping("/board")
    public List<Board> selectBoard(){
        return boardService.selectBoard();
    }

    @GetMapping("/large")
    public List<LargeCode> selectLargeCode(){
        return boardService.selectLageCode();
    }

    @GetMapping("/middle")
    public List<MiddleCode> selectMiddleCode(){
        return boardService.selectMiddleCode();
    }


    @PostMapping("/board")
    public void insert(Board board){
        boardService.insertBoard(board);
    }

}
