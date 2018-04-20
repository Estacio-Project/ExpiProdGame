package bean;

import java.util.Date;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private Float valor;
	private Date data_fabricacao;
	private Date data_vencimento;
	private int quantidade;
	
	public Produto(String nome, String descricao, Float valor,
			Date data_fabricacao, Date data_vencimento, int quantidade) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.data_fabricacao = data_fabricacao;
		this.data_vencimento = data_vencimento;
		this.quantidade = quantidade;
	}
	public Produto(int id,String nome, String descricao, Float valor,
			Date data_fabricacao, Date data_vencimento, int quantidade) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.data_fabricacao = data_fabricacao;
		this.data_vencimento = data_vencimento;
		this.quantidade = quantidade;
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
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Date getData_fabricacao() {
		return data_fabricacao;
	}
	public void setData_fabricacao(Date data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}
	public Date getData_vencimento() {
		return data_vencimento;
	}
	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao="
				+ descricao + ", valor=" + valor + ", data_fabricacao="
				+ data_fabricacao + ", data_vencimento=" + data_vencimento
				+", quantidade"
				+ quantidade + "]";
	}
	
	
}
