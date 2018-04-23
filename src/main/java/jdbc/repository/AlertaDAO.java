package jdbc.repository;

import java.util.List;

import bean.Alerta;

public interface AlertaDAO {

	boolean inserir(Alerta alerta);
	boolean atualizar(Alerta alerta);
	boolean excluir(Alerta alerta);
	List<Alerta> listarTodosAlertas();
	List<Alerta> pesquisarNome(String nome);
}
