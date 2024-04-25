package com.green.boardver2.board.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ChangeBoardPatchReq {
    private long writerId;
    private String title;
    private String contents;
}
