package com.itb.lip2.agendamentus.controller;


import com.itb.lip2.agendamentus.model.Agendamento;
import com.itb.lip2.agendamentus.model.Funcionario;
import com.itb.lip2.agendamentus.service.AgendamentoService;
import com.itb.lip2.agendamentus.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/agendamentus/api/v1/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;
    private final AgendamentoService agendamentoService;
    public FuncionarioController(FuncionarioService funcionarioService, AgendamentoService agendamentoService) {
        this.funcionarioService = funcionarioService;
        this.agendamentoService = agendamentoService;
    }

    @GetMapping("/agendamentos")
    public ResponseEntity<java.util.List<Agendamento>> listarAgendamentos() {
        java.util.List<Agendamento> agendamentos = agendamentoService.findAll();
        return ResponseEntity.ok().body(agendamentos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFuncionario(@RequestBody Funcionario funcionario, @PathVariable(value="id") Long id) {
        try {
            return ResponseEntity.ok().body(funcionarioService.update(id, funcionario));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
