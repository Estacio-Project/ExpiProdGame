package jdbc.repository.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import jdbc.repository.AlertaDAO;
import bean.Alerta;
import bean.MonitorConsumo;
import bean.Usuario;

public class AlertaDAOImpl implements AlertaDAO{

	public boolean inserir(Alerta alerta) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO alerta " +
				"(nome, descricao, data_expiracao) "
				+ "VALUES (?,?, ? )";
		Connection conn = null;
		Calendar data = Calendar.getInstance();
		data.setTime(alerta.getData_expiracao());
		 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, alerta.getNome());
			ps.setString(2, alerta.getDescricao());
			ps.setDate(3, new Date(data.getTimeInMillis()) );

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

	public boolean atualizar(Alerta alerta) {
		// TODO Auto-generated method stub
		
		 String sql = "update alerta set nome=?, descricao=?, data_expiracao=?," +
	             "where id=?";
		 
		 Connection conn = null;
		 Calendar data = Calendar.getInstance();
			data.setTime(alerta.getData_expiracao());
			 
	     try {
	    	 conn = dataSource.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(sql);
	         stmt.setString(1, alerta.getNome());
	         stmt.setString(2, alerta.getDescricao());
	         stmt.setDate(3, new Date(data.getTimeInMillis()) );
	         stmt.setInt(4, alerta.getId());
	         stmt.execute();
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
		
		
		return false;
	}

	public boolean excluir(Alerta alerta) {
		// TODO Auto-generated method stub
		Connection conn = null;
		boolean bool =false;
		  try {
			  conn = dataSource.getConnection();
	             PreparedStatement stmt = conn.prepareStatement("delete " +
	                     "from alerta where id=?");
	             stmt.setInt(1, alerta.getId());
	             stmt.execute();
	             stmt.close();
	             
	             bool =true;
	         } catch (SQLException e) {
	             throw new RuntimeException(e);
	         }
		  
		  return bool;
	}

	public List<Alerta> listarTodosAlertas() {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Alerta> alertas = new ArrayList<Alerta>();
		try{
		conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement("select * from alerta");
        ResultSet rs = stmt.executeQuery();
        Calendar data = Calendar.getInstance();
        while (rs.next()) {
            // criando o objeto alerta
        	
        	data.setTime(rs.getDate("data_expiracao"));
        	Alerta alerta = new Alerta(
					rs.getInt("id"),
					rs.getString("nome"),
					rs.getString("descricao"), 
					new java.util.Date(data.getTimeInMillis())
					);
            alertas.add(alerta);
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

		return alertas;
	}

	public List<Alerta> pesquisarNome(String nome) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM alerta WHERE nome = ?";
		 
		Connection conn = null;
		List<Alerta> alertas = new ArrayList<Alerta>();
		try{
		conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        Calendar data = Calendar.getInstance();
        while (rs.next()) {
            // criando o objeto alerta
        	
        	data.setTime(rs.getDate("data_expiracao"));
        	Alerta alerta = new Alerta(
					rs.getInt("id"),
					rs.getString("nome"),
					rs.getString("descricao"), 
					new java.util.Date(data.getTimeInMillis())
					);
            alertas.add(alerta);
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

		return alertas;
	}

	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
}
