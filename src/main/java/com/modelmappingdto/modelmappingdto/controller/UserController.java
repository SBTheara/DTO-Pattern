package com.modelmappingdto.modelmappingdto.controller;

import com.modelmappingdto.modelmappingdto.dto.UserLocationDTO;
import com.modelmappingdto.modelmappingdto.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    private List<UserLocationDTO> getAllUserLocation(){
        log.debug("--------Successful get the user information----------");
        return userService.getAllUserLocation();
    }
}
