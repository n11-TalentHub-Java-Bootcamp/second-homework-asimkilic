package com.asimkilic.secondhomeworkasimkilic.controller;


import com.asimkilic.secondhomeworkasimkilic.dto.user.UserDto;

import com.asimkilic.secondhomeworkasimkilic.dto.user.UserRegisterDto;
import com.asimkilic.secondhomeworkasimkilic.dto.user.UserUpdateDto;
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

    // localhost:api/users/username?q=asimkilic&phone=05052505050
    @GetMapping("/username")
    public UserDto findUserByUsername(@RequestParam("username") String username) {
        return userEntityService.findUserByUsername(username); // TODO: olmayan kullanıcı olduğunda hata döndürsün
    }

    @GetMapping("/phone")
    public UserDto findUserByCellPhone(@RequestParam("q") String phone) {

        return userEntityService.findUserByCellPhone(phone);
    }

    @PostMapping
    public UserDto saveUser(@RequestBody UserRegisterDto userRegisterDto) {
        return userEntityService.save(userRegisterDto);

    }

    @DeleteMapping
    public void deleteUser(@RequestParam("u") String username, @RequestParam("p") String phone) {
        userEntityService.deleteByUsernameAndPhone(username, phone);
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserUpdateDto userUpdateDto) {
        return userEntityService.updateUserByUserUpdateDto(userUpdateDto);
    }
}
