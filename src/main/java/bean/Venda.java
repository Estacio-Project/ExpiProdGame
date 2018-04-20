package bean;

import java.util.Date;

public class Venda {
	private int id;
	private String nome;
	
	private String desconto;
	
	private Float pontuacao;
	private boolean promocao;
	private Date date_inicio_promocao;
	private Date date_final_promocao;
	private Fornecedor fornecedor;
	private Produto produto;
	private Cliente cliente;
	
	
	
	
	public Venda(int id, String nome, String desconto, Float pontuacao,
			boolean promocao, Date date_inicio_promocao,
			Date date_final_promocao) {
		super();
		this.id = id;
		this.nome = nome;
		this.desconto = desconto;
		this.pontuacao = pontuacao;
		this.promocao = promocao;
		this.date_inicio_promocao = date_inicio_promocao;
		this.date_final_promocao = date_final_promocao;
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




	public String getDesconto() {
		return desconto;
	}




	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}




	public Float getPontuacao() {
		return pontuacao;
	}




	public void setPontuacao(Float pontuacao) {
		this.pontuacao = pontuacao;
	}




	public boolean isPromocao() {
		return promocao;
	}




	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}




	public Date getDate_inicio_promocao() {
		return date_inicio_promocao;
	}




	public void setDate_inicio_promocao(Date date_inicio_promocao) {
		this.date_inicio_promocao = date_inicio_promocao;
	}




	public Date getDate_final_promocao() {
		return date_final_promocao;
	}




	public void setDate_final_promocao(Date date_final_promocao) {
		this.date_final_promocao = date_final_promocao;
	}




	public Fornecedor getFornecedor() {
		return fornecedor;
	}




	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}




	public Produto getProduto() {
		return produto;
	}




	public void setProduto(Produto produto) {
		this.produto = produto;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	@Override
	public String toString() {
		return "Venda [id=" + id 
				+ ", promocao=" + promocao
				+ ", date_promocao=" + date_inicio_promocao
				+ ", data final promocao=" + date_final_promocao
				+ ", desconto=" + desconto + ", nome=" + nome + ", pontuacao="
				+ pontuacao + ", fornecedor=" + fornecedor.getNome() + ", produto="
				+ produto.getNome() + "]";
	}
	
	
}
