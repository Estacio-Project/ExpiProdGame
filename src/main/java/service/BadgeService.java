package service;

import util.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Badge;

public class BadgeService {

	private EntityManagerFactoryThread emf;

	public void add(Badge badge) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(badge,EntityName.BADGE, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Badge badge) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(badge,EntityName.BADGE, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Badge badge,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(badge,EntityName.BADGE, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.BADGE, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
