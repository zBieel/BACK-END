package com.itb.lip2.agendamentus.service;

import com.itb.lip2.agendamentus.model.Agendamento;
import java.util.List;

public interface AgendamentoService {
    List<Agendamento> findAll();
    Agendamento findById(Long id);
    Agendamento saveAgendamento(Agendamento agendamento);
    Agendamento delete(Long id);
    Agendamento update(Long id, Agendamento agendamento) throws Exception;
}