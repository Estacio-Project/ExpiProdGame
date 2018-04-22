package controller;

import service.ClienteService;
import bean.Cliente;

public class ClienteController {
	private ClienteService clienteService;
	
	public ClienteController() {
		super();
		 clienteService = new ClienteService();
	}

	public void inserir(Cliente cliente){
		clienteService.add(cliente);
	}
	
	public void alterar(Cliente cliente){
		clienteService.upd(cliente);
	}
	
	public void excluir(Cliente cliente,int id){
		clienteService.del(cliente, id);
	}
	
	public void listar(){
		clienteService.all();
	}
	
}
