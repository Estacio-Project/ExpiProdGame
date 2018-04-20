package bean;

import java.util.Date;

public class Alerta {

	private int id;
	private String nome;
	private String descricao;
	private Date data_expiracao;

	
	
	

	public Alerta(String nome, String descricao, Date data_expiracao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.data_expiracao = data_expiracao;
	}

	public Alerta(int id, String nome, String descricao, Date data_expiracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data_expiracao = data_expiracao;
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
	public Date getData_expiracao() {
		return data_expiracao;
	}
	public void setData_expiracao(Date data_expiracao) {
		this.data_expiracao = data_expiracao;
	}
	

	@Override
	public String toString() {
		return "Alerta [id=" + id + ", descricao=" + descricao
				+ ", data_expiracao=" + data_expiracao + ", monitor_consumo="
				;
	}
	
	
}
