package edu.ccrm.io;

import java.time.LocalDateTime;

public class BackupService {
    public void backupData(String sourcePath, String backupPath) {
        String timestamp = LocalDateTime.now().toString().replace(":", "-");
        System.out.println("Backing up data to " + backupPath + "/backup_" + timestamp);
    }
}

