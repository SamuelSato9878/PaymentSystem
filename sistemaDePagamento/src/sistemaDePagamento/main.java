package sistemaDePagamento;

public class main {

	public static void main(String[] args) {
		PagamentoDinheiro compra01 = new PagamentoDinheiro(0, 0);
		PagamentoCredito compra02 = new PagamentoCredito(0, 0);
	
	
		//Pagamento em dinheiro
		compra01.setValorPagamento(120);
		System.out.println("Valor do Pagamento: " + compra01.getValorPagamento());
		compra01.setValorProduto(100);
		System.out.println("Valor do Produto: " + compra01.getValorProduto());
		compra01.processarPagamento();
		compra01.formaPagamento();
		System.out.println("\n");
		
		
		//Pagamento em crédito
		compra02.setValorProduto(1000);
		compra02.setParcelas(5);
		compra02.processarPagamento();
		compra02.formaPagamento();
		
		
	}

}
