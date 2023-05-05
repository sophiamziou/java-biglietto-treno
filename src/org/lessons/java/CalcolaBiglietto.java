package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quanti chilometri devi percorrere?");
		int km = scanner.nextInt();
		
		System.out.println("Quanti anni hai?");
		int anni = scanner.nextInt();
		
		System.out.println("km: " + km);
		System.out.println("anni: " + anni);
		
		int prezzo = km * 21 ;
		System.out.println("prezzo parziale: " + prezzo);
		
		if (anni < 18) {
			
			prezzo = prezzo * 80/100;
			
		} else if (anni > 65) {
			
			prezzo = prezzo * 60/100;
		}
		
		float prezzoFinale = prezzo / 100f;
		System.out.println(
				"prezzo finale: " 
				+ String.format("%.2f", prezzoFinale)
				+ "E"
			);
		
		scanner.close();
	}
}
