package com.example.microgramm.controller;


import com.example.microgramm.dto.CommentDTO;
import com.example.microgramm.dto.PublicationDTO;
import com.example.microgramm.dto.UserDTO;
import com.example.microgramm.service.CommentService;
import com.example.microgramm.service.PublicationService;
import com.example.microgramm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final PublicationService publicationService;
    private final CommentService commentService;


    @GetMapping
    public Slice<UserDTO> findAllUsers(Pageable pageable){
        return userService.findUsers(pageable);
    }


    @GetMapping("/{userId}")
    public UserDTO getUser(@PathVariable String userId){
        return userService.findOne(userId);
    }

    @GetMapping("{userId}/publications")
    public Slice<PublicationDTO> findPublicationsByUserId(@PathVariable String userId, Pageable pageable){
        return publicationService.findPublicationsByUserId(userId, pageable);
    }

    @GetMapping("{userId}/comments")
    public Slice<CommentDTO> findCommentsByUserId(@PathVariable String userId, Pageable pageable){
        return commentService.findCommentsByUserId(userId, pageable);
    }
}
