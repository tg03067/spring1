package com.green.boardver2.board.model;

import lombok.Data;

@Data
public class BoardGetOneRes {
    private long boardId;
    private String title;
    private String contents;
    private long writerId;
    private int hit;
    private String createdAt;
    private String updatedAt;
}
