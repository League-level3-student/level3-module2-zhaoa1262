package _02_More_Algorithms;

import java.util.List;
import java.util.Collections;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearlCount = 0;
		for(int i = 0; i<oysters.size(); i++) {
			if(oysters.get(i) == true) {
				pearlCount++;
			}
		}
		return pearlCount;
	}
	
	public static double findTallest(List<Double> peeps) {
		double number = peeps.get(0);
	    for(int i = 0; i < peeps.size(); i++) {
	      if(number<peeps.get(i)) {
	        number = peeps.get(i);
	      }
	    }
	    return number;
	}
	
	public static String findLongestWord(List <String> words) {
		String longestWord = "bleh";
		for(int i = 0; i<words.size(); i++) {
			if(longestWord.length() < words.get(i).length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
	
	//The Morse code for SOS is "... --- ..."
	public static boolean containsSOS(List<String> message) {
		String sos = "... --- ...";
		for(int i = 0; i<message.size(); i++) {
			if(message.get(i).equals(sos)) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i<results.size(); i++) {
			for(int j = i+1; j<results.size(); j++) {
				if(results.get(i) > results.get(j)) {
					Collections.swap(results, i, j);
				}
			}
		}
		return results;
		
	}
	
	public static List<String> sortDNA(List<String> dna) {
		for(int i = 0; i<dna.size(); i++) {
			for(int j = i+1; j<dna.size(); j++) {
				if(dna.get(i).length()>dna.get(j).length()) {
					Collections.swap(dna, i, j);
				}
				
			}
			
		}
		return dna;
		   
	}
	
	public static List<String> sortWords(List <String> words) {
		for(int i = 0; i<words.size(); i++) {
			for(int j = i+1; j<words.size(); j++) {
				if(words.get(i).compareTo(words.get(j))>0) {
					Collections.swap(words, i, j); 
				}
			}
			
		}
		return words;
	}
}
