package com.example.microgramm.repository;

import com.example.microgramm.entity.Like;
import com.example.microgramm.entity.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends CrudRepository<Like, String> {

    List<Like> findLikesByPublicationNotNull();
    //найти публикации с лайками

}
