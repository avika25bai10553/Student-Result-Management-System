package studentmanagement;

import java.io.*;
import java.util.List;

public class FileManager {
    public static void saveResults(List<Result> results, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Result r : results)
                writer.println(r.getStudentId() + "," + r.getCourseCode() + "," + r.getMarks());
        }
    }

    public static void loadResults(ResultManager manager, String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) return;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 3)
                    manager.addResult(new Result(p[0], p[1], Double.parseDouble(p[2])));
            }
        }
    }
}
