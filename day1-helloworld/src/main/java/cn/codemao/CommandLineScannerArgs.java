package cn.codemao;

import java.util.Scanner;

public class CommandLineScannerArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("你输入的名字是：");

        String name = scanner.nextLine();

        System.out.print("请输入你的年龄：");
        int age = scanner.nextInt();

        // 注意：nextInt() 会留下换行符，如果需要继续读取字符串，需要清理
        scanner.nextLine();

        System.out.print("请输入你的城市：");
        String city = scanner.nextLine();

        System.out.println("-------------------");
        System.out.println("你好，" + name);
        System.out.println("年龄：" + age);
        System.out.println("城市：" + city);

        scanner.close(); // 记得关闭
    }
}
