package com.trabajoaw.trabajoarquitecturaweb.Interfaces;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.BloqueDTO;

import java.util.List;

public interface InterfaceBloque {
    public List<BloqueDTO> GetTodosBloques();
    public BloqueDTO InsertarBloque(BloqueDTO bloque);
}
