package com.trabajoaw.trabajoarquitecturaweb.Security.Repositories;

import com.trabajoaw.trabajoarquitecturaweb.Security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface RepositoryUser extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);


    @Transactional
    @Modifying
    @Query(value = "INSERT INTO user_roles (user_id, role_id ) VALUES (:user_id, :rol_id)", nativeQuery = true)
    public Integer insertUserRol(@Param("user_id") Long user_id, @Param("rol_id") Long rol_id);
}
