package com.trabajoaw.trabajoarquitecturaweb.Services;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.RecordatorioPagosDTO;
import com.trabajoaw.trabajoarquitecturaweb.Entitites.RecordatorioPagos;
import com.trabajoaw.trabajoarquitecturaweb.Interfaces.InterfaceRecordatorioPagos;
import com.trabajoaw.trabajoarquitecturaweb.Repositories.RepositoryRecordatorioPagos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceRecordatorioPagos implements InterfaceRecordatorioPagos {
    @Autowired
    private RepositoryRecordatorioPagos repoRecordatorioPagos;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<RecordatorioPagosDTO> GetTodosRecordatoriosPagos() {
        return repoRecordatorioPagos.findAll().stream().map(x -> modelMapper.map(x, RecordatorioPagosDTO.class)).collect(Collectors.toList());
    }

    @Override
    public RecordatorioPagosDTO InsertarRecordatorioPagos(RecordatorioPagosDTO recordatorioPagos) {
        RecordatorioPagos recordatorioPagos1 = modelMapper.map(recordatorioPagos, RecordatorioPagos.class);
        RecordatorioPagos recordatorioPagos2 = repoRecordatorioPagos.save(recordatorioPagos1);
        return modelMapper.map(recordatorioPagos2, RecordatorioPagosDTO.class);
    }
}
