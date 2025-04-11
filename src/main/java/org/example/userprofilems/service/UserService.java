package org.example.userprofilems.service;

import org.example.userprofilems.domain.User;
import org.example.userprofilems.dto.requestDto.UserRequestDto;
import org.example.userprofilems.dto.responseDto.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserResponseDto createUser(UserRequestDto userRequestDto);
    UserResponseDto updateUser(String username, UserRequestDto userRequestDto);
    void deleteUserByUsername(String username);
    UserResponseDto findUserByUsername(String username);
    UserResponseDto findAllUsers();
}
//annotation can only be done at the implemented class
