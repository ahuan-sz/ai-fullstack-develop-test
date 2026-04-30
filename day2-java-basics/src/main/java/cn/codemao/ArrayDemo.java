package cn.codemao;

public class ArrayDemo {
    public static void main(String[] args) {
        // 封装一个单独的类MyArray，实现数组求最大值，最小值，平均值，查找具体某个元素的索引，具体索引的值的方法
        // 这里是具体调用
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("最大值：" + myArray.getMax());
        System.out.println("最小值：" + myArray.getMin());
        System.out.println("平均值：" + myArray.getAverage());
        System.out.println("索引为5的值：" + myArray.getIndexValue(5));
        System.out.println("索引为5的索引：" + myArray.getIndexIndex(5));
    }
}
