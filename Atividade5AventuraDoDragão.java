package AtividadeDeRevisão;

import java.util.Random;

public class Atividade5AventuraDoDragão {
	public static void main(String[] args) {
		
		int vida = 100;
		
		Random ramdom = new Random();
		int rodada = 1;
		
		while (vida > 0) {
			
			int dano = ramdom.nextInt(16) + 5;
			vida -= dano;
			
			if (vida < 0) vida = 0;
			
			System.out.println("Rodada " + rodada + ": Dragão causou " + dano + " de dano. Sua vida é: " + vida);
			
			rodada++;
			
		}
		
		System.out.println("Fim do jogo!");
		    
	}

}

