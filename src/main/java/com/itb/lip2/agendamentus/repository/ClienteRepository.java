package com.itb.lip2.agendamentus.repository;

import com.itb.lip2.agendamentus.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findById(Long id);
    @Query(value = "SELECT * FROM usuarios u WHERE u.email=?", nativeQuery = true)
    Cliente findByUsername(String nomeCliente);
}