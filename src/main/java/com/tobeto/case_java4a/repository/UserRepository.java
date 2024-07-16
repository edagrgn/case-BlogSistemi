package com.tobeto.case_java4a.repository;

import com.tobeto.case_java4a.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
