package jpa;

import java.util.Calendar;
import java.util.Date;

import bean.Alerta;
import controller.AlertaController;

public class AlertaJPA {

	
	public static void main(String[] args) {
		AlertaController c = new AlertaController();
		//inserir
		int editionId = 34;
		int removeId =34;
		Alerta c1 = new Alerta("alerta1","test1",new Date());

		//c.inserir(c1);
		
		//alterar
		c1.setId(editionId);
		c1.setNome("Alterado");
		c.alterar(c1);
		
		//excluir
		c1.setId(removeId);		 
		c.excluir(c1,removeId);
		//listar
		c.listar();
	}
}
