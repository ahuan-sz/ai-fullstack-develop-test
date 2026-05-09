package cn.codemao.sets;

import java.util.*;
import java.util.Map.Entry;

public class TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        // 1. 统计频率
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        // 2. 使用最小堆，堆内按频率升序，频率相同按单词降序（因为要弹出小的）
        PriorityQueue<Entry<String, Integer>> minHeap =
            new PriorityQueue<>((e1, e2) -> {
                if (e1.getValue().equals(e2.getValue())) {
                    return e2.getKey().compareTo(e1.getKey()); // 单词降序
                } else {
                    return e1.getValue() - e2.getValue();
                }
            });
        for (Entry<String, Integer> entry : freq.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) minHeap.poll();
        }
        // 3. 取出结果并反转顺序
        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }
        Collections.reverse(result);
        return result;
    }


    public static void main(String[ ] args) {
        String[ ] words = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(words, 2)); // [i, love]
    }
}
