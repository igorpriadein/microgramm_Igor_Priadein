package com.example.microgramm.service;

import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublicationService {

    public Optional<Comment> makePublication(User user, String picture, String text)

    {

// TODO реализовать логику поста публикации

        return Optional.empty();

    }
}
