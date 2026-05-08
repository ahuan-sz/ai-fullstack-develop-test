package cn.codemao;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        final int iterations = 10000;

        // 1. 普通字符串拼接（使用 +）
        long start = System.nanoTime();
        String resultNormal = ", ";
        for (int i = 0; i < iterations; i++) {
            resultNormal += i + ", ";
        }
        long end = System.nanoTime();
        double timeNormal = (end - start) / 1_000_000.0; // 转换为毫秒

        // 2. StringBuilder 拼接
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i).append(", ");
        }
        String resultBuilder = sb.toString();
        end = System.nanoTime();
        double timeBuilder = (end - start) / 1_000_000.0;

        // 输出结果
        System.out.printf("普通字符串拼接耗时：%.3f ms%n", timeNormal);
        System.out.printf("StringBuilder 拼接耗时：%.3f ms%n", timeBuilder);
    }
}