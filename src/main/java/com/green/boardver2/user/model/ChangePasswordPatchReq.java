package com.green.boardver2.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ChangePasswordPatchReq {
    // 비밀번호 변경.
    // 대상 지정, 기존 비밀번호 ( 대상의 원 주인인지 체크 ), 신규 비밀번호
    // uid
    @JsonIgnore
    private long userId; // @JsonIgnore 는 swagger에서 안뜨게 만들어줌

    private String uid;
    private String currentPw;
    private String newPw;
}
