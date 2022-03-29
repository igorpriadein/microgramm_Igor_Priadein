package com.example.microgramm.service;

import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    public Optional<Comment> addComment(User user, String text, Publication publication)

    {

// TODO реализовать логику написания коммента

        return Optional.empty();

    }
}
