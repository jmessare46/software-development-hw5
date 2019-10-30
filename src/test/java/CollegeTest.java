import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollegeTest {

    public College college;

    public CollegeTest()
    {
        college = new College("RPI", "123 Fake Ave", 1);
    }

    @Test
    public void getName() {
        assertEquals("Error: The accessor for a college name is not working", "RPI", college.getName());
    }

    @Test
    public void setName() {
        college.setName("Union");
        assertEquals("Error: The mutator for a college name is not working", "Union", college.getName());
    }

    @Test
    public void getAddress() {
        assertEquals("Error: The accessor for a college address is not working", "123 Fake Ave", college.getAddress());
    }

    @Test
    public void setAddress() {
        college.setAddress("234 Fake Ave");
        assertEquals("Error: The mutator for a college address is not working", "234 Fake Ave", college.getAddress());
    }

    @Test
    public void getId() {
        assertEquals("Error: The accessor for a college id is not working", 1, (int) college.getId());
    }

    @Test
    public void setId() {
        college.setId(2);
        assertEquals("Error: The mutator for a college id is not working", 2, (int) college.getId());
    }
}