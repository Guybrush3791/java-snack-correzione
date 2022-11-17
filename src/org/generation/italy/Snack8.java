package org.generation.italy;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		Random rnd = new Random(128);
		
		int[] arr = new int[10];
		
		for (int x=0;x<10;x++) {
			
			int rndValue = rnd.nextInt(-50, 50);
			arr[x] = rndValue;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int absMaxValue = Integer.MIN_VALUE;
		int absMax = Integer.MIN_VALUE;
		for (int x=0;x<arr.length;x++) {
			
			int value = arr[x];
			int absValue = Math.abs(value);
			
			if (absValue > absMax) {
				
				absMax = absValue;
				absMaxValue = value;
			}
		}
		System.out.println(absMaxValue);
		
//		------------------------------------------------------
		
		int absMinValue = Integer.MAX_VALUE;
		int absMin = Integer.MAX_VALUE;
		for (int x=0;x<arr.length;x++) {
			
			int value = arr[x];
			int absValue = Math.abs(value);
			
			if (absValue < absMin) {
				
				absMin = absValue;
				absMinValue = value;
			}
		}
		System.out.println(absMinValue);
		
//		------------------------------------------------------
		
		int sum5 = 0;
		for (int x=0;x<arr.length;x++) {
			
			int value = arr[x];
			
			if (value % 5 == 0) {
				
				sum5 += value;
			}
		}
		System.out.println(sum5);
	}
}

















