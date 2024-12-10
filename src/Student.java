public class Student {
    String name;
    String surname;
    String birthday;
    int age;

    public Student() {
    }

    public Student(String name, String surname, String birthday, int age) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                '}';
    }
}
