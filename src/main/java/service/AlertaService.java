package service;

import repository.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Alerta;

public class AlertaService {

	private EntityManagerFactoryThread emf;

	public void add(Alerta alerta) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(alerta,EntityName.ALERTA, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Alerta alerta) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(alerta,EntityName.ALERTA, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Alerta alerta,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(alerta,EntityName.ALERTA, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.ALERTA, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
