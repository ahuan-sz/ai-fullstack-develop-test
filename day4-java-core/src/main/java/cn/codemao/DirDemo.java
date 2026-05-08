package cn.codemao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class DirDemo {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src/main/resources/input.txt");
        Path targetDir = Paths.get("src/main/resources/backup");
        Path target = targetDir.resolve("input.txt");

        // 先创建目标目录（如果不存在）
        Files.createDirectories(targetDir);

        // 复制文件到 backup 目录
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("文件复制完成: " + target);

        // 创建子目录
        Files.createDirectories(Paths.get("src/main/resources/subdir"));
        System.out.println("子目录创建完成: src/main/resources/subdir");

        // 遍历当前目录
        System.out.println("=== 目录遍历 ===");
        try (Stream<Path> stream = Files.walk(Paths.get("."))) {
            stream.filter(Files::isRegularFile)
                    .forEach(System.out::println);
        }
    }
}
