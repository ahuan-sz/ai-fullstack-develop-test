package cn.codemao;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[ ] args) {
        String text = "java java python Java go rust java go python";
        // 统一小写，按空格分词
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        freq.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
