import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Selecione o tipo de conta:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");

        int opcaoConta = sc.nextInt();
        sc.nextLine();


        switch (opcaoConta) {
            case 1:
                ContaCorrente contaCorrente = new ContaCorrente();
                menuContaCorrente(contaCorrente, sc);
                break;
            case 2:
                ContaPoupanca contaPoupanca = new ContaPoupanca();
                menuContaPoupanca(contaPoupanca, sc);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }


    public static void menuContaCorrente(ContaCorrente conta, Scanner sc) {
        int opcao;
        do {
            System.out.println("\nMenu Conta Corrente:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Usar Cheque Especial");
            System.out.println("4 - Exibir dados da conta");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.usarChequeEspecial();
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }


    public static void menuContaPoupanca(ContaPoupanca conta, Scanner sc) {
        int opcao;
        do {
            System.out.println("\nMenu Conta Poupança:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Calcular rendimento");
            System.out.println("4 - Exibir dados da conta");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.print("Informe a taxa Selic (em %): ");
                    double selic = sc.nextDouble();
                    conta.calcularRendimento(selic);
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}

