package com.example.microgramm.dto;


import com.example.microgramm.entity.User;
import lombok.*;

import javax.persistence.Column;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDTO {

    public static UserDTO from(User user){


        return builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .countPublications(user.getCountPublications())
                .countSubscribers(user.getCountSubscribes())
                .countSubscribes(user.getCountSubscribes())
                .build();
    }

    private Long id;
    private String name;
    private String email;
    private Integer countPublications;
    private Integer countSubscribers;
    private Integer countSubscribes;

}
