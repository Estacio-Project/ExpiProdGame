package jdbc;

import bean.Cliente;
import controller.ClienteController;

public class ClienteJPA {

	
	public static void main(String[] args) {
		ClienteController uc = new ClienteController();
		//inserir
		int editionId = 1;
		int removeId =4;
		Cliente c1 = new Cliente("Gabriel","63547042011" );
		Cliente c2 = new Cliente("Matheus", "17452055004");
		Cliente c3 = new Cliente("Lucas", "84791608020");
		Cliente c4 = new Cliente("Excluir", "84791608020");
		uc.inserir(c1);
		//alterar
		c1.setId(editionId);
		c1.setNome("Gabriel-Alterado");
		uc.alterar(c1);
		
		//excluir
		c4.setId(removeId);		 
		uc.excluir(c4,removeId);
		//listar
		uc.listar();
	}
}
