package controller;

import service.VendaService;
import bean.Venda;

public class VendaController {
	private VendaService vendaService;
	
	public VendaController() {
		super();
		 vendaService = new VendaService();
	}

	public void inserir(Venda venda){
		vendaService.add(venda);
	}
	
	public void alterar(Venda venda){
		vendaService.upd(venda);
	}
	
	public void excluir(Venda venda,int id){
		vendaService.del(venda, id);
	}
	
	public void listar(){
		vendaService.all();
	}
	
}
