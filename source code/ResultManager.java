package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class ResultManager {
    private final List<Result> results = new ArrayList<>();

    public void addResult(Result result) {
        if (result.getMarks() < 0 || result.getMarks() > 100)
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        results.add(result);
    }

    public List<Result> getResultsForStudent(String studentId) {
        List<Result> output = new ArrayList<>();
        for (Result r : results)
            if (r.getStudentId().equalsIgnoreCase(studentId)) output.add(r);
        return output;
    }

    public double calculateAverage(String studentId) {
        List<Result> list = getResultsForStudent(studentId);
        if (list.isEmpty()) return 0;
        double total = 0;
        for (Result r : list) total += r.getMarks();
        return total / list.size();
    }

    public List<Result> getResults() { return results; }
}
