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
@Table(name = "recordatorioPagos")
public class RecordatorioPagos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "recordatoriopagos_id")
    private Long idRecordatorioPagos;
    private LocalDate fechaLuz;
    private LocalDate fechaAgua;
    private LocalDate fechaInternet;
    private LocalDate fechaGas;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


}
