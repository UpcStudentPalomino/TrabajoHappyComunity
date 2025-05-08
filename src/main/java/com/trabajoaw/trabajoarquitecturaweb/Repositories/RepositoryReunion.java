package com.trabajoaw.trabajoarquitecturaweb.Repositories;

import com.trabajoaw.trabajoarquitecturaweb.DTOS.ReunionesSegunFechafineinicio;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RepositoryReunion extends JpaRepository<Reunion, Long> {

    @Query("select new com.trabajoaw.trabajoarquitecturaweb.DTOS.ReunionesSegunFechafineinicio(r.id, r.tema) " +
            "From Reunion r where r.fechaReunion between :fechainicio and :fechafin")
    public List<ReunionesSegunFechafineinicio> Gettodasreuinonesentreinicioyfin( @Param("fechainicio") LocalDate fechainicio, @Param("fechafin") LocalDate fechafin);
}
