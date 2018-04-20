package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.ClienteDAO;
import bean.Cliente;

public class ClienteApp {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ClienteDAO ClienteDAO = (ClienteDAO) context.getBean("clienteDAO");
        System.out.println(" Inserir Clientes...");

        
        Cliente Cliente1 = new Cliente("joao", 999999999);
        Cliente Cliente2 = new Cliente("maria", 999999998);
        Cliente Cliente3 = new Cliente("pedro", 999999997);
        
        ClienteDAO.inserir(Cliente1);
        ClienteDAO.inserir(Cliente2);
        ClienteDAO.inserir(Cliente3);
        

        System.out.println("Pesquisando Cliente por Nome ... : " );
        System.out.println(ClienteDAO.pesquisarNome("pedro").toString());
        System.out.println(ClienteDAO.pesquisarNome("maria").toString());
        System.out.println(ClienteDAO.pesquisarNome("joao").toString());
        
        System.out.println("Pesquisando Cliente por CPF ... : " );
        System.out.println(ClienteDAO.pesquisarCpf(999999999).toString());
        System.out.println(ClienteDAO.pesquisarCpf(999999998).toString());
        System.out.println(ClienteDAO.pesquisarCpf(999999997).toString());
        
        System.out.println("Listar Todos Clientes... : " );
        List<Cliente> lista_Cliente = ClienteDAO.listar();
        
        
        for (Cliente Cliente : lista_Cliente) {
			
        	System.out.println(Cliente.toString());
			
		}
        System.out.println("Atualizando Registro Clientes..." );
          for (Cliente Cliente : lista_Cliente) {
			
        	System.out.println(Cliente.toString());
        	Cliente.setNome(Cliente.getNome()+"alterado");
        	ClienteDAO.atualizar(Cliente);
			
		}
        
 /*       Cliente1.setNome("pedro-alterado");
        Cliente2.setNome("maria-alterado");
        Cliente3.setNome("joao-alterado");
        
        ClienteDAO.atualizar(Cliente1);
        ClienteDAO.atualizar(Cliente2);
        ClienteDAO.atualizar(Cliente3);*/
        
        lista_Cliente = ClienteDAO.listar();
        System.out.println("Listar Todos Clientes... : " );
        for (Cliente Cliente : lista_Cliente) {
			System.out.println(Cliente.toString());
		}
        
        System.out.println("Excluindo todos os registros de cliente... : " );
        
     /*  for (Cliente Cliente : lista_Cliente) {        	
        	ClienteDAO.excluir(Cliente);
			
		}*/
        /*ClienteDAO.excluir(Cliente1);
        ClienteDAO.excluir(Cliente2);
      */
        
        
        lista_Cliente = ClienteDAO.listar();
        System.out.println("Listar Todos Clientes... : " );
        for (Cliente Cliente : lista_Cliente) {
			System.out.println(Cliente.toString());
		}
        
		context.close();
	}
}
