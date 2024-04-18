import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int valor = 0;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 9) {
            BuscaCotacao cotacao = new BuscaCotacao();
            System.out.println("""
                    Bem vindo! Para saber as cotações dos países, escolha uma opção: 
                    
                    1 - Converter de BRL (real) para USD (dólar americano);
                    2 - Converter de USD (dólar americano) para BRL (real);
                    3 - Converter de BRL (real) para EUR (euro);
                    4 - Converter de EUR (euro) para BRL (real brasileiro);
                    5 - Converter de BRL (real) para ARS (peso argentino);
                    6 - Converter de ARS (peso argentino) para BRL (real);
                    7 - Converter de BRL (real) para UYU (peso uruguaio);
                    8 - Converter de UYU (peso uruguaio) para BRL (real);
                    9 - Sair;
                    """);

            try {
                opcao = Integer.parseInt(leitura.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido!");
                break;
            }

            switch (opcao) {
                case 1:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("BRL", "USD");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em real " + "equivale a " + valor * novaCotacao.conversionRate() + " em dólar");
                    } catch (RuntimeException e ) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }

                    break;
                case 2:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("USD", "BRL");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em dólar " + "equivale a " + valor * novaCotacao.conversionRate() + " em real");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 3:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("BRL", "EUR");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em real " + "equivale a " + valor * novaCotacao.conversionRate() + " em euro");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 4:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("EUR", "BRL");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em euro " + "equivale a " + valor * novaCotacao.conversionRate() + " em real");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 5:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("BRL", "ARS");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em real " + "equivale a " + valor * novaCotacao.conversionRate() + " em peso argentino");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 6:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("ARS", "BRL");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em peso argentino " + "equivale a " + valor * novaCotacao.conversionRate() + " em real");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 7:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("BRL", "UYU");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em real " + "equivale a " + valor * novaCotacao.conversionRate() + " em peso uruguaio");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 8:
                    try {
                        Cotacao novaCotacao = cotacao.buscaCotacao("UYU", "BRL");
                        System.out.println("Digite o valor: ");
                        valor = Integer.parseInt(leitura.nextLine());
                        System.out.println(valor + " em peso uruguaio " + "equivale a " + valor * novaCotacao.conversionRate() + " em real");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                default:
                    System.out.println("Opção inválida ou de saída.");
                    break;
            }


        }


    }
}