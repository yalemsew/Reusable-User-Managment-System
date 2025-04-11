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
    public UserResponseDto createUser(UserRequestDto userRequestDto) {

        Optional<User> optionalUser = userRepository.findByUsername(userRequestDto.userName());
        if(optionalUser.isPresent()){
            throw new RuntimeException("User already exists");
        }
        User user = userMapper.userRequestDtoToUser(userRequestDto);
        User savedUser = userRepository.save(user);
        return userMapper.userToUserResponseDto(savedUser);
    }

    @Override
    public UserResponseDto updateUser(String username, UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public void deleteUserByUsername(String username) {

    }

    @Override
    public UserResponseDto findUserByUsername(String username) {
        return null;
    }

    @Override
    public UserResponseDto findAllUsers() {
        return null;
    }


}
