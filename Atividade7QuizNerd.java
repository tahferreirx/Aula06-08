package AtividadeDeRevisão;

import java.util.Scanner;

public class Atividade7QuizNerd {
	public static void main(String[] args) {
	
		        Scanner ler = new Scanner(System.in);
		        int pontuacao = 0;

		        // Perguntas e respostas
		        String[][] perguntas = {
		            {"Qual anime possui 'Luffy' e 'Zoro'?", "a) Naruto", "b) One Piece", "c) Dragon Ball", "b"},
		            {"Qual jogo popularizou 'Mario'?", "a) Donkey Kong", "b) The Legend of Zelda", "c) Sonic", "a"},
		            {"Qual série tem dragões e Jon Snow?", "a) The Witcher", "b) Game of Thrones", "c) Stranger Things", "b"}
		        };

		        System.out.println("=== QUIZ NERD ===");

		        for (String[] pergunta : perguntas) {
		            System.out.println(pergunta[0]);
		            System.out.println(pergunta[1]);
		            System.out.println(pergunta[2]);
		            System.out.println(pergunta[3]);
		            System.out.print("Sua resposta: ");
		            String resposta = ler.nextLine();

		            if (resposta.equalsIgnoreCase(pergunta[4])) {
		                System.out.println("Correto!");
		                pontuacao++;
		            } else {
		                System.out.println("Errado! A resposta correta é " + pergunta[4]);
		            }
		        }

		        // Resultado final
		        System.out.println("\n=== FIM DO QUIZ ===");
		        System.out.println("Sua pontuação final: " + pontuacao + "/3");
		        ler.close();
		    
		

	}

}
