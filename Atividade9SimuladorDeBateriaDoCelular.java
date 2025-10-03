package AtividadeDeRevisão;

public class Atividade9SimuladorDeBateriaDoCelular {
	
	public static void main(String[] args) {
		
		int bateria = 100;
		int min = 0;
		
		
		while (bateria > 0) {
			bateria -= 7;
			min ++;
		}
		
		System.out.println("Duração: " + min + " minutos.");
	}

}
