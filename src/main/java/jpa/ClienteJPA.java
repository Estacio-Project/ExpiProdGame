package jpa;

import bean.Cliente;
import controller.ClienteController;

public class ClienteJPA {

	
	public static void main(String[] args) {
		ClienteController c = new ClienteController();
		//inserir
		int editionId = 28;
		int removeId =28;
		Cliente c1 = new Cliente("Gabriel","63547042011" );
		/*Cliente c2 = new Cliente("Matheus", "17452055004");
		Cliente c3 = new Cliente("Lucas", "84791608020");
		Cliente c4 = new Cliente("Excluir", "84791608020");
		*/
		//c.inserir(c1);
		
		//alterar
	/*	c1.setId(editionId);
		c1.setNome("Gabriel-Alterado2");
		c.alterar(c1);*/
		
		//excluir
		/*c1.setId(removeId);		 
		c.excluir(c1,removeId);*/
		//listar
		c.listar();
	}
}
