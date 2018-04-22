package controller;

import service.UsuarioService;
import bean.Usuario;

public class UsuarioController {
	private UsuarioService usuarioService;
	
	public UsuarioController() {
		super();
		 usuarioService = new UsuarioService();
	}

	public void inserir(Usuario usuario){
		usuarioService.add(usuario);
	}
	
	public void alterar(Usuario usuario){
		usuarioService.upd(usuario);
	}
	
	public void excluir(Usuario usuario,int id){
		usuarioService.del(usuario, id);
	}
	
	public void listar(){
		usuarioService.all();
	}
	
}
