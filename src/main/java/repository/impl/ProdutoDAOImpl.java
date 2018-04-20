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

import repository.ProdutoDAO;
import util.SingletonPoolConn;
import bean.Produto;

public class ProdutoDAOImpl implements ProdutoDAO{

	public boolean inserir(Produto Produto) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO produto " +
				"(nome,descricao, valor, data_fabricacao, data_vencimento) "
				+ "VALUES (?,?, ?, ?,?)";
		Connection conn = null;
		Calendar data = Calendar.getInstance();
		
		
		 
		try {
			conn = SingletonPoolConn.getInstance().checkOut();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Produto.getNome());
			ps.setString(2, Produto.getDescricao());
			ps.setFloat(3, Produto.getValor());
			data.setTime(Produto.getData_fabricacao());
			ps.setDate(4, new Date(data.getTimeInMillis()) );
			data.setTime(Produto.getData_vencimento());
			ps.setDate(5, new Date(data.getTimeInMillis()) );
			
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

	public boolean atualizar(Produto Produto) {
		// TODO Auto-generated method stub
		
		 String sql = "update produto set nome=?, descricao=?, valor=?," +
	             "data_fabricacao=?, data_vencimento=? where id=?";
		 
		 Connection conn = null;
		 Calendar data = Calendar.getInstance();
			
			 
	     try {
	    	 conn = SingletonPoolConn.getInstance().checkOut();
	         PreparedStatement stmt = conn.prepareStatement(sql);
	         stmt.setString(1, Produto.getNome());
	         stmt.setString(2, Produto.getDescricao());
	         data.setTime(Produto.getData_fabricacao());
	         stmt.setFloat(3, Produto.getValor());
	         stmt.setDate(4, new Date(data.getTimeInMillis()) );
	         data.setTime(Produto.getData_vencimento());
	         stmt.setDate(5, new Date(data.getTimeInMillis()) );
	         stmt.setInt(6, Produto.getId());
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

	public boolean excluir(Produto Produto) {
		// TODO Auto-generated method stub
		Connection conn = null;
		boolean bool =false;
		  try {
			  conn = SingletonPoolConn.getInstance().checkOut();
	             PreparedStatement stmt = conn.prepareStatement("delete " +
	                     "from produto where id=?");
	             stmt.setInt(1, Produto.getId());
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

	public List<Produto> listar() {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Produto> Produtos = new ArrayList<Produto>();
		try{
		conn = SingletonPoolConn.getInstance().checkOut();
        PreparedStatement stmt = conn.prepareStatement("select * from produto");
        ResultSet rs = stmt.executeQuery();
        Calendar data = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        while (rs.next()) {
            // criando o objeto Produto
        	
        	data.setTime(rs.getDate("data_fabricacao"));
        	data2.setTime(rs.getDate("data_vencimento"));
        	
        	Produto Produto = new Produto(rs.getInt("id"),
					rs.getString("nome"),
					rs.getString("descricao"), 
					rs.getFloat("valor"),
					new java.util.Date(data.getTimeInMillis()),
					new java.util.Date(data2.getTimeInMillis()),
							rs.getInt("quantidade"))		;
            Produtos.add(Produto);
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

		return Produtos;
	}

	public List<Produto> pesquisarNome(String nome) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM produto WHERE nome = ?";
		 
		Connection conn = null;
		List<Produto> Produtos = new ArrayList<Produto>();
		try{
		conn = SingletonPoolConn.getInstance().checkOut();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        Calendar data = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        while (rs.next()) {
            // criando o objeto Produto
        	
        	data.setTime(rs.getDate("data_fabricacao"));
        	data2.setTime(rs.getDate("data_vencimento"));
        	
        	Produto Produto = new Produto(
					rs.getInt("id"),
					rs.getString("nome"),
					rs.getString("descricao"), 
					rs.getFloat("valor"),
					new java.util.Date(data.getTimeInMillis()),
					new java.util.Date(data2.getTimeInMillis()),
							rs.getInt("quantidade")				
					);
            Produtos.add(Produto);
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

		return Produtos;
	}

	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
}
