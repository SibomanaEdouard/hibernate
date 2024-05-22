package com.example.demo.Repositories;

import com.example.demo.models.Company;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
//    @Override
    Optional<User> findByEmail(String email);
}
