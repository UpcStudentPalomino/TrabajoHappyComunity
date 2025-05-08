package com.trabajoaw.trabajoarquitecturaweb.Services;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.AvisoDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Aviso;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceAviso;
import com.trabajoaw.trabajoarquitecturaweb.Repositories.RepositoryAviso;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceAviso implements InterfaceAviso {
    @Autowired
    private RepositoryAviso repoAviso;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<AvisoDTO> GetTodosAvisos() {
        return repoAviso.findAll().stream().map(x -> modelMapper.map(x, AvisoDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AvisoDTO InsertarAviso(AvisoDTO aviso) {
        Aviso aviso1 = modelMapper.map(aviso, Aviso.class);
        Aviso aviso2 = repoAviso.save(aviso1);
        return modelMapper.map(aviso2, AvisoDTO.class);


    }
}
