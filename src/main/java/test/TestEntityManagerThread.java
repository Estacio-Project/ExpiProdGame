package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.Configuration;

import repository.EntityManagerFactoryThread;
import bean.Usuario;

public class TestEntityManagerThread {

	public static void main(String[] args) {
		
		
		//org.apache.log4j.Logger.getLogger("net.sf.hibernate").setLevel(org.apache.log4j.Level.WARN);
		// Inserindo
		/*
		 * Usuario usuario1 = new Usuario("mateus", "12345"); new Thread(new
		 * EntityManagerFactoryThread(usuario1, "usuario", 1)).start(); Usuario
		 * usuario2 = new Usuario("lucas", "12345"); new Thread(new
		 * EntityManagerFactoryThread(usuario2, "usuario", 1)).start(); Usuario
		 * usuario3 = new Usuario("gabriel", "12345"); new Thread(new
		 * EntityManagerFactoryThread(usuario3, "usuario", 1)).start();
		 */
		// Listando
		EntityManagerFactoryThread emf = new EntityManagerFactoryThread(null,"usuario", 0,0);
		new Thread(emf).start();
		
	
				
	}
}
