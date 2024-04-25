package com.green.boardver2.board.model;

import lombok.Data;

@Data
public class BoardGetListRes {
    private long boardId;
    private String title;
    private long writerId;
    private String writerNm;
    private int hit;
    private String createdAt;
}
