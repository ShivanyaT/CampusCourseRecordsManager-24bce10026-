package edu.ccrm.util;

import java.io.File;

public class RecursionUtils {
    public static long getFolderSize(File folder) {
        long length = 0;
        for (File file : folder.listFiles()) {
            if (file.isFile()) length += file.length();
            else length += getFolderSize(file);
        }
        return length;
    }
}

