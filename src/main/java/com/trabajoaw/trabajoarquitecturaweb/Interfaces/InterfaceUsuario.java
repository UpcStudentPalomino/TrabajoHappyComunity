package com.trabajoaw.trabajoarquitecturaweb.Interfaces;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.UsuarioDTO;

import java.util.List;

public interface InterfaceUsuario {
    public List<UsuarioDTO> GetTodosUsuarios();
    public UsuarioDTO InsertarUsuario(UsuarioDTO usuario);
}
