package com.example.sjboard.service;

import com.example.sjboard.entity.Board;
import com.example.sjboard.entity.LargeCode;
import com.example.sjboard.entity.MiddleCode;
import com.example.sjboard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public void insertBoard(Board board) {
        boardMapper.insertBoard(board);
    }

    public List<Board> selectBoard() {
        return boardMapper.selectBoard();
    }

    public List<LargeCode> selectLageCode() {
        return boardMapper.selectLargeCode();
    }

    public List<MiddleCode> selectMiddleCode() {
        return boardMapper.selectMiddleCode();
    }
}
