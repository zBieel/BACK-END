package com.itb.lip2.agendamentus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@DiscriminatorValue(value = "Funcionario")
public class Funcionario extends Usuario {

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.MERGE)
    @JsonIgnore
    private List<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String email, String senha,String tipoUsuario, Collection<Papel> papeis) {
        super(id, nome, email, tipoUsuario, papeis);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}