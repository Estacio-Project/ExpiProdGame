package controller;

import service.ArmazenamentoService;
import bean.Armazenamento;

public class ArmazenamentoController {
	private ArmazenamentoService armazenamentoService;
	
	public ArmazenamentoController() {
		super();
		 armazenamentoService = new ArmazenamentoService();
	}

	public void inserir(Armazenamento armazenamento){
		armazenamentoService.add(armazenamento);
	}
	
	public void alterar(Armazenamento armazenamento){
		armazenamentoService.upd(armazenamento);
	}
	
	public void excluir(Armazenamento armazenamento,int id){
		armazenamentoService.del(armazenamento, id);
	}
	
	public void listar(){
		armazenamentoService.all();
	}
	
}
