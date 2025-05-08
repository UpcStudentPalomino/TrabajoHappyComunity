package com.trabajoaw.trabajoarquitecturaweb.Controllers;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.BloqueDTO;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceBloque;
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
public class ControllerBloque {
    @Autowired
    private InterfaceBloque interfaceBloque;

    @GetMapping("/TodosBloquess")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<BloqueDTO>> todosBloques() {
        log.info("lista de bloques");
        return ResponseEntity.ok(interfaceBloque.GetTodosBloques());
    }

    @PostMapping("/InsertarBloque")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<BloqueDTO> InsertarBloque(@RequestBody BloqueDTO bloque)throws Exception {
        log.info("insertar bloque {}",bloque.getLetraBloque());
        return ResponseEntity.ok(interfaceBloque.InsertarBloque(bloque));
    }
}
