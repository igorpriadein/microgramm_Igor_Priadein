package com.example.microgramm.service;

import com.example.microgramm.dto.CommentDTO;
import com.example.microgramm.dto.PublicationDTO;
import com.example.microgramm.dto.UserDTO;
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

    public Optional<Comment> Comment(User user, String text, Publication publication)

    {

// TODO реализовать логику написания коммента

        return Optional.empty();

    }

    public CommentDTO addComment(CommentDTO commentDTO, PublicationDTO publicationDTO){
        var comment = Comment.builder()
                .id(commentDTO.getId())
                .commentText(commentDTO.getCommentText())
                .author(User.builder().id(commentDTO.getAuthorId()).build())
                .publication(Publication.builder().id(publicationDTO.getAuthorId()).build())
                .build();
        commentRepository.save(comment);
        return CommentDTO.from(comment);
    }

    public Slice<CommentDTO> findCommentsByUserId(String id, Pageable pageable){
        var slice = commentRepository.findByAuthorId(id, pageable);
        return slice.map(CommentDTO::from);
    }
}
