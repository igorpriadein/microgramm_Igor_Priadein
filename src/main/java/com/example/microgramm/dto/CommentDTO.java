package com.example.microgramm.dto;


import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class CommentDTO {

    public static CommentDTO from(Comment comment){

        return builder()
                .id(comment.getId())
                .commentText(comment.getCommentText())
                .dateAdded(comment.getDateAdded())
                .authorId(comment.getAuthor().getId())
                .build();
    }
    private Long id;
    private String commentText;
    private LocalDateTime dateAdded;
    private Long authorId;
    private User author;
    private Publication publication;

}
