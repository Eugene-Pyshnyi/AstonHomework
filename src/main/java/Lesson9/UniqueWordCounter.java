package Lesson9;

import java.util.*;

public class UniqueWordCounter {
    public void count(ArrayList<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println("Уникальные слова в списке: ");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nПовторов слов: ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
