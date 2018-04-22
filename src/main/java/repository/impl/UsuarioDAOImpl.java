package repository.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import repository.UsuarioDAO;
import util.SingletonPoolConn;
import bean.Usuario;
import bean.MonitorConsumo;
import bean.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{

	public boolean inserir(Usuario Usuario) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO usuario " +
				"(login, senha) "
				+ "VALUES (?,?)";
		Connection conn = null;

		 
		try {
			conn = instanceConnPool;
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Usuario.getLogin());
			ps.setString(2, Usuario.getSenha());

			ps.executeUpdate();
			ps.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
		return false;
	}

	public boolean atualizar(Usuario Usuario) {
		// TODO Auto-generated method stub
		
		 String sql = "update usuario set login=?, senha=?" +
	             "where id=?";
		 
		 Connection conn = null;
		 	 
	     try {
	    	 conn = instanceConnPool;
	         PreparedStatement stmt = conn.prepareStatement(sql);
	         stmt.setString(1, Usuario.getLogin());
	         stmt.setString(2, Usuario.getSenha());
	         stmt.setInt(3, Usuario.getId());
	         stmt.execute();
	         stmt.close();
	         
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {}
				}
			}
		
		
		return false;
	}

	public boolean excluir(Usuario Usuario) {
		// TODO Auto-generated method stub
		Connection conn = null;
		boolean bool =false;
		  try {
			  conn = instanceConnPool;
	             PreparedStatement stmt = conn.prepareStatement("delete " +
	                     "from usuario where id=?");
	             stmt.setInt(1, Usuario.getId());
	             stmt.execute();
	             stmt.close();
	             
	             bool =true;
	         } catch (SQLException e) {
	             throw new RuntimeException(e);
	         }finally {
	 			if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {}
				}
			}
		  
		  return bool;
	}

	public List<Usuario> listarTodosUsuarios() {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Usuario> Usuarios = new ArrayList<Usuario>();
		try{
		conn = instanceConnPool;
        PreparedStatement stmt = conn.prepareStatement("select * from usuario");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            // criando o objeto Usuario
    
        	Usuario Usuario = new Usuario(
        			rs.getInt("id"),
					rs.getString("login"),
					rs.getString("senha")
					
					);
            Usuarios.add(Usuario);
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}

		return Usuarios;
	}

	public List<Usuario> pesquisarLogin(String nome) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM usuario WHERE login = ?";
		Connection conn = null;
		List<Usuario> Usuarios = new ArrayList<Usuario>();
		try{
		conn = instanceConnPool;
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome );
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            // criando o objeto Usuario
    
        	Usuario Usuario = new Usuario(
					rs.getString("login"),
					rs.getString("senha")
					);
            Usuarios.add(Usuario);
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}

		return Usuarios;
	}

	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
	}

	private static Connection instanceConnPool = SingletonPoolConn.getInstance().checkOut();
	
}
