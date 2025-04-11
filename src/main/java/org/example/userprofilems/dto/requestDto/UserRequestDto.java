package org.example.userprofilems.dto.requestDto;

public record UserRequestDto(
        @NotNull
        String userName,
        String password,
        ProfileRequestDto profileRequestDto
) {
}
