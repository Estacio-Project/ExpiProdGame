package bean;

import java.util.List;

public class Fornecedor {
	
	private int id;
	private String nome;
	private int cnpj;
	private Usuario usuario;
	private List<Armazenamento> armazenamento;
	
	

	public Fornecedor(String nome, int cnpj, Usuario usuario,
			List<Armazenamento> armazenamento) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.usuario = usuario;
		this.armazenamento = armazenamento;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getCnpj() {
		return cnpj;
	}



	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public List<Armazenamento> getArmazenamento() {
		return armazenamento;
	}



	public void setArmazenamento(List<Armazenamento> armazenamento) {
		this.armazenamento = armazenamento;
	}




	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj
				+ ", usuario=" + usuario.getLogin() + "]";
	}

	
	

}
