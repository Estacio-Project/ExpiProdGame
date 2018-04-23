package service;

import repository.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Conquista;

public class ConquistaService {

	private EntityManagerFactoryThread emf;

	public void add(Conquista conquista) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(conquista,EntityName.CONQUISTA, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Conquista conquista) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(conquista,EntityName.CONQUISTA, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Conquista conquista,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(conquista,EntityName.CONQUISTA, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.CONQUISTA, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
