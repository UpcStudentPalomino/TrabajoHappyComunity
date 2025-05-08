package com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CondominioDTO implements Serializable {
    private Long id;
    private String nombre;
    private String direccion;
}
