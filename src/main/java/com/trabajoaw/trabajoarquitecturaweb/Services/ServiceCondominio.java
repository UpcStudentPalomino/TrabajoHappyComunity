package com.trabajoaw.trabajoarquitecturaweb.Services;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.CondominioDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.Condominio;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceCondominio;
import com.trabajoaw.trabajoarquitecturaweb.Repositories.RepositoryCondominio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCondominio implements InterfaceCondominio {
    @Autowired
    private RepositoryCondominio repoCondominio;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RepositoryCondominio repositoryCondominio;

    @Override
    public List<CondominioDTO> GetTodosCondominios() {
        return repositoryCondominio.findAll().stream().map(x -> modelMapper.map(x, CondominioDTO.class)).collect(Collectors.toList());
    }

    @Override
    public CondominioDTO InsertarCondominio(CondominioDTO condominio) {
        Condominio condominio1 = modelMapper.map(condominio, Condominio.class);
        Condominio condominio2 = repositoryCondominio.save(condominio1);
        return modelMapper.map(condominio2, CondominioDTO.class);
    }
}
