package com.guven.cvpreparationproject.service;

import com.guven.cvpreparationproject.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    void deleteUser(Long id);

    List<User> findAllUser();

    Optional<User> findByUser(Long id);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
