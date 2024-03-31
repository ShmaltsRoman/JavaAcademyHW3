package com.shmalts.javaacademyhw3.repository;

import com.shmalts.javaacademyhw3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
