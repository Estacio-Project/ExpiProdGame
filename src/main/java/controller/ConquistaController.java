package controller;

import service.ConquistaService;
import bean.Conquista;

public class ConquistaController {
	private ConquistaService conquistaService;
	
	public ConquistaController() {
		super();
		 conquistaService = new ConquistaService();
	}

	public void inserir(Conquista conquista){
		conquistaService.add(conquista);
	}
	
	public void alterar(Conquista conquista){
		conquistaService.upd(conquista);
	}
	
	public void excluir(Conquista conquista,int id){
		conquistaService.del(conquista, id);
	}
	
	public void listar(){
		conquistaService.all();
	}
	
}
