package org.generation.italy;

import java.util.Random;

public class Snack2 {

	/*
	 * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha
	 * una lista di nomi e una lista di cognomi, e da queste vuole
	 * mostrare a video una falsa lista di invitati con nome e cognome.
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] names = { "Pluto", "Topolino", "Pippo" };
		String[] surnames = { "Bianchi", "Rossi", "Gialli" };
		
		String[] fullNames = new String[3];
		
		for (int x=0;x<names.length;x++) {
			
			String name = names[x];
			
			int surnameIndex = rnd.nextInt(surnames.length);
			String surname = surnames[surnameIndex];
			
			String fullName = name + " " + surname;
			fullNames[x] = fullName;
			
			System.out.println(fullName);
		}
	}
}
