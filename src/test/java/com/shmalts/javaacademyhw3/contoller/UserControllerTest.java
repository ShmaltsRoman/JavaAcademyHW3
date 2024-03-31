package com.shmalts.javaacademyhw3.contoller;

import com.shmalts.javaacademyhw3.dto.UserDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;


@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void createUser(CapturedOutput output) {
        UserDto userDto = new UserDto(10, "Test", "Test");

        userController.createUser(userDto);
        Assertions.assertTrue(output.getOut().contains("LoggingAspect: << createUser()"));
    }
}