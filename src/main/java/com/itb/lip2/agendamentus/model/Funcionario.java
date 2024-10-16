package com.itb.lip2.agendamentus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
@DiscriminatorValue(value = "Funcionario")
public class Funcionario extends Usuario {

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
}