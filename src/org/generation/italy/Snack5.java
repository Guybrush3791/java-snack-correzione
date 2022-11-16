package org.generation.italy;

public class Snack5 {

	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int min = Integer.MAX_VALUE;
		for (int x=0;x<arr.length;x++) {
			
			int value = arr[x];
			
			if (value < min) {
				
				min = value;
			}
		}	
		System.out.println("min: " + min);
		
		int max = Integer.MIN_VALUE;
		for (int x=0;x<arr.length;x++) { 
			
			int value = arr[x];
			
			if (value > max) {
				
				max = value;
			}
		}
		System.out.println("max: " + max);
		
		int sum = 0;
		for (int x=0;x<arr.length;x++) {
			
			int value = arr[x];
			sum += value;
		}
		int avg = sum / arr.length;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}












