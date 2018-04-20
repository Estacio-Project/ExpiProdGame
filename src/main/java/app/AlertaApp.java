package app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.AlertaDAO;
import bean.Alerta;

public class AlertaApp {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AlertaDAO AlertaDAO = (AlertaDAO) context.getBean("alertaDao");
		
		Calendar data1 = Calendar.getInstance();
		data1.set(2018, 4, 30);
        
        System.out.println(" Inserir Alertas...");

        Alerta Alerta1 = new Alerta("alfa", "alerta1", new Date(data1.getTimeInMillis()));
        Alerta Alerta2 = new Alerta("beta", "alerta2", new Date(data1.getTimeInMillis()));
        Alerta Alerta3 = new Alerta("gama", "alerta3", new Date(data1.getTimeInMillis()));
        AlertaDAO.inserir(Alerta1);
        AlertaDAO.inserir(Alerta2);
        AlertaDAO.inserir(Alerta3);
        

        System.out.println("Pesquisano Login... : " );
        System.out.println(AlertaDAO.pesquisarNome("alfa").toString());
        System.out.println(AlertaDAO.pesquisarNome("beta").toString());
        System.out.println(AlertaDAO.pesquisarNome("gama").toString());
        
        System.out.println("Listar Todos Alertas... : " );
        List<Alerta> lista_Alerta = AlertaDAO.listarTodosAlertas();
        
        for (Alerta Alerta : lista_Alerta) {
			System.out.println(Alerta.toString());
		}
        System.out.println("Atualizando Login... : " );
        Alerta1.setNome("alfa-alterado");
        Alerta2.setNome("beta-alterado");
        Alerta3.setNome("gama-alterado");
        AlertaDAO.atualizar(Alerta1);
        AlertaDAO.atualizar(Alerta2);
        AlertaDAO.atualizar(Alerta3);
        
        lista_Alerta = AlertaDAO.listarTodosAlertas();
        
        for (Alerta Alerta : lista_Alerta) {
			System.out.println(Alerta.toString());
		}
        
        System.out.println("Deletando  Primeiro e  ultimo Login ... : " );
        AlertaDAO.excluir(Alerta1);
        AlertaDAO.excluir(Alerta2);
      
       
		context.close();
	}
}
