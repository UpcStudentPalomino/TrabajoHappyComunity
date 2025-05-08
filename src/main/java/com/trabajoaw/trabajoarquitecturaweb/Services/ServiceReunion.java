package com.trabajoaw.trabajoarquitecturaweb.Services;

import com.trabajoaw.trabajoarquitecturaweb.DTOS.ReunionesSegunFechafineinicio;
import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.ReunionDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Reunion;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceReunion;
import com.trabajoaw.trabajoarquitecturaweb.Repositories.RepositoryReunion;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceReunion implements InterfaceReunion {
    @Autowired
    private RepositoryReunion repoReunion;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ReunionDTO> GetTodasReuniones() {
        return repoReunion.findAll().stream().map(x -> modelMapper.map(x, ReunionDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ReunionDTO InsertarReunion(ReunionDTO reunion) {
        Reunion reunion1 = modelMapper.map(reunion, Reunion.class);
        Reunion reunion2 = repoReunion.save(reunion1);
        return modelMapper.map(reunion2, ReunionDTO.class);
    }

    @Override
    public List<ReunionesSegunFechafineinicio> Gettodasreuinonesentreinicioyfin(LocalDate fechainicio, LocalDate fechafin) {
        return modelMapper.map(repoReunion.Gettodasreuinonesentreinicioyfin(fechainicio,fechafin), List.class);
    }
}
