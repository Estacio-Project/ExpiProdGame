package jdbc.repository;

import java.util.List;

import bean.Cliente;

public interface ClienteDAO {

	boolean inserir(Cliente Cliente);
	boolean atualizar(Cliente Cliente);
	boolean excluir(Cliente Cliente);
	List<Cliente> listar();
	List<Cliente> pesquisarNome(String nome);
	List<Cliente> pesquisarCpf(int cpf);
}
