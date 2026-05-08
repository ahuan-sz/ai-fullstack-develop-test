package cn.codemao;

import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LogAnalyzer {
    public static void main(String[ ] args) throws IOException {
        Path logFile = Path.of("src/main/resources/app.log");
        Map<String, Integer> levelCount = new ConcurrentHashMap<>();
        levelCount.put("INFO", 0);
        levelCount.put("WARN", 0);
        levelCount.put("ERROR", 0);

        try (var reader = Files.newBufferedReader(logFile, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[INFO]")) {
                    levelCount.put("INFO", levelCount.get("INFO") + 1);
                } else if (line.startsWith("[WARN]")) {
                    levelCount.put("WARN", levelCount.get("WARN") + 1);
                } else if (line.startsWith("[ERROR]")) {
                    levelCount.put("ERROR", levelCount.get("ERROR") + 1);
                }
            }
        }

        System.out.println("统计结果: " + levelCount);
    }
}
