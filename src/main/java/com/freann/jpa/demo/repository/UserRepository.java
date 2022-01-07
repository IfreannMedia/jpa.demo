package com.freann.jpa.demo.repository;

import com.freann.jpa.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
