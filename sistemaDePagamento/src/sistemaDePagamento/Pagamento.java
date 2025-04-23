package sistemaDePagamento;

public abstract class Pagamento {

	private double valorProduto;
	
	
	public Pagamento(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	
	abstract void processarPagamento();
	
	abstract void formaPagamento();

}
