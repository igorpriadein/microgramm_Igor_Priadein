package com.example.microgramm.repository;

import com.example.microgramm.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    List<User> findByName(String name);
    //найти по имени

    List<User> findByLogin(String login);

    List<User> findByEmail(String email);

    User findUserByEmail(String email);

}
