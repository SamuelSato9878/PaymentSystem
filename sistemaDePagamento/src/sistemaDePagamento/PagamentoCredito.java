package sistemaDePagamento;

public class PagamentoCredito extends Pagamento{
	private double taxa = 105;
	private int parcelas;
	private double valorParcela;
	private double valorTotal;
	
	public PagamentoCredito(double valorProduto, int parcelas) {
		super(valorProduto);
		this.parcelas = parcelas;
	}
	
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public int getParcelas() {
		return parcelas;
	}

	
	void processarPagamento() {
		valorTotal = (getValorProduto() * taxa) / 100;
		valorParcela = (valorTotal /parcelas); 
		System.out.println("Valor total:" + valorTotal + " R$ Em parcelas de " + valorParcela + " R$");
		
	}
	void formaPagamento() {
		System.out.println("Pagamento em Credito");
	}
}
