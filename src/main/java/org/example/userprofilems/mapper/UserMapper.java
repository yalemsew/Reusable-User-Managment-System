package org.example.userprofilems.mapper;

import org.example.userprofilems.domain.User;
import org.example.userprofilems.dto.requestDto.UserRequestDto;
import org.example.userprofilems.dto.responseDto.UserResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = ProfileMapper.class)
public interface UserMapper {
   @Mapping(source = "profileRequestDto", target="profile")
   @Mapping(source = "userName", target = "username")
   User userRequestDtoToUser(UserRequestDto userRequestDto);

   @Mapping(source = "profile", target="profileResponseDto")
    UserResponseDto userToUserResponseDto(User user);

    @Mapping(source = "profile", target="profileResponseDto")
    List<UserResponseDto> userToUserResponseDto(List<User> users);

}
