package com.trabajoaw.trabajoarquitecturaweb.Controllers;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.AvisoDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Aviso;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceAviso;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin(origins = "${ip.frontend}", allowCredentials = "true", exposedHeaders = "Authorization") //para cloud
@RequestMapping("/api")
public class ControllerAviso {
    @Autowired
    private InterfaceAviso interfaceAviso;

    @GetMapping("/TodosAvisos")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<AvisoDTO>> todosAvisos() {
        log.info("Lista de Avisos");
        return ResponseEntity.ok(interfaceAviso.GetTodosAvisos());
    }

    @PostMapping("/InsertarAviso")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<AvisoDTO> InsertarAviso(@RequestBody AvisoDTO aviso) throws Exception {
        log.info("Insertar aviso {}", aviso.getTitulo() );
        return ResponseEntity.ok(interfaceAviso.InsertarAviso(aviso));
    }
}
