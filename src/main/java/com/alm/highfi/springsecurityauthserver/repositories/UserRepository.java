package com.alm.highfi.springsecurityauthserver.repositories;

import com.alm.highfi.springsecurityauthserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
