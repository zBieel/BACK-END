package com.itb.lip2.agendamentus.service;

import com.itb.lip2.agendamentus.model.Agendamento;
import com.itb.lip2.agendamentus.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendamentoServicelmpl implements AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Override
    public List<Agendamento> findAll() {
        return agendamentoRepository.findAll();
    }

    @Override
    public Agendamento findById(Long id) {
        return agendamentoRepository.findById(id).get();
    }

    @Override
    public Agendamento saveAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento delete(Long id) {
        Agendamento agendamento = agendamentoRepository.findById(id).get();
        agendamentoRepository.deleteById(id);
        return agendamento;
    }

    @Override
    public Agendamento update(Long id, Agendamento agendamento) throws Exception {
        return agendamentoRepository.findById(id).map(ag -> {
            ag.setNome(agendamento.getNome());
            ag.setTelefone(agendamento.getTelefone());
            ag.setEmail(agendamento.getEmail());
            ag.setDataAgendamento(agendamento.getDataAgendamento());
            ag.setHorarioAgendamento(agendamento.getHorarioAgendamento());
            return agendamentoRepository.save(ag);
        }).orElseThrow(() -> new Exception("Agendamento não encontrado!"));
    }
}