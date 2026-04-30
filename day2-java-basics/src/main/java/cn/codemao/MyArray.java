package cn.codemao;

public class MyArray {
    private final int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    /**
     * 求数组最大值
     * @return 数组中的最大值
     */
    public int getMax() {
        if (array == null || array.length == 0) {
            throw new RuntimeException("数组为空");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 求数组最小值
     * @return 数组中的最小值
     */
    public int getMin() {
        if (array == null || array.length == 0) {
            throw new RuntimeException("数组为空");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * 求数组平均值
     * @return 数组的平均值
     */
    public double getAverage() {
        if (array == null || array.length == 0) {
            throw new RuntimeException("数组为空");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    /**
     * 获取指定索引位置的值
     * @param index 索引位置
     * @return 索引位置的值
     */
    public int getIndexValue(int index) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("数组为空");
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("索引越界：" + index);
        }
        return array[index];
    }

    /**
     * 查找指定值在数组中的索引位置
     * @param value 要查找的值
     * @return 值在数组中的索引，如果不存在返回-1
     */
    public int getIndexIndex(int value) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("数组为空");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
