package com.example.microgramm.repository;

import com.example.microgramm.entity.Publication;
import org.springframework.data.repository.CrudRepository;

public interface PublicationRepository extends CrudRepository<Publication, String> {
}
