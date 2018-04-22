package service;

import util.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.Usuario;

public class UsuarioService {

	private EntityManagerFactoryThread emf;

	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(usuario,EntityName.USUARIO, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(Usuario usuario) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(usuario,EntityName.USUARIO, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(Usuario usuario,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(usuario,EntityName.USUARIO, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.USUARIO, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	

}
