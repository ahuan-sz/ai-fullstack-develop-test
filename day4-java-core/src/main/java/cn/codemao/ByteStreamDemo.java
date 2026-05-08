package cn.codemao;

import java.io.*;
import java.nio.file.Path;

public class ByteStreamDemo {
    public static void main(String[] args) {
        Path source = Path.of("src/main/resources/original.jpg");
        Path target = Path.of("src/main/resources/copy.jpg");

        // 使用字节流：FileInputStream / FileOutputStream
        try (InputStream in = new FileInputStream(source.toFile());
             OutputStream out = new FileOutputStream(target.toFile())) {
            byte[] buffer = new byte[8192]; // 8KB缓冲区
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            System.out.println("图片复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}