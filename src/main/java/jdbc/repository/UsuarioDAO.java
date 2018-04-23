package jdbc.repository;

import java.util.List;

import bean.Usuario;

public interface UsuarioDAO {

	boolean inserir(Usuario Usuario);
	boolean atualizar(Usuario Usuario);
	boolean excluir(Usuario Usuario);
	List<Usuario> listarTodosUsuarios();
	List<Usuario> pesquisarLogin(String nome);
}
