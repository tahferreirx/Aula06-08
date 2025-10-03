package AtividadeDeRevisão;

import java.util.Random;

public class Atividade10TorneioDeLutaDePersonagens {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int vidaPers1 = 100;
		int vidaPers2 = 100;
		int forca1, forca2;
		
		do {
			forca1 = random.nextInt(100)+1;
			forca2 = random.nextInt(100)+1;
			
			System.out.println("Personagem 1 ataca com " + forca1 + " de dano.");
			System.out.println("Personagem 2 ataca com " + forca2 + " de dano.");
			System.out.println();
			
			vidaPers1 -= forca2;
			vidaPers2 -= forca1;
			
			System.out.println("Vida Personagem 1: " + vidaPers1);
			System.out.println("Vida Personagem 2: " + vidaPers2);
			System.out.println();
			
		} while (vidaPers1 > 0 && vidaPers2 > 0);
		
		if (vidaPers1 <= 0 && vidaPers2 <= 0) {
			System.out.println("Empate! Ambos os personagens morreram");
		}
		else if (vidaPers2 <= 0) {
			System.out.println("Personagem 1 é o vencedor!");
		}
		else {
			System.out.println("Personagem 2 é o vencedor!");
		}
	}

}
