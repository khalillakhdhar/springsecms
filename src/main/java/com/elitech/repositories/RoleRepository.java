package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
