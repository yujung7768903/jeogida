package com.apartment.parkingspotbackend.service;

import com.apartment.parkingspotbackend.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getUserList();
    public boolean insertUser(UserDto userDto);
    public Integer findByEmail(String email);
    public boolean updateUser(Integer id, UserDto userDto);
    public boolean deleteUser(Integer id);
}
