import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    public Person joe = new Person(1, "Joe");

    public PersonTest()
    {
        this.joe.setPhone("1231231234");
        this.joe.setAddress("123 Fake Ave");
        this.joe.setAge(21);
    }

    @Test
    public void getId() {
        assertEquals("Error: ID was not successfully retrieved", 1, (int) joe.getId());
    }

    @Test
    public void setId() {
        joe.setId(2);
        assertEquals("Error: ID was not successfully set", 2, (int) joe.getId());
    }

    @Test
    public void getName() {
        assertEquals("Error: Name was not successfully retrieved", "Joe", joe.getName());
    }

    @Test
    public void setName() {
        joe.setName("Joseph");
        assertEquals("Error: Name was not successfully set", "Joseph", joe.getName());
    }

    @Test
    public void getPhone() {
        assertEquals("Error: Phone number was not successfully retrieved", "1231231234", joe.getPhone());
    }

    @Test
    public void setPhone() {
        joe.setPhone("2342342345");
        assertEquals("Error: Phone number was not successfully set", "2342342345", joe.getPhone());
    }

    @Test
    public void getAddress() {
        assertEquals("Error: Address was not successfully retrieved", "123 Fake Ave", joe.getAddress());
    }

    @Test
    public void setAddress() {
        joe.setAddress("234 Fake Dr");
        assertEquals("Error: Address was not successfully set", "234 Fake Dr", joe.getAddress());
    }

    @Test
    public void getAge() {
        assertEquals("Error: Age was not successfully retrieved", 21, (int) joe.getAge());
    }

    @Test
    public void setAge() {
        joe.setAge(20);
        assertEquals("Error: Age was not successfully set", 20, (int) joe.getAge());
    }
}