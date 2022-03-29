package com.example.microgramm.service;

import com.example.microgramm.dto.CommentDTO;
import com.example.microgramm.dto.PublicationDTO;
import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import com.example.microgramm.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Optional<Comment> addComment(User user, String text, Publication publication)

    {

// TODO реализовать логику написания коммента

        return Optional.empty();

    }

    public Slice<CommentDTO> findCommentsByUserId(String id, Pageable pageable){
        var slice = commentRepository.findByAuthorId(id, pageable);
        return slice.map(CommentDTO::from);
    }
}
