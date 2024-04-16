import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limiteCartao = scanner.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limiteCartao);

        System.out.println("********************");

        boolean i = true;

        while (i) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double valorCompra = scanner.nextDouble();

            Compras novaCompra = new Compras(descricao, valorCompra);

            cartao.compraRealizada(novaCompra);

            System.out.println("Digite 0 para encerrar ou 1 para continuar: ");
             int menu = scanner.nextInt();
             if (menu == 0) {
                 i = false;
             } else {
                 while (menu != 1) {
                     System.out.println("Opção inválida.");
                     System.out.println("********************");
                     System.out.println("Digite 0 para encerrar ou 1 para continuar: ");
                     menu = scanner.nextInt();
                 }
             }
        }

        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS");

// ordena conforme definido em Compras compareTo
        Collections.sort(cartao.getListaCompra());

//devolve cada item da lista
        for (Compras item : cartao.getListaCompra()) {
            System.out.println(item);
        }

        System.out.println("********************");
        System.out.println("Saldo disponível: " + cartao.getSaldo());


    }
}