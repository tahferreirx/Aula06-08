package AtividadeDeRevisão;

import java.util.Random;

public class Atividade8EncontrarRapunzel {
	
	public static void main(String[] args) {
		
		int degrauAtual = 0;
		Random random = new Random();
		int degrauRapunzel = random.nextInt(50)+1;
		
		System.out.println("Rapunzel está presa no degrau " + degrauRapunzel + " da torre.");
		System.out.println("Subindo...");
		
		while (degrauAtual < degrauRapunzel) {
			degrauAtual++;
			System.out.println(" " + degrauAtual);
		}
		System.out.println("Parabéns, você chegou até Rapunzel!");
	}

}
