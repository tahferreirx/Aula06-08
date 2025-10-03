package AtividadeDeRevisão;

import java.util.Random;

public class Atividade6RolarODado {
	public static void main(String[] args) {
		
		Random ramdom = new Random();
        int tentativas = 0;
        int resultado;
        
        System.out.println("Jogando o dado...");
        
        do {
        	
            resultado = ramdom.nextInt(6) + 1; 
            tentativas++;
            System.out.println("Tentativa " + tentativas + ": saiu " + resultado);
        } while (resultado != 6);
        
        System.out.println("Conseguiu 6 na tentativa número " + tentativas + "!");
    }
}

