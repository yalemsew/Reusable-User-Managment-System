package org.example.userprofilems.dto.requestDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserRequestDto(
        @NotBlank(message = "Username can not be blank/empty/null")
        String userName,
        @NotBlank(message = "Password can not be blank/empty/null")
//                @Size(min = 8, message = "Password must be at least 8 characters long")
        @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[?*+!])[A-Za-z0-9?*+!]{4,8}$")
        String password,
        @NotNull(message = "Profile can not be null")
        ProfileRequestDto profileRequestDto
) {
}
