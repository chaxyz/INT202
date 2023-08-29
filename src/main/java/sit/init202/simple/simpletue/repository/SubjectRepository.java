package sit.init202.simple.simpletue.repository;

import sit.init202.simple.simpletue.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private static List<Subject> subjects;
    public List<Subject> findAll() {
        return subjects;
    }
    public SubjectRepository() {
        initialize();
    }
    private void initialize() {
        subjects = new ArrayList<>(20);
        subjects.add(new Subject("INT 100", "IT Fundamentals", 3));
        subjects.add(new Subject("INT 207", "Network I",3));
    }
}
