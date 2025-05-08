package com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities;

import com.trabajoaw.trabajoarquitecturaweb.Entitites.Condominio;
import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BloqueDTO implements Serializable {
    private Long id;
    private String letraBloque;
    private Condominio condominio;
}
