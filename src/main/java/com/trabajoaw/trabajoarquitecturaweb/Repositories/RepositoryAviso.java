package com.trabajoaw.trabajoarquitecturaweb.Repositories;

import com.trabajoaw.trabajoarquitecturaweb.Entitites.Aviso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryAviso extends JpaRepository<Aviso, Long> {
}
