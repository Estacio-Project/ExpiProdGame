package jdbc;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import jdbc.repository.ProdutoDAO;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Produto;

public class ProdutoApp {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ProdutoDAO ProdutoDAO = (ProdutoDAO) context.getBean("produtoDAO");
        System.out.println(" Inserir Produtos...");
        
        Calendar data1 = Calendar.getInstance();
        data1.set(2018, 1, 1);
        Calendar data2 = Calendar.getInstance();
        data2.set(2018, 4, 30);
        Produto Produto1 = new Produto("arroz", "alimenticio",6.1f, new Date(data1.getTimeInMillis()), new Date(data2.getTimeInMillis()), 1 );
        Produto Produto2 = new Produto("queijo", "congelado",5.1f, new Date(data1.getTimeInMillis()), new Date(data2.getTimeInMillis()), 1 );
        Produto Produto3 = new Produto("detergente", "limpeza",2.9f, new Date(data1.getTimeInMillis()), new Date(data2.getTimeInMillis()),1  );
        ProdutoDAO.inserir(Produto1);
        ProdutoDAO.inserir(Produto2);
        ProdutoDAO.inserir(Produto3);
        

        System.out.println("Pesquisano Login... : " );
        System.out.println(ProdutoDAO.pesquisarNome("arroz").toString());
        System.out.println(ProdutoDAO.pesquisarNome("detergente").toString());
        System.out.println(ProdutoDAO.pesquisarNome("queijo").toString());
        
        System.out.println("Listar Todos Produtos... : " );
        List<Produto> lista_Produto = ProdutoDAO.listar();
        Produto1= lista_Produto.get(0);
        Produto2= lista_Produto.get(1);
        Produto3= lista_Produto.get(2);
        for (Produto Produto : lista_Produto) {
			System.out.println(Produto.toString());
		}
        System.out.println("Atualizando Login... : " );
        Produto1.setNome("feijao");
        Produto2.setNome("mortadela");
        Produto3.setNome("sabao");
        ProdutoDAO.atualizar(Produto1);
        ProdutoDAO.atualizar(Produto2);
        ProdutoDAO.atualizar(Produto3);
        System.out.println("Listar Todos Produtos... : " );
        lista_Produto = ProdutoDAO.listar();
        
        for (Produto Produto : lista_Produto) {
			System.out.println(Produto.toString());
		}
        
        System.out.println("Deletando  Primeiro e  ultimo Login ... : " );
        ProdutoDAO.excluir(Produto1);
        ProdutoDAO.excluir(Produto2);
      
        System.out.println("Listar Todos Produtos... : " );
        lista_Produto = ProdutoDAO.listar();
        
        for (Produto Produto : lista_Produto) {
			System.out.println(Produto.toString());
		}
        
		context.close();
	}
}
