package com.apartment.parkingspotbackend.mapper;

import com.apartment.parkingspotbackend.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserDto> getUserList();
}
