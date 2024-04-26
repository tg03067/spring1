package com.green.boardver2.board.model;

import lombok.Data;

@Data
public class BoardPutReq {
    private long boardId;
    private String title;
    private String contents;
}
