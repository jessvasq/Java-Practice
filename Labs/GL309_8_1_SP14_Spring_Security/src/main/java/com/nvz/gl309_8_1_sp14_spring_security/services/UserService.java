package com.nvz.gl309_8_1_sp14_spring_security.services;

import com.nvz.gl309_8_1_sp14_spring_security.UserDTO;
import com.nvz.gl309_8_1_sp14_spring_security.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String username);
    public void create(UserDTO userDTO);
    public User findUserByEmail(String email);
    public User findUserByName(String name);
}
