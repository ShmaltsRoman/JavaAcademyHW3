package com.shmalts.javaacademyhw3.mapper;

import com.shmalts.javaacademyhw3.dto.UserDto;
import com.shmalts.javaacademyhw3.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toModel(UserDto userDto);

    UserDto toDto(User user);
}
