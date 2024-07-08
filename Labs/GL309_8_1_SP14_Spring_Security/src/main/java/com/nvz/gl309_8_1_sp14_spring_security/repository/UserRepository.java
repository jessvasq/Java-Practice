package com.nvz.gl309_8_1_sp14_spring_security.repository;

import com.nvz.gl309_8_1_sp14_spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// We'll use JpaRepository which gives us all the CRUD operations automatically
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByEmail(String email);
    public User findUserByUsername(String name);
}
