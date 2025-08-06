package Atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaNúmerosInteirosEpares {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(); 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 5 números inteiros:");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Número " + (i + 1) + ": "); 
			int numero = ler.nextInt(); 
			numeros.add(numero); 
	 } 
		System.out.println("Os números pares digitados são:"); 
		
		for (int numero : numeros) { 
			if (numero % 2 == 0) { 
				System.out.print(numero + " ");
				
			}

	        } 
	          
	        ler.close(); 
		
	}

}