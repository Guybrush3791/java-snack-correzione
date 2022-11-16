package org.generation.italy;

public class Snack3 {

	/**
		Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari

	 */
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int sum = 0;
//		for (int x=0;x<arr.length;x++) {
//			
//			if (x % 2 != 0) {
//				
//				int value = arr[x];
//				sum += value;
//			}
//		}
		for (int x=1;x<arr.length;x+=2) {
			
			int value = arr[x];
			sum += value;
		}
		
		System.out.println(sum);
	}
}
