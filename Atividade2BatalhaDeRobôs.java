package AtividadeDeRevisão;

import java.util.Scanner;

public class Atividade2BatalhaDeRobôs {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Força do Robô 1 (1-100): ");
		int robo1 = ler.nextInt();
		
		System.out.print("Força do Robô 2 (1-100): ");
		int robo2 = ler.nextInt();
		
		int vitorias1 = 0;
		int vitorias2 = 0;
		
		for (int i = 0; i < 5; i++) {
			if (robo1 > robo2) {
				vitorias1++;
				
			} else if (robo2 > robo1) {
				vitorias2++;
		            }
		        }
		
		System.out.println("Placar Final");
		
		System.out.println("Robô 1: " + vitorias1 + " vitórias");
		System.out.println("Robô 2: " + vitorias2 + " vitórias");
		
		if (vitorias1 > vitorias2) {
			System.out.println("Robô 1 venceu!");
			
		} else if (vitorias2 > vitorias1) {
			
			System.out.println("Robô 2 venceu!");
			
		} else {
			System.out.println("Empate!");
		        }

		ler.close();
	}

}
