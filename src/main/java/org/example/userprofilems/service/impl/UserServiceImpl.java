package org.example.userprofilems.service.impl;

import org.example.userprofilems.dto.requestDto.UserRequestDto;
import org.example.userprofilems.dto.responseDto.UserResponseDto;
import org.example.userprofilems.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Optional<UserResponseDto> createUser(UserRequestDto userRequestDto) {
        return Optional.empty();
    }

    @Override
    public Optional<UserResponseDto> updateUser(String username, UserRequestDto userRequestDto) {
        return Optional.empty();
    }

    @Override
    public void deleteUserByUsername(String username) {

    }

    @Override
    public Optional<UserResponseDto> findUserByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public List<UserResponseDto> findAllUsers() {
        return List.of();
    }
}
