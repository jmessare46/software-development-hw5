import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    public Course course;

    public CourseTest()
    {
        course = new Course("Software Development", 1, "ITWS");
        College rpi = new College("RPI", "123 Fake Ave", 1);
        course.setUniversity(rpi);
    }

    @Test
    public void getCourseName() {
        assertEquals("Error: The accessor for a courses name is not working", "Software Development", course.getCourseName());
    }

    @Test
    public void setCourseName() {
        course.setCourseName("New Software Development");
        assertEquals("Error: The mutator for a courses name is not working", "New Software Development", course.getCourseName());
    }

    @Test
    public void getSubject() {
        assertEquals("Error: The accessor for a courses subject is not working", "ITWS", course.getSubject());
    }

    @Test
    public void setSubject() {
        course.setSubject("Computer Science");
        assertEquals("Error: The mutator for a courses subject is not working", "Computer Science", course.getSubject());
    }

    @Test
    public void getID() {
        assertEquals("Error: The accessor for a courses id is not working", 1, (int) course.getID());
    }

    @Test
    public void setID() {
        course.setID(2);
        assertEquals("Error: The mutator for a courses id is not working", 2, (int) course.getID());
    }

    @Test
    public void getUniversity() {
        assertEquals("Error: The accessor for a courses university is not working", "RPI", course.getUniversity().getName());
        assertEquals("Error: The accessor for a courses university is not working", 1, (int) course.getUniversity().getId());
        assertEquals("Error: The accessor for a courses university is not working", "123 Fake Ave", course.getUniversity().getAddress());
    }

    @Test
    public void setUniversity() {
        College union = new College("Union", "345 Fake Ave", 2);
        course.setUniversity(union);

        assertEquals("Error: The accessor for a courses university is not working", "Union", course.getUniversity().getName());
        assertEquals("Error: The accessor for a courses university is not working", 2, (int) course.getUniversity().getId());
        assertEquals("Error: The accessor for a courses university is not working", "345 Fake Ave", course.getUniversity().getAddress());
    }
}