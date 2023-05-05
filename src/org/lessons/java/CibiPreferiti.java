package org.lessons.java;

public class CibiPreferiti {
public static void main(String[] args) {
		
		String[] preferiti = {
				"pizza",
				"pasta",
				"patatine",
				"gelato",
				"hamburger",
				"sushi"
		};
		
		int preferitilng = preferiti.length;
		String migliore = preferiti[0];
		String peggiore = preferiti[preferitilng - 1];
		
		System.out.println("Numero cibi preferiti: " + preferitilng);
		System.out.println("Cibo preferito: " + migliore);
		System.out.println("Cibo meno preferito: " + peggiore);
		
		int mediaIndex = preferitilng / 2;
		String media = preferiti[mediaIndex];
		System.out.println("Cibo mediamente prefertito : " + media);
		
		if (preferitilng % 2 == 0) {
			
			String mediaTop = preferiti[mediaIndex - 1];
			System.out.println("Cibo mediamente più preferito: " + mediaTop);			
		}
	}

}
