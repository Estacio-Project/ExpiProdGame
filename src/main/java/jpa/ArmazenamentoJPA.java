package jpa;

import java.util.Calendar;
import java.util.Date;

import bean.Armazenamento;
import controller.ArmazenamentoController;

public class ArmazenamentoJPA {

	
	public static void main(String[] args) {
		ArmazenamentoController c = new ArmazenamentoController();
		//inserir
		int editionId = 34;
		int removeId =34;
		Armazenamento c1 = new Armazenamento("Armario","Inserindo armario");

		c.inserir(c1);
		
		//alterar
		/*c1.setId(editionId);
		c1.setNome("Alterado");
		c.alterar(c1);*/
		
		//excluir
	/*	c1.setId(removeId);		 
		c.excluir(c1,removeId);
*/		//listar
		c.listar();
	}
}
