import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    public Student joe = new Student(1, "Joe");

    public StudentTest()
    {
        this.joe.setDepartment("Fake Dept");
    }

    @Test
    public void getDepartment() {
        assertEquals("Error: Department was not successfully retrieved", "Fake Dept", joe.getDepartment());
    }

    @Test
    public void setDepartment() {
        joe.setDepartment("Supervisor");
        assertEquals("Error: Department was not successfully set", "Supervisor", joe.getDepartment());
    }

    @Test
    public void printStudentInfo() {
    }
}