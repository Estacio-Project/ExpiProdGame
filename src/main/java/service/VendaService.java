package service;

import repository.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Venda;

public class VendaService {

	private EntityManagerFactoryThread emf;

	public void add(Venda venda) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(venda,EntityName.VENDA, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Venda venda) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(venda,EntityName.VENDA, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Venda venda,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(venda,EntityName.VENDA, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.VENDA, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
