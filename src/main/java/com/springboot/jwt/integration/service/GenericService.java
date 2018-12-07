package com.springboot.jwt.integration.service;

import java.util.List;

import com.springboot.jwt.integration.domain.RandomCity;
import com.springboot.jwt.integration.domain.User;

/**
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
