package cn.codemao;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class FileDemo {
    // 文件路径
    private static final String SMALL_INPUT = "src/main/resources/input.txt";
    private static final String SMALL_OUTPUT = "src/main/resources/output.txt";
    private static final String BIG_INPUT = "src/main/resources/big.log";
    private static final String BIG_OUTPUT = "src/main/resources/processed.log";
    private static final String EXAMPLE_FILE = "src/main/resources/example.txt";
    private static final String APPEND_FILE = "src/main/resources/append.txt";

    public static void main(String[] args) {
        System.out.println("===== 开始文件操作演示 =====");

        try {
            copySmallFile();
            processBigFile();
            writeWithBufferedWriter();
            appendToFile();
        } catch (IOException e) {
            System.err.println("文件操作失败: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("===== 文件操作完成 =====");
    }

    /**
     * 小文件：一次性读写
     */
    private static void copySmallFile() throws IOException {
        System.out.println(">>> 小文件复制");

        String content = Files.readString(
                Path.of(SMALL_INPUT),
                StandardCharsets.UTF_8
        );

        Files.writeString(
                Path.of(SMALL_OUTPUT),
                content,
                StandardCharsets.UTF_8
        );

        System.out.println("小文件复制完成");
    }

    /**
     * 大文件：逐行读取 + BufferedWriter 写入
     */
    private static void processBigFile() throws IOException {
        System.out.println(">>> 大文件逐行处理");

        try (BufferedReader reader = Files.newBufferedReader(
                Path.of(BIG_INPUT), StandardCharsets.UTF_8);
             BufferedWriter writer = Files.newBufferedWriter(
                     Path.of(BIG_OUTPUT), StandardCharsets.UTF_8)) {

            String line;
            long lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                String processedLine = lineCount + ": " + line;
                writer.write(processedLine);
                writer.newLine();
            }

            System.out.println("大文件处理完成，共处理 " + lineCount + " 行");
        }
    }

    /**
     * 使用 BufferedWriter 写入新文件
     */
    private static void writeWithBufferedWriter() throws IOException {
        System.out.println(">>> 写入新文件");

        try (BufferedWriter writer = Files.newBufferedWriter(
                Path.of(EXAMPLE_FILE), StandardCharsets.UTF_8)) {

            writer.write("第一行内容");
            writer.newLine();
            writer.write("第二行内容");
            writer.newLine();
            writer.write("第三行内容");
        }

        System.out.println("新文件写入完成");
    }

    /**
     * 使用 BufferedWriter 追加写入
     */
    private static void appendToFile() throws IOException {
        System.out.println(">>> 追加写入文件");

        try (BufferedWriter writer = Files.newBufferedWriter(
                Path.of(APPEND_FILE),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {

            writer.write("这是追加的一行");
            writer.newLine();
        }

        System.out.println("追加写入完成");
    }
}