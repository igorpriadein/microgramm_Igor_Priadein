package com.example.microgramm.service;

import com.example.microgramm.dto.CommentDTO;
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


    public Slice<PublicationDTO> findPublicationsByUserId(String id, Pageable pageable){
        var slice = publicationRepository.findByAuthorId(id, pageable);
        return slice.map(PublicationDTO::from);
    }

    public PublicationDTO addPublication(PublicationDTO publicationDTO) {
        var publication = Publication.builder()
                .id(publicationDTO.getId())
                .author(User.builder().id(publicationDTO.getAuthorId()).build())
                .picture(publicationDTO.getPicture())
                .dateAdded(publicationDTO.getDateAdded())
                .build();
        publicationRepository.save(publication);
        return PublicationDTO.from(publication);
    }
}
