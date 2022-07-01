package com.apartment.parkingspotbackend.controller;

import com.apartment.parkingspotbackend.dto.UserDto;
import com.apartment.parkingspotbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public Object test() {
        return "Hello World";
    }

    @GetMapping("/user")
    public List<UserDto> getUser() {
        return userService.getUserList();
    }
}
