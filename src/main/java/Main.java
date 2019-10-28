import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Joe Messare");
        student.setDepartment("ITWS");
        student.setAge(21);
        student.setAddress("123 Fake Ave");
        student.setPhone("(555) 555-555");

        ArrayList<Course> courses = new ArrayList<Course>();

        courses.add(new Course( "Software Development", 1,  "ITWS"));
        student.setCourses(courses);
        student.printStudentInfo();
    }
}
