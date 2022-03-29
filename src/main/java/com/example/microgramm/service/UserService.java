package com.example.microgramm.service;


import com.example.microgramm.dto.UserDTO;
import com.example.microgramm.entity.User;
import com.example.microgramm.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> login(String email, String password)

    {

    // TODO реализовать логику входа в систему

        return Optional.empty();

    }

    @SneakyThrows
    public UserDTO findOne(String userId){
        var user = userRepository.findById(userId).orElseThrow(() -> new Exception("Can't find such user id:" + userId));
        return UserDTO.from(user);
    }

}
