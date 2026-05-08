package cn.codemao;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    public static void main(String[] args) {
        String path = "sample.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("文件不存在: " + e.getMessage());
            e.printStackTrace();  // 有意义日志
        } catch (UnsupportedEncodingException e) {
            System.err.println("编码错误（不应该发生，因为 UTF-8 总是可用）: " + e);
        } catch (IOException e) {
            System.err.println("IO 失败: " + e);
            e.printStackTrace();
        }
    }
}
