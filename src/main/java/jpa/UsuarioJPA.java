package jpa;

import bean.Usuario;
import controller.UsuarioController;

public class UsuarioJPA {

	
	public static void main(String[] args) {
		UsuarioController uc = new UsuarioController();
		//inserir
		int editionId = 21;
		int removeId =24;
				
		Usuario u = new Usuario("test", "12345");
		uc.inserir(u);
		//alterar
		 u = new Usuario("test20", "12345");
		 u.setId(editionId);
		uc.alterar(u);
		 u = new Usuario("test", "12345");
		 u.setId(removeId);
		//excluir
		uc.excluir(u,removeId);
		//listar
		uc.listar();
	}
}
