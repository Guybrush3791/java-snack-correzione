package org.generation.italy;

import java.util.Arrays;

public class Snack6 {

	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int[] sumArr = new int[arr1.length];
		for (int x=0;x<arr1.length;x++) {
			
			int value1 = arr1[x];
			int value2 = arr2[x];
			
			int sum = value1 + value2;
			
			sumArr[x] = sum;
		}
		System.out.println(Arrays.toString(sumArr));
		
//		--------------------------------------------------------
		
		int min = Integer.MAX_VALUE;
		for (int x=0;x<arr1.length;x++) {
			
			int value = arr1[x];
			
			if (value < min) {
				
				min = value;
			}
		}
		for (int x=0;x<arr2.length;x++) {
			
			int value = arr2[x];
			
			if (value < min) {
				
				min = value;
			}
		}
		System.out.println("min: " + min);
		
//		--------------------------------------------------------
		
		int min2 = Integer.MAX_VALUE;
		for (int x=0;x<arr1.length;x++) {
			
			int value1 = arr1[x];
			int value2 = arr2[x];
			
			int minValue = Integer.MAX_VALUE;
			if (value1 < minValue) {
				
				minValue = value1;
			}
			if (value2 < minValue) {
				
				minValue = value2;
			}
			
			if (minValue < min2) {
				
				min2 = minValue;
			}
		}
		System.out.println("min: " + min);
		
//		--------------------------------------------------------
		
		int max = Integer.MIN_VALUE;
		for (int x=0;x<arr1.length;x++) {
			
			int value = arr1[x];
			
			if (value > max) {
				
				max = value;
			}
		}
		for (int x=0;x<arr2.length;x++) {
			
			int value = arr2[x];
			
			if (value > max) {
				
				max = value;
			}
		}
		System.out.println("max: " + max);
		
//		--------------------------------------------------------
		
		int sum = 0;
		for (int x=0;x<arr1.length;x++) {
			
			int value = arr1[x];
			sum += value;
		}
		for (int x=0;x<arr2.length;x++) {
			
			int value = arr2[x];
			sum += value;
		}
		
		int avg = sum / (arr1.length + arr2.length);
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}













