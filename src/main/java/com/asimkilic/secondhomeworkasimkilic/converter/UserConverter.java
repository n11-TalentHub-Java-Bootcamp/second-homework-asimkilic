package com.asimkilic.secondhomeworkasimkilic.converter;

import com.asimkilic.secondhomeworkasimkilic.dto.user.UserDto;
import com.asimkilic.secondhomeworkasimkilic.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    // Convert Entity To DTO
    List<UserDto> convertUserToUserDto(List<User> userList);




    // Convert DTO To Entity
    List<User> convertUserDtoToUser(List<UserDto> userDtoList);
}
