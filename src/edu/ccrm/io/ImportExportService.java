package edu.ccrm.io;

import edu.ccrm.domain.Student;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ImportExportService {

    // export list of students to CSV (path like "data/exported_students.csv")
    public void exportStudents(List<Student> students, String filePath) {
        Path outPath = Paths.get(filePath);
        try {
            // ensure parent folder exists
            if (outPath.getParent() != null) {
                Files.createDirectories(outPath.getParent());
            }

            try (BufferedWriter bw = Files.newBufferedWriter(outPath)) {
                // header
                bw.write("id,regNo,fullName,email");
                bw.newLine();

                for (Student s : students) {
                    String line = String.join(",",
                            csvEscape(s.getId()),
                            csvEscape(s.getregNo()),
                            csvEscape(s.getFullName()),
                            csvEscape(s.getEmail()));
                    bw.write(line);
                    bw.newLine();
                }
            }

            System.out.println("✅ Exported students to: " + outPath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("❌ Error exporting students: " + e.getMessage());
        }
    }

    // very small escape: wrap fields containing comma or quote in double quotes and escape quotes
    private String csvEscape(String value) {
        if (value == null) return "";
        if (value.contains(",") || value.contains("\"") || value.contains("\n")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }

    // optional import demo (not needed for screenshot)
    public void importData(String filePath) {
        System.out.println("Importing (demo): " + filePath);
    }
}

