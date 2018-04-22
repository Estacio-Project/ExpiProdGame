package jpa;

import java.util.Calendar;
import java.util.Date;

import bean.Badge;
import controller.BadgeController;

public class BadgeJPA {

	
	public static void main(String[] args) {
		BadgeController c = new BadgeController();
		//inserir
		int editionId = 34;
		int removeId =34;
		Badge c1 = new Badge("Expert","test");

		c.inserir(c1);
		
		//alterar
		/*c1.setId(editionId);
		c1.setNome("Alterado");
		c.alterar(c1);
		*/
		//excluir
		/*c1.setId(removeId);		 
		c.excluir(c1,removeId)*/;
		//listar
		c.listar();
	}
}
