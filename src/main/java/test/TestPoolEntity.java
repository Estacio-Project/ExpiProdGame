package test;

import java.util.List;

import jdbc.repository.UsuarioDAO;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.SingletonPoolConn;
import bean.Usuario;

public class TestPoolEntity {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-----------------------CONNECTION------------------");
		UsuarioDAO usuarioDAO = (UsuarioDAO) context.getBean("usuarioDAO");
        System.out.println(" Inserir Usuarios...");

        Usuario usuario1 = new Usuario("joao", "12345");
        Usuario usuario2 = new Usuario("maria", "123456");
        Usuario usuario3 = new Usuario("pedro", "123456");
        usuarioDAO.inserir(usuario1);
        usuarioDAO.inserir(usuario2);
        usuarioDAO.inserir(usuario3);
    
        

        System.out.println("Pesquisano Login... : " );
        System.out.println(usuarioDAO.pesquisarLogin("pedro").toString());
        System.out.println(usuarioDAO.pesquisarLogin("maria").toString());
        System.out.println(usuarioDAO.pesquisarLogin("joao").toString());
        
        System.out.println("Listar Todos Usuarios... : " );
        List<Usuario> lista_usuario = usuarioDAO.listarTodosUsuarios();
        
        for (Usuario usuario : lista_usuario) {
			System.out.println(usuario.toString());
		}
        usuario1 = lista_usuario.get(0);
        usuario2 = lista_usuario.get(1);
        usuario3 = lista_usuario.get(2);
        
        System.out.println("Atualizando Login... : " );
        usuario1.setLogin("pedro-alterado");
        usuario2.setLogin("maria-alterado");
        usuario3.setLogin("joao-alterado");
        usuarioDAO.atualizar(usuario1);
        usuarioDAO.atualizar(usuario2);
        usuarioDAO.atualizar(usuario3);
               
        lista_usuario = usuarioDAO.listarTodosUsuarios();
        
        usuario1 = lista_usuario.get(0);
        usuario2 = lista_usuario.get(1);
        usuario3 = lista_usuario.get(2);
        
        
        for (Usuario usuario : lista_usuario) {
			System.out.println(usuario.toString());
		}
        
        System.out.println("Deletando  Primeiro e  ultimo Login ... : " );
        usuarioDAO.excluir(usuario1);
        usuarioDAO.excluir(usuario2);
       
        for (Usuario usuario : lista_usuario) {
     			System.out.println(usuario.toString());
     		}
		
        context.close();
	}
}
