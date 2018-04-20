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

import repository.ClienteDAO;
import util.SingletonPoolConn;
import bean.Armazenamento;
import bean.Cliente;
import bean.MonitorConsumo;
import bean.Produto;
import bean.Usuario;

public class ClienteDAOImpl implements ClienteDAO{

	public boolean inserir(Cliente Cliente) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO cliente " +
				"(nome, cpf) "
				+ "VALUES (?,?)";
		Connection conn = null;
		Calendar data = Calendar.getInstance();
		 
		try {
			conn = SingletonPoolConn.getInstance().checkOut();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Cliente.getNome());
			ps.setInt(2, Cliente.getCpf());
			
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

	public boolean atualizar(Cliente Cliente) {
		// TODO Auto-generated method stub
		
		 String sql = "update cliente set nome=?, cpf=? where id=?";
		 
		 Connection conn = null;

			 
	     try {
	    	 conn = SingletonPoolConn.getInstance().checkOut();
	         PreparedStatement stmt = conn.prepareStatement(sql);
	         stmt.setString(1, Cliente.getNome());
	         stmt.setInt(2, Cliente.getCpf());
	         stmt.setInt(3, Cliente.getId());
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

	public boolean excluir(Cliente Cliente) {
		// TODO Auto-generated method stub
		Connection conn = null;
		boolean bool =false;
		  try {
			  conn = SingletonPoolConn.getInstance().checkOut();
	             PreparedStatement stmt = conn.prepareStatement("delete " +
	                     "from cliente where id=?");
	             stmt.setInt(1, Cliente.getId());
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

	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Cliente> Clientes = new ArrayList<Cliente>();
		try{
		conn = SingletonPoolConn.getInstance().checkOut();
        PreparedStatement stmt = conn.prepareStatement("select * from cliente");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            // criando o objeto Cliente
        	
        	Cliente Cliente = new Cliente(
					rs.getInt("id"),
					rs.getString("nome"),
					rs.getInt("cpf")
					);
            Clientes.add(Cliente);
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

		return Clientes;
	}

	public List<Cliente> pesquisarNome(String nome) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM cliente WHERE nome = ?";
		 
		Connection conn = null;
		List<Cliente> Clientes = new ArrayList<Cliente>();
		try {
			conn = SingletonPoolConn.getInstance().checkOut();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, nome);
			 
			ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	            // criando o objeto Cliente
	        	
	        	Cliente Cliente = new Cliente(
						rs.getInt("id"),
						rs.getString("nome"),
						rs.getInt("cpf")
						);
	            Clientes.add(Cliente);
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

			return Clientes;
	}
	

	public List<Cliente> pesquisarCpf(int cpf) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM cliente WHERE cpf = ?";
		 
		Connection conn = null;
		List<Cliente> Clientes = new ArrayList<Cliente>();
		try {
			conn = SingletonPoolConn.getInstance().checkOut();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, cpf);
			 
			ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	            // criando o objeto Cliente
	        	
	        	Cliente Cliente = new Cliente(
						rs.getInt("id"),
						rs.getString("nome"),
						rs.getInt("cpf") 
						);
	            Clientes.add(Cliente);
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

			return Clientes;
		
	}

	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	
}
