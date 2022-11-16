package org.generation.italy;

import java.util.Scanner;

public class Snack1 {

	/*
	 * Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
//		if (value % 2 == 0) { // valore pari
//			
//			System.out.println(value);
//		} else {
//			
//			System.out.println(value + 1);
//		}
		
		System.out.println(value % 2 == 0 ? value : value + 1);
	}
}
