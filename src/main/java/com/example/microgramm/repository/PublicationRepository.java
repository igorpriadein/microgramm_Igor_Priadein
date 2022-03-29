package com.example.microgramm.repository;

import com.example.microgramm.entity.Publication;
import com.example.microgramm.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PublicationRepository extends PagingAndSortingRepository<Publication, String> {
    List<Publication> findPublicationsByAuthor(User author);

    List<Publication> findPublicationsByAuthorWhereSubscriberIdEquals(User author, Integer id);
    // найти публицкации автора, у которого в подписках(fk) есть мы

    List<Publication> findPublicationsByDateAddedEquals(LocalDateTime dateAdded);

    @Query("select p from Publication p where p.author.id = :userId")
    Slice<Publication> findByAuthorId(String userId, Pageable pageable);

}
