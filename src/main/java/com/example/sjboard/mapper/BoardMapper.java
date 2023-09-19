package com.example.sjboard.mapper;

import com.example.sjboard.entity.Board;
import com.example.sjboard.entity.LargeCode;
import com.example.sjboard.entity.MiddleCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    void insertBoard(Board board);

    List<Board> selectBoard();

    List<LargeCode> selectLargeCode();

    List<MiddleCode> selectMiddleCode();
}
