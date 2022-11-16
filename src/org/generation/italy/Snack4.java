package org.generation.italy;

import java.util.Random;

public class Snack4 {

	/**
	 	Crea due array che hanno un numero di elementi diversi. 
		Mostra a video dei nuovi elementi random finchè il numero 
		di elementi presenti nell'array che ne ha di meno + quelli 
		mostrati a video non è uguale al numero di elementi presenti 
		nell'array che ne ha di più
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[10];
		
		for (int x=0;x<arr2.length-arr1.length;x++) {
			
			int rndValue = rnd.nextInt(100);
			System.out.println(rndValue);
		}
	}
}
