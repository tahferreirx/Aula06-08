package AtividadeDeRevisão;

import java.util.Scanner;

public class Atividade4ChatBotDoAmor {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Você é legal? (sim/não): ");
		String resposta = ler.nextLine();
		
	ler.close();
		
		if (resposta.equals("sim")) {
			System.out.println("Você merece um bombom!");
		} else {
			System.out.println("Todo mundo tem seus dias!");
		}
		
	}

}
