package com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities;

import com.trabajoaw.trabajoarquitecturaweb.Entitites.Bloque;
import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private Long numeroTelefono;
    private String correo;
    private Long nroDepartamento;
    private Bloque bloque;
}
