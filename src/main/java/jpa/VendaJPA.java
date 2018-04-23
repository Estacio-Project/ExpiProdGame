package jpa;

import java.util.Calendar;
import java.util.Date;

import bean.Venda;
import controller.VendaController;

public class VendaJPA {

	
	public static void main(String[] args) {
		VendaController c = new VendaController();
		//inserir
		int editionId = 34;
		int removeId =34;
		Date d = new Date();
		d.setDate(23);
		d.setMonth(Calendar.MAY);
		Venda c1 = new Venda("venda1",15,false,new Date(), d);

		c.inserir(c1);
		
		//alterar
		/*c1.setId(editionId);
		c1.setNome("Alterado");
		c.alterar(c1);*/
		
		//excluir
		/*c1.setId(removeId);		 
		c.excluir(c1,removeId);*/
		//listar
		c.listar();
	}
}
