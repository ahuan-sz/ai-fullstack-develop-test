package cn.codemao.sets;

import java.util.*;

public class MergeList {
    public static <T> List<T> mergeAndDistinct(List<T> list1, List<T> list2) {
        Set<T> set = new LinkedHashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }
    // 测试
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 2);
        List<Integer> b = Arrays.asList(2, 4, 1, 5);
        System.out.println(mergeAndDistinct(a, b));  // [1, 2, 3, 4, 5]
    }
}
