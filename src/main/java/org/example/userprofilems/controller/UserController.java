package org.example.userprofilems.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.userprofilems.dto.requestDto.UserRequestDto;
import org.example.userprofilems.dto.responseDto.UserResponseDto;
import org.example.userprofilems.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<String> findAllUsers(){
        return ResponseEntity.ok("Hello World");
    }
    //create a user
    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@Valid @RequestBody UserRequestDto userRequestDto){
        System.out.println("hello");
        UserResponseDto userResponseDto = userService.createUser(userRequestDto);
        System.out.println("hello");
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
    }

}
