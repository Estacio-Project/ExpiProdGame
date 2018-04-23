package service;

import repository.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Cliente;

public class ClienteService {

	private EntityManagerFactoryThread emf;

	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(cliente,EntityName.CLIENTE, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Cliente cliente) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(cliente,EntityName.CLIENTE, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Cliente cliente,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(cliente,EntityName.CLIENTE, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.CLIENTE, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
