package com.example.microgramm.repository;

import com.example.microgramm.entity.Subscribe;
import com.example.microgramm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SubscribeRepository extends CrudRepository<Subscribe, String> {

    List<Subscribe> findSubscribesByDateAdded(LocalDateTime dateAdded);

    List<Subscribe> findSubscribesBySubscriberIs(User subscriber);


}
