package sistemaDePagamento;

public class PagamentoDinheiro extends Pagamento {
	
	private double troco = 0;
	private double valorPagamento;
	
	public PagamentoDinheiro(double valorProduto, double valorPagamento) {
		super(valorProduto);
		this.valorPagamento = valorPagamento;
		// TODO Auto-generated constructor stub
	}
	
	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	public double getValorPagamento() {
		return valorPagamento;
	}
	
	public double getTroco() {
		return troco;
	}

	@Override
	public void processarPagamento() {
		// TODO Auto-generated method stub
		if (getValorPagamento() >= getValorProduto()){
			troco = getValorPagamento() - getValorProduto();
			System.out.println("Troco: " + troco);
		}else {
			System.out.println("Não dá para comprar");
		}
	}

	@Override
	public void formaPagamento() {
		System.out.println("Pagamento em Dinheiro");
	}
	
	
}
