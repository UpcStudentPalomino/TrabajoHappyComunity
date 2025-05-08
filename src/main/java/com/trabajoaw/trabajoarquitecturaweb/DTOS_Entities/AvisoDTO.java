package com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities;

import com.trabajoaw.trabajoarquitecturaweb.Entitites.Usuario;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvisoDTO implements Serializable {
    private Long id;
    private String titulo;
    private String descripcion;
    private String urlImangen;
    private LocalDate fechaPublicacion;
    private Usuario usuario;

}
