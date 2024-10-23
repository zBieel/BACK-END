// src/main/java/com/itb/lip2/agendamentus/repository/AgendamentoRepository.java

package com.itb.lip2.agendamentus.repository;

import com.itb.lip2.agendamentus.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}