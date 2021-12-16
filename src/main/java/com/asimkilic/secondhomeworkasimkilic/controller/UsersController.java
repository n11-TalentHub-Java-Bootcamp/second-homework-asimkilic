package com.asimkilic.secondhomeworkasimkilic.controller;


import com.asimkilic.secondhomeworkasimkilic.dto.user.UserDto;

import com.asimkilic.secondhomeworkasimkilic.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private UserEntityService userEntityService;


    @GetMapping
    public List<UserDto> findAll() {
        return userEntityService.findAll();
    }

    @GetMapping("/username")
    public UserDto findUserByUsername(@RequestParam("q") String username) {
        return userEntityService.findUserByUsername(username); // TODO: olmayan kullanıcı olduğunda hata döndürsün
    }

    @GetMapping("/phone")
    public UserDto findUserByCellPhone(@RequestParam("q") String phone) {
        return userEntityService.findUserByCellPhone(phone);
    }
}
