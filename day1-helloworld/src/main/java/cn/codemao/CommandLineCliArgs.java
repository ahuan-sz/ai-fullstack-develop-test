package cn.codemao;// 需要添加依赖：commons-cli

import org.apache.commons.cli.*;

public class CommandLineCliArgs {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("h", "help", false, "显示帮助");
        options.addOption("n", "name", true, "用户名");
        options.addOption("a", "age", true, "年龄");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java CliExample", options);
            return;
        }

        String name = cmd.getOptionValue("name", "默认名");
        String ageStr = cmd.getOptionValue("age", "0");

        System.out.println("名字：" + name);
        System.out.println("年龄：" + ageStr);
    }
}