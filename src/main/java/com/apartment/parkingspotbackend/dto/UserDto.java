package com.apartment.parkingspotbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int id;
    private String email;
    private String nickname;
    private String password;
}
