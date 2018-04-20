package bean;

import java.util.List;

public class Cliente {


	private int id;
	private String nome;
	private int cpf;
	private Usuario usuario;


	public Cliente(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	


	public Cliente(int id, String nome, int cpf, Usuario usuario) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
	}


	public Cliente(int id, String nome, int cpf) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf
				+  "]";
	}
	
	
	
	

	
	
}
