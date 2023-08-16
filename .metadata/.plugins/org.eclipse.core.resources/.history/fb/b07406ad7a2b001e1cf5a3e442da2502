package javaprogramms1;
//999999
import java.util.HashMap;
import java.util.Map;
//java programms111
public class CountDuplicateWordsClass {
	public static void main(String[] args) {
		String sentence = "The IT (Information Technology) industry is a rapidly evolving and dynamic "
			+ "field that encompasses a wide range of technologies, services, and businesses. "
			+ " industry is a rapidly evolving and dynamic,"
			+ " and connectivity across various sectors.";

	countDuplicateWords(sentence);
}

public static void countDuplicateWords(String sentence) {
	String[] words = sentence.toLowerCase().split(" ");
	Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
	
	// Count the frequency of each word in the sentence
	for (String word : words) {
		if (frequencyMap.containsKey(word)) {
			frequencyMap.put(word, frequencyMap.get(word) + 1);
		} else {
			frequencyMap.put(word, 1);
		}
	}

	// Print the word count
	System.out.println("Word count in the sentence:");
	for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
		System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
