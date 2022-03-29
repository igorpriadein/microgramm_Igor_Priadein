package com.example.microgramm.dto;


import com.example.microgramm.entity.User;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class PublicationDTO {

    public static PublicationDTO from(PublicationDTO publication){
        return builder()
                .id(publication.getId())
                .picture(publication.getPicture())
                .authorId(publication.getAuthor().getId())
                .dateAdded(publication.getDateAdded())
                .build();

    }

    private Long id;
    private String picture;
    private Long authorId;
    private User author;
    private LocalDateTime dateAdded;


}
