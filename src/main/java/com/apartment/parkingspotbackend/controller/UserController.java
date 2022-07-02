package com.apartment.parkingspotbackend.controller;

import com.apartment.parkingspotbackend.dto.UserDto;
import com.apartment.parkingspotbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public Object test() {
        return "Hello World";
    }

    // 모든 유저 조회
    @GetMapping("/user")
    public List<UserDto> getUser() {
        return userService.getUserList();
    }

    // 이메일로 유저 아이디 찾기
    @GetMapping("/user/{email}")
    public Integer findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    // 유저 등록
    @PostMapping("/user")
    public boolean save(@RequestBody UserDto userDto) {
        return userService.insertUser(userDto);
    }

    // 유저 정보 수정
    @PatchMapping("/user/{id}")
    public boolean updateUser(@PathVariable Integer id, @RequestBody UserDto userDto) {
        return userService.updateUser(id, userDto);
    }

    // 유저 정보 삭제
    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}
