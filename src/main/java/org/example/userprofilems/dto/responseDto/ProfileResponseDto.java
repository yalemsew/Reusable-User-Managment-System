package org.example.userprofilems.dto.responseDto;

import java.time.LocalDate;

public record ProfileResponseDto(
        String firstName,
        String lastName,
//        LocalDate birthDate,
//        String email,
//        String phoneNumber,
        String bio
) {
}
