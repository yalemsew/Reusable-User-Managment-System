package org.example.userprofilems.dto.responseDto;

public record UserResponseDto(
        String userName,
        ProfileResponseDto profileResponseDto
) {
}
