package cn.codemao;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharStreamDemo {
    public static void main(String[] args) {
        Path textFile = Path.of("src/main/resources/data.txt");

        // 使用字符流：InputStreamReader + BufferedReader 显式指定编码
        try (InputStream is = new FileInputStream(textFile.toFile());
             InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 更简洁的方式（推荐）：Files.newBufferedReader 自动处理编码
        try (BufferedReader reader = Files.newBufferedReader(textFile, StandardCharsets.UTF_8)) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}