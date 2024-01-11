package com.example.SpringSecurityInActionStudy.repositories;

import com.example.SpringSecurityInActionStudy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
