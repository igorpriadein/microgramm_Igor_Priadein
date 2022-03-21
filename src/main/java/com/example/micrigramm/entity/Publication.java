package com.example.micrigramm.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "publication")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picture;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "date_added")
    private LocalDateTime dateAdded;
}
