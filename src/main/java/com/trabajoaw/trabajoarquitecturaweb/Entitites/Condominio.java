package com.trabajoaw.trabajoarquitecturaweb.Entitites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "condominios")
public class Condominio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "condominio_id")
    private Long idCondominio;
    private String nombre;
    private String direccion;

}
