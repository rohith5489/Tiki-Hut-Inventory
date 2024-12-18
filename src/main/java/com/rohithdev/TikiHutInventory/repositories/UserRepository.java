package com.rohithdev.TikiHutInventory.repositories;

import com.rohithdev.TikiHutInventory.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}

