package jdbc.repository;

import java.util.List;

import bean.Produto;

public interface ProdutoDAO {

	boolean inserir(Produto Produto);
	boolean atualizar(Produto Produto);
	boolean excluir(Produto Produto);
	List<Produto> listar();
	List<Produto> pesquisarNome(String nome);
}
