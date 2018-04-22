package jpa;

import bean.MonitorConsumo;
import controller.MonitorConsumoController;

public class MonitorConsumoJPA {

	
	public static void main(String[] args) {
		MonitorConsumoController c = new MonitorConsumoController();
		//inserir
		int editionId = 28;
		int removeId =28;
		MonitorConsumo c1 = new MonitorConsumo("NO PRAZO", 7);
		
		//c.inserir(c1);
		
		//alterar
	/*	c1.setId(editionId);
		c1.setNome("Alterado2");
		c.alterar(c1);*/
		
		//excluir
		/*c1.setId(removeId);		 
		c.excluir(c1,removeId);*/
		//listar
		c.listar();
	}
}
