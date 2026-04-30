package cn.codemao;

public class ArithmeticCalculator {
    // 四则运算计算器（处理除零）
    public static void main(String[] args) {
        // 四则运算调用
        System.out.println(add(1, 2));
        System.out.println(sub(1, 2));
        System.out.println(mul(1, 2));
        System.out.println(div(1, 2));
        System.out.println(div(1, 0));
    }

    // 加
    public static int add(int a, int b) {
        return a + b;
    }

    // 减
    public static int sub(int a, int b) {
        return a - b;
    }

    // 乘
    public static int mul(int a, int b) {
        return a * b;
    }

    // 除，需处理除零
    public static int div(int a, int b) {
        if (b == 0) {
            // 抛出异常
            throw new RuntimeException("除数不能为零");
        }
        return a / b;
    }
}
