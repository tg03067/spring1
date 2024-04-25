package com.green.boardver2.user;

import com.green.boardver2.common.ResultDto;
import com.green.boardver2.user.model.ChangePasswordPatchReq;
import com.green.boardver2.user.model.SignInPostReq;
import com.green.boardver2.user.model.UserPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService service;

    @PostMapping("SignUp")
    public ResponseEntity<ResultDto<Integer>> postUser(@RequestBody UserPostReq p) {
        int result = service.postUser(p);
//        ResultDto dto = ResultDto.builder().statusCode(HttpStatus.OK).build();
//        ResultDto dto2 = ResultDto.builder().resultData("ddd").build();
//        ResultDto dto3 = ResultDto.<Integer>builder().
//                                    statusCode(HttpStatus.OK). // ok의 값
//                                    resultMsg(HttpStatus.OK.toString()). //ok의 문자열 값.
//                                    resultData(result).build();
        return ResponseEntity.ok(ResultDto.<Integer>builder().
                statusCode(HttpStatus.OK).
                resultMsg(HttpStatus.OK.toString()).
                resultData(result).build()); //200 번대 통신이 잘되었다.
        // return괴는 형태가 항상 같다.
    }

    //로그인처리
    @PostMapping("SignIn")
    public ResponseEntity<ResultDto<Integer>> postSignin(@RequestBody SignInPostReq p) {
        int result = service.postSignIn(p);

        //1 > 로그인 성공
        //2 > 아이디를 확인해 주세요.
        //3 > 비밀번호를 확인해 주세요.
        String Msg = switch (result) {
            case 1 -> "로그인 성공" ;
            case 2 -> "아이디를 확인해 주세요." ;
            case 3 -> "비밀번호를 확인해 주세요." ;
            default -> "ERROR" ;
        } ;

        return ResponseEntity.ok(ResultDto.<Integer>builder().
                statusCode(HttpStatus.OK).
                resultMsg(Msg).
                resultData(result).build());
    }

    @PatchMapping("Password")
    public ResponseEntity<ResultDto<Integer>> patchPassword(@RequestBody ChangePasswordPatchReq p){
        int result = service.patchPassword(p);

        String msg = switch (result){
            case 1 -> "비밀번호 변경 성공";
            case 2 -> "아이디를 확인해 주세요";
            case 3 -> "기존 비밀번호를 확인해 주세요.";
            default -> "ERROR";
        } ;

        return ResponseEntity.ok(ResultDto.<Integer>builder().
                statusCode(HttpStatus.OK).
                resultMsg(msg).
                resultData(result).build());
    }
}
