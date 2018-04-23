package service;

import repository.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Armazenamento;

public class ArmazenamentoService {

	private EntityManagerFactoryThread emf;

	public void add(Armazenamento armazenamento) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(armazenamento,EntityName.ARMAZENAMENTO, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Armazenamento armazenamento) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(armazenamento,EntityName.ARMAZENAMENTO, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Armazenamento armazenamento,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(armazenamento,EntityName.ARMAZENAMENTO, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.ARMAZENAMENTO, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
