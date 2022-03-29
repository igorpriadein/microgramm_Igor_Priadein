package com.example.microgramm.controller;


import com.example.microgramm.dto.UserDTO;
import com.example.microgramm.service.UserService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Slice<UserDTO> findAllUsers(Pageable pageable){
        return userService.findUsers(pageable);
    }


    @GetMapping("/{userId}")
    public UserDTO getUser(@PathVariable String userId){
        return userService.findOne(userId);
    }
}
