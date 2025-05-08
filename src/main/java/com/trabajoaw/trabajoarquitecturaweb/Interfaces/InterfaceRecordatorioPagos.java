package com.trabajoaw.trabajoarquitecturaweb.Interfaces;

import com.trabajoaw.trabajoarquitecturaweb.DTOS_Entities.RecordatorioPagosDTO;

import java.util.List;

public interface InterfaceRecordatorioPagos {
    public List<RecordatorioPagosDTO> GetTodosRecordatoriosPagos();
    public RecordatorioPagosDTO InsertarRecordatorioPagos(RecordatorioPagosDTO recordatorioPagos);
}
