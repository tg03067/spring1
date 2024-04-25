package com.green.boardver2.board;

import com.green.boardver2.board.model.BoardGetListRes;
import com.green.boardver2.board.model.BoardGetOneRes;
import com.green.boardver2.board.model.BoardPostReq;
import com.green.boardver2.common.ResultDto;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.cglib.beans.BulkBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("board")
public class BoardController {
    private final BoardService service;

    @PostMapping
    public ResultDto<Integer> postBoard(@RequestBody BoardPostReq p){
        int result = service.postBoard(p);
        return ResultDto.<Integer>builder().
                statusCode(HttpStatus.OK).
                resultMsg(HttpStatus.OK.toString()).
                resultData(result).build();
    }
    @GetMapping
    public ResultDto<List<BoardGetListRes>> getBoardById(){
        List<BoardGetListRes> list = service.getBoardList();
        return ResultDto.<List<BoardGetListRes>>builder().
                statusCode(HttpStatus.OK).
                resultMsg("").
                resultData(list).build();
    }
    @GetMapping("{boardId}")
    public ResultDto<BoardGetOneRes> getBoardOne(@PathVariable long boardId){
        BoardGetOneRes result = service.getBoardOne(boardId);
        return ResultDto.<BoardGetOneRes>builder().statusCode(HttpStatus.OK).resultMsg("").resultData(result).build();
    }
    @PutMapping
    public ResultDto<Integer> putBoard(@RequestBody BoardPostReq p){
        int result = service.putBoard(p);
        return ResultDto.<Integer>builder().statusCode(HttpStatus.OK).resultMsg("").resultData(result).build();
    }
    @DeleteMapping
    public ResultDto<Integer> delBoard(@RequestParam(name = "board_id") long boradId){
        int result = service.delBoard(boradId);
        return ResultDto.<Integer>builder().statusCode(HttpStatus.OK).resultMsg("").resultData(result).build();
    }
}
