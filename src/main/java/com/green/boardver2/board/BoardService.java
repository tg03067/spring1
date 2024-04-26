package com.green.boardver2.board;

import com.green.boardver2.board.model.BoardGetListRes;
import com.green.boardver2.board.model.BoardGetOneRes;
import com.green.boardver2.board.model.BoardPostReq;
import com.green.boardver2.board.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard(BoardPostReq p){
        return mapper.postBoard(p);
    }
    public List<BoardGetListRes> getBoardList(){
        return mapper.getBoardList();
    }
    public BoardGetOneRes getBoardOne(long p){
        return mapper.getBoardOne(p);
    }
    public int putBoard(BoardPutReq p){
        return mapper.putBoard(p);
    }
    public int delBoard(long p){
        return mapper.delBoard(p);
    }
}
