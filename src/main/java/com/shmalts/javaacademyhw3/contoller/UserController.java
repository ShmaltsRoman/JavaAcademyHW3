package com.shmalts.javaacademyhw3.contoller;

import com.shmalts.javaacademyhw3.annotation.LogRequest;
import com.shmalts.javaacademyhw3.dto.UserDto;
import com.shmalts.javaacademyhw3.entity.User;
import com.shmalts.javaacademyhw3.mapper.UserMapper;
import com.shmalts.javaacademyhw3.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @LogRequest
    public UserDto createUser(@RequestBody UserDto userDto) {
        User user = userMapper.toModel(userDto);

        return userMapper.toDto(userService.createUser(user));
    }
}
