package jpa;

import bean.Fornecedor;
import controller.FornecedorController;

public class FornecedorJPA {

	
	public static void main(String[] args) {
		FornecedorController c = new FornecedorController();
		//inserir
		int editionId = 32;
		int removeId =32;
	/*	Fornecedor f1 = new Fornecedor("ESTACIO","1745205500413" );
		
		c.inserir(f1);
		*/
		//alterar
		/*f1.setId(editionId);
		f1.setNome("Alterado");
		c.alterar(f1);*/
		
		//excluir
		/*f1.setId(removeId);		 
		c.excluir(f1,removeId);*/
		//listar
		c.listar();
	}
}
