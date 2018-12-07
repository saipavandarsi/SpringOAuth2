package com.springboot.jwt.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jwt.integration.domain.RandomCity;

/**
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
