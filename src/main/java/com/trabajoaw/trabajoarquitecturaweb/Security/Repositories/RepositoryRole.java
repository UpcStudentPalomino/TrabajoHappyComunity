package com.trabajoaw.trabajoarquitecturaweb.Security.Repositories;

import com.trabajoaw.trabajoarquitecturaweb.Security.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRole extends JpaRepository<Role, Long> {
}
