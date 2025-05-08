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
public class ReunionDTO implements Serializable {
    private Long id;
    private String tema;
    private LocalDate fechaReunion;
    private String descripcion;
    private Usuario usuario;
}
