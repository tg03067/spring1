package com.green.boardver2.board;

import com.green.boardver2.board.model.*;
import com.green.boardver2.board.model.BoardGetOneRes;
import com.green.boardver2.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetListRes> getBoardList();
    BoardGetOneRes getBoardOne(long p);
    int putBoard(BoardPutReq p);
    int delBoard(long p);
}
