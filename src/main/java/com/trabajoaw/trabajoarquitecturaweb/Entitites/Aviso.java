package com.trabajoaw.trabajoarquitecturaweb.Entitites;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "avisos")
public class Aviso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aviso_id")
    private Long idAviso;
    private String titulo;
    private String descripcion;
    private String urlImangen;
    private LocalDate fechaPublicacion;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
