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

    @Override
    public List<UserDto> getUserList() {
        return userMapper.getUserList();
    }
}
