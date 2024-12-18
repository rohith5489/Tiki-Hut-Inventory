package com.rohithdev.TikiHutInventory.services;

import com.rohithdev.TikiHutInventory.dtos.LoginRequest;
import com.rohithdev.TikiHutInventory.dtos.RegisterRequest;
import com.rohithdev.TikiHutInventory.dtos.Response;
import com.rohithdev.TikiHutInventory.dtos.UserDTO;
import com.rohithdev.TikiHutInventory.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}

