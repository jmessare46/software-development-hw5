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
        System.out.println("Student Information:\n\n");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhone() + "\n");

        System.out.println("Student's Courses");
        ArrayList<Course> courses = getCourses();
        for(int i = 0; i < courses.size(); i++)
        {
            courses.get(i).printCourseInfo();
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
