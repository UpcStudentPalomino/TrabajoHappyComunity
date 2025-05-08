package com.trabajoaw.trabajoarquitecturaweb.Interfaces;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.AvisoDTO;

import java.util.List;

public interface InterfaceAviso {
    public List<AvisoDTO> GetTodosAvisos();
    public AvisoDTO InsertarAviso(AvisoDTO aviso);
}
