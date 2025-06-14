package gf.oracle.programaçao;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== MENU QUIZ DE FUTEBOL ===");
            System.out.println("1 - Iniciar o quiz");
            System.out.println("2 - Instruções");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                int pontos = 0;

                pontos += perguntar(scanner, "Qual país ganhou a Copa do Mundo de 2002?",
                        "A) Alemanha", "B) Brasil", "C) Argentina", "D) França", "B");

                pontos += perguntar(scanner, "Onde nasceu Cristiano Ronaldo?",
                        "A) Espanha", "B) Brasil", "C) Portugal", "D) Itália", "C");

                pontos += perguntar(scanner, "Qual é o nome do estádio do Barcelona?",
                        "A) Old Trafford", "B) Santiago Bernabéu", "C) Camp Nou", "D) San Siro", "C");

                pontos += perguntar(scanner, "Quantos jogadores um time tem em campo?",
                        "A) 9", "B) 10", "C) 11", "D) 12", "C");

                pontos += perguntar(scanner, "Em que cidade fica o estádio Maracanã?",
                        "A) São Paulo", "B) Rio de Janeiro", "C) Belo Horizonte", "D) Salvador", "B");

                pontos += perguntar(scanner, "Qual é a cor principal do uniforme da Seleção Brasileira?",
                        "A) Verde", "B) Amarelo", "C) Azul", "D) Branco", "B");

                pontos += perguntar(scanner, "Em que continente acontece a UEFA Champions League?",
                        "A) América do Sul", "B) África", "C) Europa", "D) Ásia", "C");

                pontos += perguntar(scanner, "Quem é conhecido como 'O Rei do Futebol'?",
                        "A) Zico", "B) Ronaldo", "C) Pelé", "D) Romário", "C");

                pontos += perguntar(scanner, "Quem marcou o famoso gol da 'Mão de Deus'?",
                        "A) Zidane", "B) Pelé", "C) Maradona", "D) Messi", "C");

                pontos += perguntar(scanner, "Quantos títulos mundiais tem o Brasil?",
                        "A) 4", "B) 5", "C) 6", "D) 7", "B");

                // Perguntas mais difíceis

                pontos += perguntar(scanner, "Quem foi o artilheiro da Copa de 2010?",
                        "A) David Villa", "B) Diego Forlán", "C) Thomas Müller", "D) Wesley Sneijder", "C");

                pontos += perguntar(scanner, "Quantas Champions League o Real Madrid tinha até 2023?",
                        "A) 10", "B) 11", "C) 14", "D) 13", "C");

                pontos += perguntar(scanner, "Em que ano o Maradona marcou o gol da 'Mão de Deus'?",
                        "A) 1982", "B) 1986", "C) 1990", "D) 1994", "B");

                pontos += perguntar(scanner, "Quem ganhou a Bola de Ouro em 1999?",
                        "A) Rivaldo", "B) Zidane", "C) Figo", "D) Ronaldo", "A");

                pontos += perguntar(scanner, "Quantos gols Ronaldo Fenômeno fez em Copas do Mundo?",
                        "A) 12", "B) 15", "C) 14", "D) 16", "B");

                pontos += perguntar(scanner, "Qual foi o placar da final da Copa de 2014?",
                        "A) 1x0", "B) 2x1", "C) 2x0", "D) 1x1", "A");

                pontos += perguntar(scanner, "Em que ano o Santos FC ganhou sua primeira Libertadores?",
                        "A) 1961", "B) 1962", "C) 1963", "D) 1964", "B");

                pontos += perguntar(scanner, "Qual seleção ganhou a primeira Copa do Mundo, em 1930?",
                        "A) Brasil", "B) Uruguai", "C) Argentina", "D) Alemanha", "B");

                pontos += perguntar(scanner, "Quem fez o gol do título da Copa de 2014?",
                        "A) Götze", "B) Müller", "C) Klose", "D) Özil", "A");

                pontos += perguntar(scanner, "Quantas Copas o Messi jogou até 2022?",
                        "A) 3", "B) 4", "C) 5", "D) 6", "C");

                System.out.println("\n=== FIM DO QUIZ ===");
                System.out.println("Você fez " + pontos + " ponto(s) de 20.\n");

            } else if (opcao == 2) {
                System.out.println("\nINSTRUÇÕES:");
                System.out.println("Escolha a opção 1 para começar o quiz.");
                System.out.println("Depois, digite a letra da resposta correta (A, B, C ou D).");
                System.out.println("Após cada resposta, o programa vai dizer se você acertou ou errou.");
                System.out.println("Ao final, veja sua pontuação total.\n");
            } else if (opcao == 3) {
                System.out.println("\nSaindo do quiz... Até a próxima!");
            } else {
                System.out.println("\nOpção inválida. Tente novamente.\n");
            }

        } while (opcao != 3);

        scanner.close();
    }

    // Função que pergunta, lê a resposta e informa se acertou ou errou
    public static int perguntar(Scanner scanner, String pergunta, String opA, String opB, String opC, String opD, String respostaCorreta) {
        System.out.println("\n" + pergunta);
        if (!opA.equals("")) System.out.println(opA);
        if (!opB.equals("")) System.out.println(opB);
        if (!opC.equals("")) System.out.println(opC);
        if (!opD.equals("")) System.out.println(opD);

        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase(respostaCorreta)) {
            System.out.println("✅ Resposta correta!");
            return 1;
        } else {
            System.out.println("❌ Resposta errada! A correta era: " + respostaCorreta);
            return 0;
        }
    }
}



