package com.example.jwttest.service;


import com.example.jwttest.dto.UserDto;
import com.example.jwttest.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    //회원 가입
    public User signup(UserDto userDto);

    //

}
