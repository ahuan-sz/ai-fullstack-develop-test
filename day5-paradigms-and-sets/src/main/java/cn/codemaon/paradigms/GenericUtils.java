package cn.codemaon.paradigms;

import java.util.List;

public class GenericUtils {
    // 交换列表中两个位置的元素
    public static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // 返回列表的第一个元素，若列表为空则返回 null
    public static <T> T firstOf(List<T> list) {
        return list.isEmpty() ? null : list.get(0);
    }
}
