package cn.codemao;

public class DebugDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i; // 在此行设置断点
            System.out.println("i=" + i + ", sum=" + sum);
        }
    }
}
