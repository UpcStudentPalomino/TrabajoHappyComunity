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
@Table(name = "reuniones")
public class Reunion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reunion_id")
    private Long idReunion;
    private String tema;
    private LocalDate fechaReunion;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
