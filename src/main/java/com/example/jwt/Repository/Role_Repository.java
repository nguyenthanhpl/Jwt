package com.example.jwt.Repository;

import com.example.jwt.Model.ERoles;
import com.example.jwt.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Role_Repository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERoles name);
}
