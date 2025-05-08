package com.trabajoaw.trabajoarquitecturaweb.Controllers;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.UsuarioDTO;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceUsuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true", exposedHeaders = "Authorization") //para cloud
@RequestMapping("/api")
public class ControllerUsuario {
    @Autowired
    private InterfaceUsuario interfaceVecino;

    @GetMapping("/TodosUsuario")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UsuarioDTO>> todosUsuario() {
        log.info("Lista de usuarios");
        return ResponseEntity.ok(interfaceVecino.GetTodosUsuarios());
    }

    @PostMapping("/InsertarUsuario")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UsuarioDTO> InsertarUsuario(@RequestBody UsuarioDTO usuario) throws Exception {
        log.info("Insertar usuario {}", usuario.getNombre());
        return ResponseEntity.ok(interfaceVecino.InsertarUsuario(usuario));
    }
}
