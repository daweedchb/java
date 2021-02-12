import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> listOfStudents;
    Student requiredStudent = null;

    public LabClass() {
        this.listOfStudents = new ArrayList<>();
    }

    public void add(Student student) {
        listOfStudents.add(student);
        listOfStudents.sort(Student::compareTo);
    }

    public Student find(String name) throws StudentNotFoundException {

        listOfStudents.forEach(student -> {
            if (student.getName().equals(name))
                requiredStudent = student;
        });
        if (requiredStudent == null) {
            throw new StudentNotFoundException("Студент " + name + " не найден!");
        }
        return requiredStudent;
    }

    public Student remove() {
        return listOfStudents.remove(0);
    }

    public boolean isEmpty() {
        return listOfStudents.isEmpty();
    }
}