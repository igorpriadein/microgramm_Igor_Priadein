package com.example.microgramm.controller;


import com.example.microgramm.dto.CommentDTO;
import com.example.microgramm.dto.PublicationDTO;
import com.example.microgramm.service.PublicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publications")
@RequiredArgsConstructor
public class PublicationContoller {
    private final PublicationService publicationService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public PublicationDTO addPublication(@RequestBody PublicationDTO publicationDTO){
        return publicationService.addPublication(publicationDTO);
    }
}
