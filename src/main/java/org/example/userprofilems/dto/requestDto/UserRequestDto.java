package org.example.userprofilems.dto.requestDto;

public record UserRequestDto(
        String userName,
        String password,
        ProfileRequestDto profileRequestDto
) {
}
