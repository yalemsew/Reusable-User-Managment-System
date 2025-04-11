package org.example.userprofilems.dto.requestDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record ProfileRequestDto(
        @NotBlank(message = "First name can not be blank/empty/null")
        String firstName,
        @NotBlank(message = "Last name can not be blank/empty/null")
        String lastName,
        @NotNull(message = "Birth date can not be null")
        LocalDate birthDate,
        @Email(message = "Email is not valid")
        String email,
        @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
        String phoneNumber,
        @NotBlank(message = "Bio can not be blank/empty/null")
        String bio
) {
}
