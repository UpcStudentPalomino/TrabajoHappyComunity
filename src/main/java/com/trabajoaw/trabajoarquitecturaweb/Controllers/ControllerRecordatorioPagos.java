package com.trabajoaw.trabajoarquitecturaweb.Controllers;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.RecordatorioPagosDTO;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceRecordatorioPagos;
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
public class ControllerRecordatorioPagos {
    @Autowired
    private InterfaceRecordatorioPagos interfaceRecordatorioPagos;

    @GetMapping("/TodosRecordatoriosPagos")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<RecordatorioPagosDTO>> todosRecordatoriosPagos() {
        log.info("lista de recordatorios pagos");
        return ResponseEntity.ok(interfaceRecordatorioPagos.GetTodosRecordatoriosPagos());
    }

    @PostMapping("/InsertarRecordatorioPagos")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<RecordatorioPagosDTO> InsertarRecordatorioPagos(@RequestBody RecordatorioPagosDTO recordatorioPagos) throws Exception {
        log.info("insertar recordatorio pagos del {}",  recordatorioPagos.getUsuario());
        return ResponseEntity.ok(interfaceRecordatorioPagos.InsertarRecordatorioPagos(recordatorioPagos));
    }
}
