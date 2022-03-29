package com.example.microgramm.service;

import com.example.microgramm.dto.PublicationDTO;
import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import com.example.microgramm.repository.PublicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PublicationService {
    private final PublicationRepository publicationRepository;



    public Optional<Comment> addPublication(User user, String picture, String text)

    {

// TODO реализовать логику поста публикации

        return Optional.empty();

    }

    public Slice<PublicationDTO> findPublicationsByUserId(String id, Pageable pageable){
        var slice = publicationRepository.findByAuthorId(id, pageable);
        return slice.map(PublicationDTO::from);
    }
}
