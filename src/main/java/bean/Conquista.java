package bean;

import java.util.Date;

public class Conquista {

	
	private int id;
	private String nome;
	private String descricao;
	private Date data_conquista;
	private Usuario usuario;
	public Conquista(String nome, String descricao, Usuario usuario, Date data_conquista) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.usuario = usuario;
		this.data_conquista = data_conquista;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public Date getData_conquista() {
		return data_conquista;
	}
	public void setData_conquista(Date data_conquista) {
		this.data_conquista = data_conquista;
	}
	@Override
	public String toString() {
		return "Conquista [id=" + id + ", nome=" + nome + ", descricao="
				+ descricao + ", usuario=" + usuario.getLogin() + "]";
	}
	
	
	
	
}
