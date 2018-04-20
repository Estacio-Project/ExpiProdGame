package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TestMyConnection {
	
	private static ConnectionPool pool;
	private static List<Connection> usedConnections = new ArrayList<Connection>();
	
 public static void main(String[] args) {
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
		
		for (int i = 0; i < 3; i++) {
			
			Connection conn = pool.checkOut();
		}
		System.out.println(pool.getMaxCapacity());
		for (int i = 0; i < 3; i++) {
			System.out.println(pool.getMaxCapacity());
			Connection conn = pool.checkOut();
			usedConnections.add(conn);
		}
		for (int i = 0; i < 3; i++) {
			try {
				usedConnections.get(i).close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(pool.getMaxCapacity());
	}
}

