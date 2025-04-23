package sistemaDePagamento;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem-vindo!");
        System.out.println("Qual é a sua forma de pagamento?");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Crédito (taxa de 5%)");
        System.out.print("Escolha: ");
        int opcao = scanner.nextInt();
        
        System.out.println("hello");

        switch (opcao) {
            case 1:
                System.out.println("\n--- Pagamento em Dinheiro ---");
                PagamentoDinheiro compraDinheiro = new PagamentoDinheiro(0, 0);

                System.out.print("Informe o valor do produto: ");
                double valorProdutoDinheiro = scanner.nextDouble();
                compraDinheiro.setValorProduto(valorProdutoDinheiro);

                System.out.print("Informe o valor fornecido pelo cliente: ");
                double valorPagamento = scanner.nextDouble();
                compraDinheiro.setValorPagamento(valorPagamento);

                System.out.println("Valor do Produto: R$" + compraDinheiro.getValorProduto());
                System.out.println("Valor Pago: R$" + compraDinheiro.getValorPagamento());

                compraDinheiro.processarPagamento();
                compraDinheiro.formaPagamento();
                break;

            case 2:
                System.out.println("\n--- Pagamento em Crédito ---");
                PagamentoCredito compraCredito = new PagamentoCredito(0, 0);

                System.out.print("Informe o valor do produto: ");
                double valorProdutoCredito = scanner.nextDouble();
                compraCredito.setValorProduto(valorProdutoCredito);

                System.out.print("Informe a quantidade de parcelas: ");
                int parcelas = scanner.nextInt();
                compraCredito.setParcelas(parcelas);

                System.out.println("\nValor do Produto: R$" + compraCredito.getValorProduto());
                System.out.println("Parcelas: " + compraCredito.getParcelas());

                compraCredito.processarPagamento();
                compraCredito.formaPagamento();
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }

        scanner.close();
    }
}
