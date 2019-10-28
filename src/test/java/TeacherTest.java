import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeacherTest {

    private Teacher teacher;

    public TeacherTest()
    {
        this.teacher = new Teacher(1, "Liu");
        Course software_development = new Course("Software Development", 1, "Computer Science");
        ArrayList<Course> classes = new ArrayList<>();
        classes.add(software_development);
        this.teacher.setClasses(classes);
    }

    @Test
    public void getClasses() {
    }

    @Test
    public void setClasses() {
    }
}