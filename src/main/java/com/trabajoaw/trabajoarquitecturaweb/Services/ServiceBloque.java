package com.trabajoaw.trabajoarquitecturaweb.Services;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.BloqueDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Bloque;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceBloque;
import com.trabajoaw.trabajoarquitecturaweb.Repositories.RepositoryBloque;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceBloque implements InterfaceBloque {
    @Autowired
    private RepositoryBloque repoBloque;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<BloqueDTO> GetTodosBloques() {
        return repoBloque.findAll().stream().map(x -> modelMapper.map(x, BloqueDTO.class)).collect(Collectors.toList());
    }

    @Override
    public BloqueDTO InsertarBloque(BloqueDTO bloque) {
        Bloque bloque1 = modelMapper.map(bloque, Bloque.class);
        Bloque bloque2 = repoBloque.save(bloque1);
        return modelMapper.map(bloque2, BloqueDTO.class);
    }
}
