package com.asimkilic.secondhomeworkasimkilic.service.entityservice;

import com.asimkilic.secondhomeworkasimkilic.dao.UserDao;
import com.asimkilic.secondhomeworkasimkilic.dto.user.UserDto;
import com.asimkilic.secondhomeworkasimkilic.dto.user.UserRegisterDto;
import com.asimkilic.secondhomeworkasimkilic.dto.user.UserUpdateDto;
import com.asimkilic.secondhomeworkasimkilic.entity.User;
import com.asimkilic.secondhomeworkasimkilic.exception.user.UserNotFoundException;
import com.asimkilic.secondhomeworkasimkilic.exception.user.UsernameAndPhoneDoesntMatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public UserDto save(UserRegisterDto userRegisterDto) {
        //1 dto yu entity çevir
        User user = INSTANCE.convertUserRegisterDtoToUser(userRegisterDto);
        // 2 entity save et sana entity geri dönecek
        user = userDao.save(user);
        // 3. dönen entity'i dto çevir return et
        UserDto userDto = INSTANCE.convertUserToUserDto(user);
        return userDto;
    }

    public void deleteByUsernameAndPhone(String username, String phone) {
        User userByUserName = userDao.findUserByUsername(username);
        if (userByUserName.getCellPhone() != phone) {

            throw new UsernameAndPhoneDoesntMatchException(userByUserName.getUsername() + " kullanıcı adı ile " + phone + " telefonu bilgileri uyuşmamaktadır.");
        }
        userDao.delete(userByUserName);
    }
    public UserDto updateUserByUserUpdateDto(UserUpdateDto userUpdateDto){
        Optional<User> userById = userDao.findById(userUpdateDto.getId());
        if(!userById.isPresent())
            throw new UserNotFoundException(userUpdateDto.getId() + " id'ye ait bir kullanıcı bulunamadı.");
        User updatedUser = INSTANCE.convertUserUpdateDtoToUser(userUpdateDto);
        updatedUser.setUsername(userById.get().getUsername());
        User savedUser = userDao.save(updatedUser);
        return INSTANCE.convertUserToUserDto(savedUser);
    }
}
