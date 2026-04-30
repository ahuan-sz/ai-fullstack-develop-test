package cn.codemao;

public class CommandLineMainArgs {
    public static void main(String[] args) {
        String name = "默认名";
        int age = 0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-name":
                    if (i + 1 < args.length) {
                        name = args[++i];
                    }
                    break;
                case "-age":
                    if (i + 1 < args.length) {
                        try {
                            age = Integer.parseInt(args[++i]);
                        } catch (NumberFormatException e) {
                            System.out.println("年龄格式错误");
                        }
                    }
                    break;
                case "-help":
                    printHelp();
                    return;
                default:
                    System.out.println("未知参数：" + args[i]);
            }
        }

        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
    }

    private static void printHelp() {
        System.out.println("使用方法：");
        System.out.println("-name <名字>  指定名字");
        System.out.println("-age <年龄>   指定年龄");
        System.out.println("-help        显示帮助");
    }
}
