package service;

import repository.EntityManagerFactoryThread;
import util.EntityName;
import util.Operacao;
import bean.MonitorConsumo;

public class MonitorConsumoService {

	private EntityManagerFactoryThread emf;

	public void add(MonitorConsumo monitorconsumo) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(monitorconsumo,EntityName.MONITORCONSUMO, Operacao.INSERIR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void upd(MonitorConsumo monitorconsumo) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(monitorconsumo,EntityName.MONITORCONSUMO, Operacao.ALTERAR.ordinal(),0);
		new Thread(emf).start();
	}

	public void del(MonitorConsumo monitorconsumo,int id) {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(monitorconsumo,EntityName.MONITORCONSUMO, Operacao.EXCLUIR.ordinal(),id);
		new Thread(emf).start();
	}

	public void all() {
		// TODO Auto-generated method stub
		emf =  new EntityManagerFactoryThread(null,EntityName.MONITORCONSUMO, Operacao.LISTAR.ordinal(),0);
		new Thread(emf).start();
	}
	
	public void verificaSituacaoProduto(int produto, int id_cliente, int id_armazenamento){
		
	}
	private void geraAlertaProdutoPertoVencimento(int id_monitor_consumo, int id_usuario){
		
	}
	private void atualizaDiasRestantesMonitor(int id_monitorconsumo, int dias_restantes){
		
	}

}
