package com.trabajoaw.trabajoarquitecturaweb.Entitites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bloques")
public class Bloque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bloque_id")
    private Long idBloque;
    private String letraBloque;
    @ManyToOne
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;
}
