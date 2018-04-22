package controller;

import service.MonitorConsumoService;
import bean.MonitorConsumo;

public class MonitorConsumoController {
	private MonitorConsumoService monitorconsumoService;
	
	public MonitorConsumoController() {
		super();
		 monitorconsumoService = new MonitorConsumoService();
	}

	public void inserir(MonitorConsumo monitorconsumo){
		monitorconsumoService.add(monitorconsumo);
	}
	
	public void alterar(MonitorConsumo monitorconsumo){
		monitorconsumoService.upd(monitorconsumo);
	}
	
	public void excluir(MonitorConsumo monitorconsumo,int id){
		monitorconsumoService.del(monitorconsumo, id);
	}
	
	public void listar(){
		monitorconsumoService.all();
	}
	
}
