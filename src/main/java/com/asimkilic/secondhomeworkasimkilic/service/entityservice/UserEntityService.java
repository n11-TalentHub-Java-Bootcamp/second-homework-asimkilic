package com.asimkilic.secondhomeworkasimkilic.service.entityservice;

import com.asimkilic.secondhomeworkasimkilic.dao.UserDao;
import com.asimkilic.secondhomeworkasimkilic.dto.user.UserDto;
import com.asimkilic.secondhomeworkasimkilic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.asimkilic.secondhomeworkasimkilic.converter.UserConverter.INSTANCE;


@Service
public class UserEntityService {
    @Autowired
    private UserDao userDao;

    public List<UserDto> findAll() {
        return INSTANCE.convertUserListToUserDtoList(userDao.findAll());
    }

    public UserDto findUserByUsername(String username) {

        return INSTANCE.convertUserToUserDto(userDao.findUserByUsername(username)); // TODO: olmayan kullanıcı olduğunda hata döndürsün
    }

    public UserDto findUserByCellPhone(String phone) {
        return INSTANCE.convertUserToUserDto(userDao.findUserByCellPhone(phone));

    }
}
