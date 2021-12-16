package com.asimkilic.secondhomeworkasimkilic.controller;


import com.asimkilic.secondhomeworkasimkilic.dto.user.UserDto;

import com.asimkilic.secondhomeworkasimkilic.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.asimkilic.secondhomeworkasimkilic.converter.UserConverter.INSTANCE;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private UserEntityService userEntityService;


    @GetMapping
    public List<UserDto> findAll() {
        return INSTANCE.convertUserToUserDto(userEntityService.findAll());
    }
}
