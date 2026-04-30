package cn.codemao;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    /**
     * 生成指定范围内的随机数
     * @param min 最小值（包含）
     * @param max 最大值（包含）
     * @return min到max之间的随机数
     */
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    /**
     * 猜数字游戏核心逻辑
     * @param targetNumber 目标数字
     * @param maxAttempts 最大猜测次数
     * @return 是否猜对
     */
    public static boolean guessNumber(int targetNumber, int maxAttempts) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < maxAttempts) {
            System.out.print("请输入你猜的数字（第" + (count + 1) + "次，共" + maxAttempts + "次机会）：");
            int guess = scanner.nextInt();
            count++;

            if (guess < targetNumber) {
                System.out.println("猜小了，再试一次！");
            } else if (guess > targetNumber) {
                System.out.println("猜大了，再试一次！");
            } else {
                System.out.println("恭喜你，猜对了！答案就是 " + targetNumber);
                return true;
            }
        }

        System.out.println("很遗憾，次数用完了！正确答案是：" + targetNumber);
        return false;
    }

    public static void main(String[] args) {
        // 1. 随机生成一个1～100之间的数字
        int number = generateRandomNumber(1, 100);
        System.out.println("随机生成的数字是(调试用)：" + number);

        // 2. 调用猜数字游戏，最多5次机会
        boolean success = guessNumber(number, 5);

        if (success) {
            System.out.println("游戏胜利！");
        } else {
            System.out.println("游戏失败！");
        }
    }
}
