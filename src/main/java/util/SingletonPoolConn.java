package util;

import java.util.Properties;

public class SingletonPoolConn{
	
	private static ConnectionPool pool;
	private static int contThreads =0;
	static{
		Properties props = new Properties();
		props.put ("charSet", "ISO-8859-1");
		props.put("user","jcg" );
		props.put("password", "root");
		
		try {
			pool = new ConnectionPool.Builder()
				.setInitialCapacity(3)
				.setMaxCapacity(3)
				.setStep(2)
				.setConnectionString("jdbc:mysql://localhost:3306/produexpiragame")
				.setDriver("com.mysql.jdbc.Driver")
				.setProperties(props)
				.setTimeOut(0)
				.build();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static ConnectionPool getInstance(){
		return pool;
	}

}
