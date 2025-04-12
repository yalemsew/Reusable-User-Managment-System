package org.example.userprofilems.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.userprofilems.domain.User;
import org.example.userprofilems.dto.requestDto.UserRequestDto;
import org.example.userprofilems.dto.responseDto.UserResponseDto;
import org.example.userprofilems.exception.user.UserNotFoundException;
import org.example.userprofilems.mapper.UserMapper;
import org.example.userprofilems.repository.UserRepository;
import org.example.userprofilems.service.UserService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.beans.Transient;
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
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if(optionalUser.isPresent()){
            //do update
            User existingUser = optionalUser.get();
            User mapppedUser = userMapper.userRequestDtoToUser(userRequestDto);
            mapppedUser.setId(existingUser.getId());
            if(mapppedUser.getProfile() != null){
                mapppedUser.getProfile().setId(existingUser.getProfile().getId());
            }
            User updatedUser = userRepository.save(mapppedUser);
            return userMapper.userToUserResponseDto(updatedUser);

        }
        throw new UserNotFoundException(username+ " not found");
    }

    @Override
    @Transactional
    public void deleteUserByUsername(String username) {
       // userRepository.findByUsername(username).ifPresent(userRepository::delete);
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if(optionalUser.isPresent()){
            userRepository.deleteByUsername(username);
        }else{
            throw new UserNotFoundException(username+ " not found");
        }

    }

    @Override
    public UserResponseDto findUserByUsername(String username) {
        return null;
    }

    @Override
    public List<UserResponseDto> findAllUsers() {
       List<User> users = userRepository.findAll();
       return userMapper.userToUserResponseDto(users);
    }


}
