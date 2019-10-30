import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeacherTest {

    private Teacher teacher;

    public TeacherTest()
    {
        this.teacher = new Teacher(1, "Liu");
        Course software_development = new Course("Software Development", 1, "Computer Science");
        ArrayList<Course> classes = new ArrayList<Course>();
        classes.add(software_development);
        this.teacher.setClasses(classes);
    }

    @Test
    public void getClasses() {
        assertEquals("Error: The get classes method is not working", "Software Development",  teacher.getClasses().get(0).getCourseName());
        assertEquals("Error: The get classes method is not working", 1, (int) teacher.getClasses().get(0).getID());
        assertEquals("Error: The get classes method is not working", "Computer Science", teacher.getClasses().get(0).getSubject());
    }

    @Test
    public void setClasses() {
        Course software_development = new Course("Capstone", 1, "Computer Science");
        ArrayList<Course> classes = new ArrayList<Course>();
        classes.add(software_development);
        this.teacher.setClasses(classes);

        assertEquals("Error: The get classes method is not working", "Capstone", classes.get(0).getCourseName());
        assertEquals("Error: The get classes method is not working", teacher.getClasses().get(0).getID(), classes.get(0).getID());
        assertEquals("Error: The get classes method is not working", teacher.getClasses().get(0).getSubject(), classes.get(0).getSubject());
    }
}