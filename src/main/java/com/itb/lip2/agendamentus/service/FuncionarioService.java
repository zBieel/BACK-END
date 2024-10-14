package com.itb.lip2.agendamentus.service;

import com.itb.lip2.agendamentus.model.Funcionario;
import com.itb.lip2.agendamentus.model.Usuario;

public interface FuncionarioService {

    Funcionario update(Long id, Funcionario funcionario) throws Exception;
    Funcionario delete(Long id) throws Exception;

}
