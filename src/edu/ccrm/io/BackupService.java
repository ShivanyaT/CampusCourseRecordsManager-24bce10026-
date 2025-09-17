package edu.ccrm.io;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BackupService {

    public void backupFile(String sourcePath, String backupRoot) {
        Path source = Paths.get(sourcePath);
        try {
            if (!Files.exists(source) || !Files.isRegularFile(source)) {
                System.out.println("❌ Source file not found: " + source.toAbsolutePath());
                return;
            }

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            Path backupFolder = Paths.get(backupRoot, "backup_" + timestamp);
            Files.createDirectories(backupFolder);

            Path target = backupFolder.resolve(source.getFileName());
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("✅ Backup created: " + target.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("❌ Backup failed: " + e.getMessage());
        }
    }
}

