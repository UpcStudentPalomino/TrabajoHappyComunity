package com.trabajoaw.trabajoarquitecturaweb.Interfaces;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.CondominioDTO;

import java.util.List;

public interface InterfaceCondominio {
    public List<CondominioDTO> GetTodosCondominios();
    public CondominioDTO InsertarCondominio(CondominioDTO condominio);
}
