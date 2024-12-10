public class Course {
    String name;
    double number;
    String teachername;
    double thecoursestarted;

    public Course() {
    }

    public Course(String name, double number, String teachername, double thecoursestarted) {
        this.name = name;
        this.number = number;
        this.teachername = teachername;
        this.thecoursestarted = thecoursestarted;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", teachername='" + teachername + '\'' +
                ", thecoursestarted=" + thecoursestarted +
                '}';
    }
}
