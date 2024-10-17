package com.itb.lip2.agendamentus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
@DiscriminatorValue(value = "Cliente")
public class Cliente extends Usuario {

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, String telefone, String mensagem, String tipoUsuario, Collection<Papel> papeis) {
        super(id, nome, email, tipoUsuario, papeis);
        this.telefone = telefone;
        this.mensagem = mensagem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}