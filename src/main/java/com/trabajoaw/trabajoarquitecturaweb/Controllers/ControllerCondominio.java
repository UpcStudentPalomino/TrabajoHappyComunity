package com.trabajoaw.trabajoarquitecturaweb.Controllers;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.CondominioDTO;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceCondominio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@CrossOrigin(origins = "${ip.frontend}", allowCredentials = "true", exposedHeaders = "Authorization") //para cloud
@RequestMapping("/api")
public class ControllerCondominio {
    @Autowired
    private InterfaceCondominio interfaceCondominio;

    @GetMapping("/TodosCondominios")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<CondominioDTO>> todosCondominios() {
        log.info("lista de los condominios");
        return ResponseEntity.ok(interfaceCondominio.GetTodosCondominios());
    }

    @PostMapping("/InsertarCondominio")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CondominioDTO> InsertarCondominio(@RequestBody CondominioDTO condominio) throws Exception {
        log.info("insertar condominio {}", condominio.getNombre());
        return ResponseEntity.ok(interfaceCondominio.InsertarCondominio(condominio));
    }
}
