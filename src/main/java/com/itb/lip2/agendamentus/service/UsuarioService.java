package com.itb.lip2.agendamentus.service;

import java.util.List;
import java.util.Optional;
import com.itb.lip2.agendamentus.model.Cliente;
import com.itb.lip2.agendamentus.model.Funcionario;
import com.itb.lip2.agendamentus.model.Papel;
import com.itb.lip2.agendamentus.model.Usuario;

public interface UsuarioService {

	Usuario save(Usuario usuario);
	Usuario saveFuncionario(Funcionario funcionario);
	Usuario saveCliente(Cliente cliente);
	List<Usuario> findAll();
	List<Funcionario> findAllFuncionarios();
	List<Cliente> findAllClientes();
	Optional<Usuario> findById(Long id);
	Usuario findByUsername(String username);
	Usuario update(Long id, Usuario usuario) throws Exception;
	Usuario delete(Long id) throws Exception;
	Papel savePapel(Papel papel);
	void addPapelToUsuario(Usuario usuario, String nomePapel);
}