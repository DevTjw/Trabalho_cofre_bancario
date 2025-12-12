package cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        // Cria um Scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Cria o cofrinho (objeto que armazenará as moedas)
        Cofrinho cofrinho = new Cofrinho();

        int opcao;

        // Loop principal do menu
        do {
            // Exibe as opções do menu já tinha feito com python1
            System.out.println("\n====== MENU COFRINHO ======");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar moeda
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    int tipo = sc.nextInt();

                    System.out.print("Digite o valor: ");
                    double valor = sc.nextDouble();

                    Moeda moeda = null;
                    switch (tipo) {
                        case 1:
                            moeda = new Real(valor); // Cria moeda Real
                            break;
                        case 2:
                            moeda = new Dolar(valor); // Cria moeda Dólar
                            break;
                        case 3:
                            moeda = new Euro(valor); // Cria moeda Euro
                            break;
                        default:
                            System.out.println("Tipo inválido!");
                            continue; // Volta para o menu
                    }

                    cofrinho.adicionar(moeda); // Adiciona moeda ao cofrinho
                    System.out.println("Moeda adicionada com sucesso!");
                    break;

                case 2:
                    // Remover moeda
                    System.out.println("Digite o tipo de moeda para remover:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    tipo = sc.nextInt();

                    System.out.print("Digite o valor da moeda: ");
                    valor = sc.nextDouble();

                    Moeda moedaRemover = null;
                    switch (tipo) {
                        case 1:
                            moedaRemover = new Real(valor);
                            break;
                        case 2:
                            moedaRemover = new Dolar(valor);
                            break;
                        case 3:
                            moedaRemover = new Euro(valor);
                            break;
                        default:
                            System.out.println("Tipo inválido!");
                            continue;
                    }

                    cofrinho.remover(moedaRemover); // Remove moeda do cofrinho
                    System.out.println("Moeda removida (se existia no cofrinho).");
                    break;

                case 3:
                    // Listar moedas
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    // Calcular total convertido para reais
                    double total = cofrinho.totalConvertido();
                    System.out.printf("Total convertido em reais: R$%.2f\n", total);
                    break;

                case 0:
                    // Encerra o programa
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0); // Continua até o usuário escolher 0

        sc.close(); // Fecha o scanner
    }
}
