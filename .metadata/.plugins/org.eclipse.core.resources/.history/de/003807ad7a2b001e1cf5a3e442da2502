package javaprogramms1;

import java.util.HashMap;
import java.util.Map;
//java programms1154
public class DuplicateWordsClass {
	 public static void findDuplicateWords(String sente) {
	        String Sente =  "This is a sentence with duplicate words in this sentence";
	 }
	    


	    public static void findDuplicateWords1(String Sentence1) {
	        String[] words = Sentence1.toLowerCase().split(" ");
	        Map<String, Integer> frequencyMap = new HashMap<String, Integer>();

	        // Count the frequency of each word in the sentence
	        for (String word : words) {
	            if (frequencyMap.containsKey(word)) {
	                frequencyMap.put(word, frequencyMap.get(word) + 1);
	            } else {
	                frequencyMap.put(word, 1);
	            }
	        }

	        // Print the duplicate words
	        System.out.println("Duplicate words in the sentence:");
	        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
	}



