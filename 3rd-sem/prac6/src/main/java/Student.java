public class Student implements Comparable<Student> {

    protected final String name;
    protected final Integer iD;
    protected final Integer points;

    public Student(String name, int iD, int points) {
        this.name = name;
        this.iD = iD;
        this.points = points;
    }

    @Override
    public int compareTo(Student o) {
        return this.iD.compareTo(o.iD);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ". ID: " + this.iD + ". Points: " + this.points + ".";
    }
}