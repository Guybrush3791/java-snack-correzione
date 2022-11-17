package org.generation.italy;

public class Snack7 {

	public static void main(String[] args) {
		
		String[] words = { 
			"Lorem", "ip", "dolor", "sit", 
			"amet", "consectetur", "adipisicing!!", "elit" 
		};
		
		String concat = "";
		for (int x=0;x<words.length;x++) {
			
			String word = words[x];
			concat += word;
		}
		System.out.println(concat);
		
//		---------------------------------------------------
		
		String revConcat = "";
		for (int x=words.length-1;x>=0;x--) {
			
			String word = words[x];
			revConcat += word;
		}
		System.out.println(revConcat);
		
//		---------------------------------------------------
		
		String longestW = words[0];
		for (int x=1;x<words.length;x++) {
			
			String word = words[x];
			
			if (word.length() > longestW.length()) {
				
				longestW = word;
			}
		}
		System.out.println(longestW);
		
//		---------------------------------------------------
		
		String shortesW = words[0];
		for (int x=1;x<words.length;x++) {
			
			String word = words[x];
			
			if (word.length() < shortesW.length()) {
				
				shortesW = word;
			}
		}
		System.out.println(shortesW);
	}
}
















