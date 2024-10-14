package com.itb.lip2.agendamentus.repository;

import com.itb.lip2.agendamentus.model.Funcionario;
import com.itb.lip2.agendamentus.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> findById(Long id);
    @Query(value = "SELECT * FROM usuarios u WHERE u.email=?", nativeQuery = true)
    Usuario findByUsername(String username);
}
