

import java.util.Scanner;

public class Iniciar {
    Scanner scanner = new Scanner(System.in);
    Poupanca poupanca = new Poupanca(2.0);
    Corrente corrente = new Corrente(0.0);
    Investimento investimento = new Investimento(0.0);

    public void inicio() {
        int opcao;
        do {
            exibeMenu();
            opcao = scanner.nextInt();
            escolheOpcao(opcao);

        } while (opcao != 4);
    }

    public void exibeMenu() {
        System.out.println("""
                escolha uma conta: \s
                1-Conta corrente
                2-Conta poupança
                3-Conta investimento
                4-Sair""");
        System.out.println();

    }

    public void escolheOpcao(int opcao) {

        switch (opcao) {
//            conta corrente
            case 1 -> {
                corrente.dadosConta();
                System.out.println("Escolha uma opção: \n1-depositar\n2-sacar \n3-ver saldo");
                int opcao1 = scanner.nextInt();
                switch (opcao1) {
//                    depositar
                    case 1 -> {
                        System.out.println("Escolha uma opção: \n1-cheque\n2-dinheiro:");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {
//                            cheque
                            case 1 -> {
                                System.out.println("Digite o valor a ser depositado?");
                                corrente.depositarCheque(scanner.nextDouble());
                            }
//                            dinheiro
                            case 2 -> {
                                System.out.println("Digite o valor a ser depositado?");
                                corrente.depositarDinheiro(scanner.nextInt());
                            }
                        }
                    }
//                    sacar
                    case 2 -> {
                        System.out.println("Digite o valor a ser sacado");
                        corrente.sacar(scanner.nextDouble());
                    }
//                    consultar saldo
                    case 3 ->
                        corrente.consultarSaldo();

                }
            }
//            Conta poupança
            case 2 -> {
                poupanca.dadosConta();
                System.out.println("Escolha uma opção: \n1-Depositar\n2-Sacar \n3-Ver saldo");
                int opcao4 = scanner.nextInt();
//                depositar
                switch (opcao4) {
                    case 1 -> {
                        System.out.println("Escolha uma opção: \n1-Cheque\n2-Dinheiro:");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {
//                            cheque
                            case 1 -> {
                                System.out.println("Digite o valor a ser depositado?");
                                poupanca.depositarCheque(scanner.nextDouble());
                            }
//                            dinheiro
                            case 2 -> {
                                System.out.println("Digite o valor a ser depositado?");
                                poupanca.depositarDinheiro(scanner.nextInt());
                            }
                        }
                    }
//                    sacar
                    case 2 -> {
                        System.out.println("Digite o valor a ser sacado");
                        poupanca.sacar(scanner.nextDouble());
                    }
//                    consultar saldo
                    case 3 ->
                        poupanca.consultarSaldo();

                }
            }
//           conta investimento
            case 3 -> {
                investimento.dadosConta();
                System.out.println("Escolha uma opção: \n1-Depositar\n2-Sacar \n 3-Ver saldo");
                int opcao5 = scanner.nextInt();
                switch (opcao5) {
//                    depositar
                    case 1 -> {
                        System.out.println("Escolha uma opção: \n1-Cheque\n2-Dinheiro:");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {
//                            cheque
                            case 1 -> {
                                System.out.println("Digite o valor a ser depositado?");
                                investimento.depositarCheque(scanner.nextDouble());
                            }
//                            dinheiro
                            case 2 -> {
                                System.out.println("Digite o valor a ser depositado?");
                                investimento.depositarDinheiro(scanner.nextInt());
                            }
                        }
                    }
//                    sacar
                    case 2 -> {
                        System.out.println("Digite o valor a ser sacado");
                        investimento.sacar(scanner.nextDouble());
                    }
//                    consultar saldo
                    case 3 ->
                        investimento.consultarSaldo();

                }
            }
            case 4 -> System.out.println("Saindo...");
        }


    }


}