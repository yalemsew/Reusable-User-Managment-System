package org.example.userprofilems.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.userprofilems.domain.User;
import org.example.userprofilems.dto.requestDto.UserRequestDto;
import org.example.userprofilems.dto.responseDto.UserResponseDto;
import org.example.userprofilems.mapper.UserMapper;
import org.example.userprofilems.repository.UserRepository;
import org.example.userprofilems.service.UserService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public Optional<UserResponseDto> createUser(UserRequestDto userRequestDto) {

        Optional<User> optionalUser = userRepository.findByUsername(userRequestDto.userName());
        if(optionalUser.isPresent()){
            throw new RuntimeException("User already exists");
        }
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
