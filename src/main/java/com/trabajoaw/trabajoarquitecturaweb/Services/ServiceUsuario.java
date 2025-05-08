package com.trabajoaw.trabajoarquitecturaweb.Services;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.UsuarioDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Usuario;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceUsuario;
import com.trabajoaw.trabajoarquitecturaweb.Repositories.RepositoryUsuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceUsuario implements InterfaceUsuario {
    @Autowired
    private RepositoryUsuario repoVecino;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<UsuarioDTO> GetTodosUsuarios() {
        return repoVecino.findAll().stream().map(usuario -> modelMapper.map(usuario, UsuarioDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO InsertarUsuario(UsuarioDTO usuario) {
        Usuario usuario1 = modelMapper.map(usuario, Usuario.class);
        Usuario usuario2 = repoVecino.save(usuario1);
        return modelMapper.map(usuario2, UsuarioDTO.class);
    }
}
