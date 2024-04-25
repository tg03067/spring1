package com.green.boardver2.board.model;

import lombok.Data;

@Data
public class BoardPostReq {
    private String title;
    private String contents;
    private long writerId;
}
