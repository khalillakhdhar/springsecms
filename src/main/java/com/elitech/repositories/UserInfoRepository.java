package com.elitech.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
Optional<UserInfo> findByEmail(String email);
}
