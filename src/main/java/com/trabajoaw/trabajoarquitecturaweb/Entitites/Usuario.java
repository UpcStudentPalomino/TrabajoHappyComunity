package com.trabajoaw.trabajoarquitecturaweb.Entitites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuario_id")
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private Long numeroTelefono;
    private String correo;
    private Long nroDepartamento;
    @ManyToOne
    @JoinColumn(name = "bloque_id")
    private Bloque bloque;

}

