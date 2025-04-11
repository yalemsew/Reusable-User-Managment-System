package org.example.userprofilems.dto.requestDto;

import java.time.LocalDate;

public record ProfileRequestDto(
        String firstName,
        String lastName,
        LocalDate birthDate,
        String email,
        String phoneNumber,
        String bio
) {
}
