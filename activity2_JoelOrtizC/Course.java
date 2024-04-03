package activity2_JoelOrtiz;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> students;

    public Course() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int countStudents() {
        return students.size();
    }
}


