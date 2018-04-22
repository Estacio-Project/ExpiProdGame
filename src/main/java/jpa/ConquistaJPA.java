package jpa;

import java.util.Calendar;
import java.util.Date;

import bean.Conquista;
import controller.ConquistaController;

public class ConquistaJPA {

	
	public static void main(String[] args) {
		ConquistaController c = new ConquistaController();
		//inserir
		int editionId = 34;
		int removeId =34;
		Conquista c1 = new Conquista("Diamante","test1");

		c.inserir(c1);
		
		//alterar
	/*	c1.setId(editionId);
		c1.setNome("Alterado");
		c.alterar(c1);*/
		
		//excluir
		/*c1.setId(removeId);		 
		c.excluir(c1,removeId);
		//listar
		c.listar();*/
	}
}
