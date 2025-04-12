package org.example.userprofilems.mapper;

import org.example.userprofilems.domain.Profile;
import org.example.userprofilems.dto.requestDto.ProfileRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = UserMapper.class)
public interface ProfileMapper {
    Profile proileRequestDtoToProfile(ProfileRequestDto profileRequestDto);
    ProfileRequestDto profileToProfileResponseDto(Profile profile);
}

//No explicit mapping is required here
