package javaprogramms1;

import java.util.HashMap;
import java.util.Map;
//java programms1112
public class DuplicateFindTextRecords {
	public static void main(String[] args) {
		String sentence = "This is a sentence with duplicate words in this sentence";
		// findDuplicateWords(sentence);
		System.out.println("sentence:"+sentence);
	}

	public static void DuplicateWords(String sentence) {
		String[] words = sentence.toLowerCase().split(" ");
		Map<String, Integer> frequencyMap = new HashMap<String, Integer>();

		// Count the frequency of each word in the sentence
		for (String word : words) {
			if (frequencyMap.containsKey(word)) {
				frequencyMap.put(word, frequencyMap.get(word) + 1);
				System.out.println("word:"+frequencyMap);
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
