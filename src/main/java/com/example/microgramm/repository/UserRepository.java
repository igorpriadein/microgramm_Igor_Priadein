package com.example.microgramm.repository;

import com.example.microgramm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findUsersByName(String name);
    //найти по имени

    List<User> findUsersByLogin(String login);

    List<User> findUsersByEmail(String email);

    User findUserByEmail(String email);

    List<User> findUsersByCountSubscribersEquals(Integer count);

    List<User> findUsersByCountPublicationsEquals(Integer count);

    List<User> findUsersByNameContains(String text);

    List<User> findUsersByCountSubscribersGreaterThan(Integer count);

}
