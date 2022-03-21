package com.example.microgramm.repository;

import com.example.microgramm.entity.Comment;
import com.example.microgramm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, String> {
    List<Comment> findCommentsByAuthor(User author);

    List<Comment> findCommentsByCommentTextContains(String text);

    List<Comment> findCommentsByDateAddedEquals(LocalDateTime dateTime);

}
