package com.apartment.parkingspotbackend.mapper;

import com.apartment.parkingspotbackend.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserDto> getUserList();
    public int insertUser(UserDto userDto);
    public UserDto findByEmail(String email);
    public int updateUser(UserDto userDto);
    public int deleteUser(Integer id);
}
