package com.apartment.parkingspotbackend.service;

import com.apartment.parkingspotbackend.dto.UserDto;
import com.apartment.parkingspotbackend.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpelements implements UserService{
    private final UserMapper userMapper;

    // 모든 유저 조회
    @Override
    public List<UserDto> getUserList() {
        return userMapper.getUserList();
    }

    // 이메일로 유저 찾기
    @Override
    public Integer findByEmail(String email) {
        UserDto userDto = userMapper.findByEmail(email);
        return userDto.getId();
    }

    // 유저 등록
    @Override
    public boolean insertUser(UserDto userDto) {
        try {
            userMapper.insertUser(userDto);
            return true;
        }catch (Exception e) {
            System.out.println("error: " + e);
            return false;
        }
    }

    // 유저 정보 수정
    @Override
    public boolean updateUser(Integer id, UserDto userDto) {
        System.out.println("전: " + userDto);
        userDto.setId(id);
        System.out.println("후: " + userDto);
        try {
            userMapper.updateUser(userDto);
            return true;
        }catch (Exception e) {
            System.out.println("error: " + e);
            return false;
        }
    }

    // 유저 정보 삭제
    @Override
    public boolean deleteUser(Integer id) {
        try {
            userMapper.deleteUser(id);
            return true;
        }catch (Exception e) {
            System.out.println("error: " + e);
            return false;
        }
    }


}
