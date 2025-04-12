package org.example.userprofilems.dto.responseDto;

public record UserResponseDto(
        String username,
        ProfileResponseDto profileResponseDto
) {
}
