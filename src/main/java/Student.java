import java.util.ArrayList;

public class Student extends Person{

    private String department;
    private ArrayList<Course> courses;

    public Student(Integer id, String name)
    {
        super(id, name);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printStudentInfo()
    {
        System.out.println("Student Information");
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
