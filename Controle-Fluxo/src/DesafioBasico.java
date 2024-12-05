import java.util.Scanner;

public class DesafioBasico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double valorScanner = 0;

        while (continuar) {
            
            System.out.println("MENU PRINCIPAL:");
            System.out.println("Por favor digite uma das opções validas abaixo:");
            System.out.println("1 - DEPOSITAR");
            System.out.println("2 - SACAR");
            System.out.println("3 - CONSULTAR SALDO");
            System.out.println("0 - ENCERRAR PROGRAMA");
            int opcao = scanner.nextInt();
            
            switch (opcao) {

                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Por favor informe o valor a ser depositado:");
                    do {
                        valorScanner = scanner.nextDouble();
                        if (valorScanner >= 0) {
                            saldo += valorScanner;
                            System.out.printf("saldo atual: %.1f %n%n" , saldo);
                        }
                        else {
                            System.out.println("Valor incorreto ou negativo, por favor digite novamente um valor positivo valido!");
                        }       
                    } while (valorScanner < 0);
                    valorScanner = 0;
                    break;

                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Por favor informe o valor a ser sacado:");
                    do {
                        valorScanner = scanner.nextDouble();
                        if (valorScanner >= 0 && saldo >= valorScanner ) {
                            saldo -= valorScanner;
                            System.out.printf("saldo atual: %.1f %n%n" , saldo);
                        }
                        else {
                            System.out.println("Saldo insuficiente ou valor incorreto, por favor tente novamente.");
                        }       
                    } while (valorScanner < 0 || saldo < valorScanner);
                    valorScanner = 0;
                    break;

                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("saldo atual: %.1f %n%n" , saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}