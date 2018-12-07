package com.springboot.jwt.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jwt.integration.domain.Role;

/**
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
