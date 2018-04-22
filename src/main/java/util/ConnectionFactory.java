package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class ConnectionFactory {
	private static EntityManagerFactory sessionFactory = buildSessionFactory();

    private static EntityManagerFactory buildSessionFactory() {
        try {
            if (sessionFactory == null) {
                sessionFactory = Persistence.createEntityManagerFactory("ExpProdGame");
            }
            return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
	
	public static void main(String[] args) {
		ConnectionFactory.sessionFactory.getPersistenceUnitUtil();
	}
}