package bean;

import java.util.Date;

public class Badge {

	private int id;
	private String nome;
	private String descricao;
	private Date data_badge;
	private Usuario usuario;
	public Badge(String nome, String descricao, Usuario usuario, Date data_badge) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.usuario = usuario;
		this.data_badge = data_badge;
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
	
	
	@Override
	public String toString() {
		return "Badge [id=" + id + ", nome=" + nome + ", descricao="
				+ descricao + ", usuario=" + usuario.getLogin() + "]";
	}
	
	
}
