package cn.codemaon.paradigms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. 测试 swap 方法：交换 List 中两个位置的元素
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        System.out.println("原始列表: " + names);

        GenericUtils.swap(names, 1, 3);  // 交换索引 1 和 3
        System.out.println("交换索引1和3后: " + names);

        // 2. 测试 firstOf 方法：获取列表第一个元素
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println("\n数字列表: " + numbers);
        Integer firstNum = GenericUtils.firstOf(numbers);
        System.out.println("第一个元素: " + firstNum);
    }
}
