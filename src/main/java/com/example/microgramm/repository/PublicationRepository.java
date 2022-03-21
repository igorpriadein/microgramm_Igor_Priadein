package com.example.microgramm.repository;

import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends CrudRepository<Publication, String> {
    List<Publication> findPublicationsByAuthor(User author);

    List<Publication> findPublicationsByAuthorIsLike

}
