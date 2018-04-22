package controller;

import service.AlertaService;
import bean.Alerta;

public class AlertaController {
	private AlertaService alertaService;
	
	public AlertaController() {
		super();
		 alertaService = new AlertaService();
	}

	public void inserir(Alerta alerta){
		alertaService.add(alerta);
	}
	
	public void alterar(Alerta alerta){
		alertaService.upd(alerta);
	}
	
	public void excluir(Alerta alerta,int id){
		alertaService.del(alerta, id);
	}
	
	public void listar(){
		alertaService.all();
	}
	
}
