package controller;

import service.FornecedorService;
import bean.Fornecedor;

public class FornecedorController {
	private FornecedorService fornecedorService;
	
	public FornecedorController() {
		super();
		 fornecedorService = new FornecedorService();
	}

	public void inserir(Fornecedor fornecedor){
		fornecedorService.add(fornecedor);
	}
	
	public void alterar(Fornecedor fornecedor){
		fornecedorService.upd(fornecedor);
	}
	
	public void excluir(Fornecedor fornecedor,int id){
		fornecedorService.del(fornecedor, id);
	}
	
	public void listar(){
		fornecedorService.all();
	}
	
}
