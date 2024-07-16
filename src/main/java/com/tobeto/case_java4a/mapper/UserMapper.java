package com.tobeto.case_java4a.mapper;

import com.tobeto.case_java4a.dtos.UserDTO;
import org.apache.catalina.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toUserDTO(User user);
    User toUser(UserDTO userDTO);
}
