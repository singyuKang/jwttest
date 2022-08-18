package com.example.jwttest.dto;


import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    @NotNull
    private String userName;

    @NotNull
    private String password;

    @NotNull
    private String nickName;
}
