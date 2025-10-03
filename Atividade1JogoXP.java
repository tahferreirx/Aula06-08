package AtividadeDeRevisão;

import java.util.Scanner;

public class Atividade1JogoXP {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o total de XP de um jogador: ");
		int pontuacao = ler.nextInt();
		
		ler.close();
		
		if (pontuacao <= 100 ) {
			System.out.println("Seu nível é: Noob");
		} else if ( pontuacao <= 500 ) {
			System.out.println("Seu nível é: Aprendiz" );
		} else if ( pontuacao <= 1000 ) {
			System.out.println("Seu nível é: Pro" );
		} else if ( pontuacao  > 1000 ){
			System.out.println("Seu nível é: Lendário" );
		} else {
			System.out.println("Nível do jogador não encontrado");
			
		}
	}

}
