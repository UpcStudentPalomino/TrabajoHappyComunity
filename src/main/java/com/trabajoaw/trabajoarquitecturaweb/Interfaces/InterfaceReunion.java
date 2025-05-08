package com.trabajoaw.trabajoarquitecturaweb.Interfaces;

import com.trabajoaw.trabajoarquitecturaweb.DTOS.ReunionesSegunFechafineinicio;
import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.ReunionDTO;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface InterfaceReunion {
    public List<ReunionDTO> GetTodasReuniones();
    public ReunionDTO InsertarReunion(ReunionDTO reunion);
    public List<ReunionesSegunFechafineinicio> Gettodasreuinonesentreinicioyfin(LocalDate fechainicio, LocalDate fechafin);

}
