package service;

import util.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Fornecedor;

public class FornecedorService {

	private EntityManagerFactoryThread emf;

	public void add(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(fornecedor,EntityName.FORNECEDOR, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(fornecedor,EntityName.FORNECEDOR, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Fornecedor fornecedor,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(fornecedor,EntityName.FORNECEDOR, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.FORNECEDOR, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
