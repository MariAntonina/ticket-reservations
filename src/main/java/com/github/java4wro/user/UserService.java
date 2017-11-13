package com.github.java4wro.user;

import com.github.java4wro.user.dto.UserDTO;

import java.util.List;


public interface UserService {

    UserDTO findUser(String userEmail);
    void addUSer(UserDTO userDTO);

    List<UserDTO> getAll();
}
