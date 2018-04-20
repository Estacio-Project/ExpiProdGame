package bean;

public class MonitorConsumo {
	private int id;
	private String situacao;
	private int dias_restante;
	private Produto produto;

	
	
	public MonitorConsumo(int id, String situacao, int dias_restante,
			Produto produto) {
		super();
		this.id = id;
		this.situacao = situacao;
		this.dias_restante = dias_restante;
		this.produto = produto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public int getDias_restante() {
		return dias_restante;
	}
	public void setDias_restante(int dias_restante) {
		this.dias_restante = dias_restante;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "MonitorConsumo [id=" + id + ", status_produto="
				+ situacao + "dias=" + this.dias_restante
				+ ", produto=" + produto + "]";
	}
	
	
	
	
}
