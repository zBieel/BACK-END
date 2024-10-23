package com.itb.lip2.agendamentus.controller;

import com.itb.lip2.agendamentus.model.Agendamento;
import com.itb.lip2.agendamentus.model.Funcionario;
import com.itb.lip2.agendamentus.service.AgendamentoService;
import com.itb.lip2.agendamentus.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentus/api/v1/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    private final AgendamentoService agendamentoService;
    FuncionarioController(FuncionarioService funcionarioService, AgendamentoService agendamentoService) {
        this.funcionarioService = funcionarioService;
        this.agendamentoService = agendamentoService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFuncionario(@RequestBody Funcionario funcionario, @PathVariable(value="id") Long id) {
        try {
            return ResponseEntity.ok().body(funcionarioService.update(id, funcionario));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping("/agendamento/{id}")
    public ResponseEntity<Object> updateAgendamento(@RequestBody Agendamento agendamento, @PathVariable(value="id") Long id) {
        try {
            return ResponseEntity.ok().body(agendamentoService.update(id, agendamento));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/agendamentos")
    public ResponseEntity<java.util.List<Agendamento>> listarAgendamentos() {
        java.util.List<Agendamento> agendamentos = agendamentoService.findAll();
        return ResponseEntity.ok().body(agendamentos);
    }

    @PostMapping("/agendamento")
    public ResponseEntity<Object> saveAgendamento(@RequestBody Agendamento agendamento) {
        try {
            return ResponseEntity.ok().body(agendamentoService.saveAgendamento(agendamento));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/agendamento/{id}")
    public ResponseEntity<Object> deleteAgendamento(@PathVariable(value = "id") Long id) {
        try{
            return ResponseEntity.ok().body(agendamentoService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable(value = "id") Long id) {
        try{
            return ResponseEntity.ok().body(funcionarioService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
