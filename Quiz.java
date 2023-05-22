/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quiz;

/**
 *
 * @author silva
 */
import java.util.Scanner;

public class Quiz {
    
    //MÉTODO ALTERNATIVO PARA LER A RESPOSTA DO USUÁRIO
    static String inputResposta() {
        Scanner input = new Scanner(System.in);
        String resposta = "";
        resposta = input.nextLine();
        return resposta;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //MENU INTERATIVO
        System.out.println("Bem-vindo ao Quiz de Futebol! Escolha uma opção:");
        System.out.println("-----------------");
        System.out.println("|     MENU      |");
        System.out.println("-----------------");
        System.out.println("| 1. Introdução |");
        System.out.println("| 2. Jogar      |");
        System.out.println("| 3. Créditos   |");
        System.out.println("| 4. Sair       |");
        System.out.println("-----------------");

        //ARRAY COM PERGUNTAS
        String[] perguntas = {"Qual é o país que mais venceu a Copa do Mundo?",
            "Qual foi o primeiro clube brasileiro a conquistar a Libertadores?",
            "Quem é o jogador com mais gols na história da Seleção Brasileira?",
            "Quem é o maior artilheiro da champions league",
            "Quantas vezes o vasco foi rebaixado?",
            "Qual jogador argentino é conhecido como El Pibe de Oro?",
            "Qual seleção ganhou a primeira Copa do Mundo em 1930?",
            "Quantas champions league o PSG tem?",
            "Qual é o clube com mais títulos da Liga dos Campeões da UEFA?",
            "Em qual ano o Brasil perdeu de 7X1?"};

        //ARRAY COM RESPOSTAS
        String[] respostas = {"Brasil", "Santos", "Pele", "CR7", "4", "Maradona", "Uruguai", "nenhuma", "Real Madrid", "2014"};

        //VARIÁVEL PARA ARMAZENAR PONTUAÇÃO
        int pontuacao = 0;

        //ESCOLHA DO USUÁRIO
        int escolha = input.nextInt();

        //LOOP PRINCIPAL DO JOGO, QUE MANTEM O USUÁRIO JOGANDO ENQUANTO NÃO ESCOLHER A OPÇÃO SAIR
        while (escolha != 4) {
            switch (escolha) {

                case 1:
                    //EXIBIÇÃO DAS INSTRUÇÕES
                    exibirInstrucoes();

                    break;

                case 2:
                    //LOOP QUE APRESENTA AS PERGUNTAS DO QUIZ, VERIFICA AS RESPOSTAS E MUDA A PONTUAÇÃO
                    for (int i = 0; i < perguntas.length; i++) {
                        System.out.println(perguntas[i]);
                        String respostaUsuario = inputResposta();

                        if (verificarResposta(respostaUsuario, respostas[i])) {
                            System.out.println("Correto!");
                            pontuacao++;
                        } else {
                            System.out.println("Incorreto!");
                            respostaUsuario = "";
                        }
                    }
                    System.out.println("Sua pontuação final foi " + pontuacao + " de " + perguntas.length);
                    System.out.println();
                    pontuacao = 0; // ZERANDO A PONTUAÇÃO PARA UMA NOVA JOGADA

                    break;

                case 3:
                    //EXIBIÇÃO DOS CRÉDITOS
                    exibirCreditos();

                    break;

                default:
                    //OPÇÃO DIFERENTE DE 1, 2, 3, E 4
                    System.out.println("Essa opção não existe, insira uma opção válida.");

                    break;
            }
            //EXIBIÇÃO DO MENU NOVAMENTE APÓS CADA OPÇÃO SELECIONADA
        System.out.println("-----------------");
        System.out.println("|     MENU      |");
        System.out.println("-----------------");
        System.out.println("| 1. Introdução |");
        System.out.println("| 2. Jogar      |");
        System.out.println("| 3. Créditos   |");
        System.out.println("| 4. Sair       |");
        System.out.println("-----------------");

            escolha = input.nextInt();
        }

        System.out.println("Obrigado por jogar o nosso Quiz sobre Futebol!");
        System.out.println();
    }

    //FUNÇÃO PARA EXIBIR AS INSTRUÇÕES DO JOGO
    public static void exibirInstrucoes() {
        System.out.println("Este é o nosso quiz sobre futebol. Para cada pergunta que você acertar, você ganhará um ponto e ao final ira mostrar sua quantidade de acertos.");
        System.out.println();
    }

    //FUNÇÃO PARA EXIBIR OS CRÉDITOS DO JOGO
    public static void exibirCreditos() {
        System.out.println("Desenvolvido por: Brenno Borges, Pedro Henrique Costa, Pedro Henrique Pereira, Pedro Santos e Samuel Albuquerque ");
        System.out.println();
    }

    //FUNÇÃO PARA VERIFICAR SE A RESPOSTA DO USUÁRIO ESTÁ CORRETA
    public static boolean verificarResposta(String respostaUsuario, String respostaCorreta) {
        //VERIFICA SE A RESPOSTA ESTÁ CERTA, IGNORANDO LETRAS MAIÚSCULAS E MINÚSCULAS
        if (respostaUsuario.equalsIgnoreCase(respostaCorreta)) {
            return true;
        } else {
            return false;
        }
    }
}
