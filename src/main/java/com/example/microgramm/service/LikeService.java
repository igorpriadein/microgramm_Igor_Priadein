package com.example.microgramm.service;

import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.Like;
import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeService {

    public Optional<Like> like(User user, Publication publication)

    {

// TODO реализовать логику проставления лайка

        return Optional.empty();

    }

}
