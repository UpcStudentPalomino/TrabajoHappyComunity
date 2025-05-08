package com.trabajoaw.trabajoarquitecturaweb.Controllers;

import com.trabajoaw.trabajoarquitecturaweb.DTOS.ReunionesSegunFechafineinicio;
import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.ReunionDTO;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceReunion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "${ip.frontend}", allowCredentials = "true", exposedHeaders = "Authorization") //para cloud
@RequestMapping("/api")
public class ControllerReunion {
    @Autowired
    private InterfaceReunion interfaceReunion;

    @GetMapping("/TodasReuniones")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<ReunionDTO>> todasReuniones() {
        log.info("Todas las Reuniones");
        return ResponseEntity.ok(interfaceReunion.GetTodasReuniones());
    }

    @PostMapping("/InsertarReunion")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ReunionDTO> InsertarReunion(@RequestBody ReunionDTO reunion) throws Exception {
        log.info("Insertar Reunion con tema {}", reunion.getTema());
        return ResponseEntity.ok(interfaceReunion.InsertarReunion(reunion));
    }

    @GetMapping("/ReunionesEntre/{fechainicio}/{fechafin}")
    public ResponseEntity<List<ReunionesSegunFechafineinicio>> GettodasReuniones(@PathVariable("fechainicio") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechainicio, @PathVariable("fechafin") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechafin) {
        return ResponseEntity.ok(interfaceReunion.Gettodasreuinonesentreinicioyfin(fechainicio, fechafin));
    }

}
