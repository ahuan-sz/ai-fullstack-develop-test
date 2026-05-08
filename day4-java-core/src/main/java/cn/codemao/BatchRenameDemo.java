package cn.codemao;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class BatchRenameDemo {
    public static void main(String[ ] args) throws IOException {
        Path dir = Paths.get("src/main/resources/rename");  // 演练目录
        if (!Files.isDirectory(dir)) {
            System.err.println("请创建目录: " + dir.toAbsolutePath());
            return;
        }

        // 演练：列出所有 .txt 文件并显示重命名操作
        try (Stream<Path> stream = Files.list(dir)) {
            var renameTasks = stream
                    .filter(p -> p.toString().endsWith(".txt"))
                    .map(p -> {
                        String newName = "backup_" + p.getFileName().toString();
                        Path target = p.resolveSibling(newName);
                        return new Object() {
                            Path src = p;
                            Path dst = target;
                        };
                    })
                    .toList();

            // 打印将要执行的操作
            System.out.println("演练模式 - 以下文件将被重命名:");
            for (var task : renameTasks) {
                System.out.println(task.src.getFileName() + "  ->  " + task.dst.getFileName());
            }

            System.out.print("确认执行? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String confirm = scanner.nextLine();
            if ("y".equalsIgnoreCase(confirm)) {
                for (var task : renameTasks) {
                    Files.move(task.src, task.dst, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("已重命名: backup_" + task.src.getFileName());
                }
            } else {
                System.out.println("已取消");
            }
            scanner.close();
        }
    }
}
