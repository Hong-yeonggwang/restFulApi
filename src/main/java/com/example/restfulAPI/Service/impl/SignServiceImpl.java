package com.example.restfulAPI.Service.impl;

import com.example.restfulAPI.Common.CommonResponse;
import com.example.restfulAPI.Config.JwtProvider;
import com.example.restfulAPI.DTO.SignInResultDto;
import com.example.restfulAPI.DTO.SignUpResultDto;
import com.example.restfulAPI.JPA.Entity.member.User;
import com.example.restfulAPI.JPA.Repository.member.UserRepository;
import com.example.restfulAPI.Service.SignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class SignServiceImpl implements SignService {
    private final Logger LOGGER = LoggerFactory.getLogger(SignServiceImpl.class);

    public UserRepository userRepository;
    public JwtProvider jwtprovider;
    public PasswordEncoder passwordEncoder;

    @Autowired
    public SignServiceImpl(UserRepository userRepository, JwtProvider jwtProvider, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.jwtprovider = jwtProvider;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public SignUpResultDto signUp(String id, String password, String name, String role){
        LOGGER.info("[getSignUpResult] 회원 가입 정보 전달");
        User user;
        if(role.equalsIgnoreCase("admin")){
            user = User.builder()
                    .uid(id)
                    .name(name)
                    .password(passwordEncoder.encode(password))
                    .roles(Collections.singletonList("ROLE_ADMIN"))
                    .build();
        }else{
            user = User.builder()
                    .uid(id)
                    .name(name)
                    .password(passwordEncoder.encode(password))
                    .roles(Collections.singletonList("ROLE_USER"))
                    .build();
        }

        User saveUser = userRepository.save(user);
        SignUpResultDto signUpResultDto = new SignInResultDto();

        LOGGER.info("[getSignUpResult] userEntity 값이 들어왔는지 확인 후 결과값 주입");
        if(!saveUser.getName().isEmpty()){
            LOGGER.info("[getSignUpResultDto] 정상 처리 완료");
            setSuccessResult(signUpResultDto);
        }else{
            LOGGER.info("[getSignUpResultDto] 실패 처리 완료");
            setFailResult(signUpResultDto);
        }
        return signUpResultDto;
    }
    @Override
    public SignInResultDto signIn(String id, String password) throws RuntimeException{
        LOGGER.info("[getSignInResult] signDataHandler로 회원 정보 요청");
        User user = userRepository.getByUid(id);
        LOGGER.info("[getSignInResult] ID : ");
        LOGGER.info(id);

        LOGGER.info("[getSignInResult] 패스워드 일치");

        LOGGER.info("[getSignInResult] SignInResultDto 객체 생성");
        SignInResultDto signInResultDto = SignInResultDto.builder()
                .token(jwtprovider.createToken(String.valueOf(user.getUid()),user.getRoles()))
                .build();

        LOGGER.info("[getSignInResult] SignInResultDto 객체 생성");
        setSuccessResult(signInResultDto);

        return signInResultDto;
    }
    public void setSuccessResult(SignUpResultDto result){
        result.setSuccess(false);
        result.setCode(CommonResponse.FAIL.getCode());
        result.setMsg(CommonResponse.FAIL.getMsg());
    }
    private void setFailResult(SignUpResultDto result){
        result.setSuccess(false);
        result.setCode(CommonResponse.FAIL.getCode());
        result.setMsg(CommonResponse.FAIL.getMsg());
    }
}
