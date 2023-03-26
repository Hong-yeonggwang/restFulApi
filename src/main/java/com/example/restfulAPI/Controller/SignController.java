package com.example.restfulAPI.Controller;

import com.example.restfulAPI.DTO.SignInResultDto;
import com.example.restfulAPI.DTO.SignUpResultDto;
import com.example.restfulAPI.Service.SignService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sign-api")
public class SignController {
    private final Logger LOGGER = LoggerFactory.getLogger(SignController.class);
    private final SignService signService;

    @Autowired
    public SignController(SignService signsService){
        this.signService = signsService;
    }

    @PostMapping(value = "/sign-in")
    public SignInResultDto signIn(
            @ApiParam(value = "ID", required = true) @RequestParam String id,
            @ApiParam(value = "ID", required = true) @RequestParam String password) throws RuntimeException{
        LOGGER.info("[signIn] 로그인을 시도하고 있습니다. id:");
        LOGGER.info(id);
        SignInResultDto signInResultDto = signService.signIn(id,password);
        if(signInResultDto.getCode() == 0){
            LOGGER.info("[signIn] 정상적으로 로그인되었습니다. id:");
            LOGGER.info(id);
            LOGGER.info("token:");
            LOGGER.info(signInResultDto.getToken());
        }
        return signInResultDto;
    }

    @ApiOperation(value = "회원가입" , notes = "asd")
    @PostMapping(value = "/sign-up")
    public SignUpResultDto signUp(
            @ApiParam(value = "ID", required = true) @RequestParam("id") String id,
            @ApiParam(value = "비밀번호", required = true) @RequestParam("password") String password,
            @ApiParam(value = "이름", required = true) @RequestParam("name") String name,
            @ApiParam(value = "권한", required = true) @RequestParam("role") String role
    ){
        LOGGER.info("[signIn] 회원가입을 수행합니다. id,name,role");
        LOGGER.info(id);
        LOGGER.info(name);
        LOGGER.info(role);
        SignUpResultDto signUpResultDto = signService.signUp(id,password,name,role);

        LOGGER.info("[signUP] 회원가입을 완료했습니다. id:");
        LOGGER.info(id);
        return signUpResultDto;
    }

    @GetMapping(value = "/exception")
    public void exceptionTest() throws RuntimeException{
        throw new RuntimeException("접근이 금지 되었습니다.");
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<Map<String,String>> ExceptionHandler(RuntimeException e){
        HttpHeaders responseHeaders = new HttpHeaders();
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        LOGGER.error("ExceptionHandler 호출");

        Map<String,String> map = new HashMap<>();
        map.put("error type", httpStatus.getReasonPhrase());
        map.put("code", "400");
        map.put("message","에러발생");

        return new ResponseEntity<>(map, responseHeaders, httpStatus);

    }
}
