package com.trabajoaw.trabajoarquitecturaweb.Repositories;

import com.trabajoaw.trabajoarquitecturaweb.Entitites.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
}
