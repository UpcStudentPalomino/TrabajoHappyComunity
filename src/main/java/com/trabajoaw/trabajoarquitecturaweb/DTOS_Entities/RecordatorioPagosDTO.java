package com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities;

import com.trabajoaw.trabajoarquitecturaweb.Entitites.Usuario;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordatorioPagosDTO implements Serializable {
    private Long id;
    private LocalDate fechaLuz;
    private LocalDate fechaAgua;
    private LocalDate fechaInternet;
    private LocalDate fechaGas;
    private Usuario usuario;
}
