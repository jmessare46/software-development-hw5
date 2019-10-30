import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Creating the student object...");
        Student student = new Student(1, "Joe Messare");
        student.setDepartment("ITWS");
        student.setAge(21);
        student.setAddress("123 Fake Ave");
        student.setPhone("(555) 555-555");

        logger.info("Adding courses to the student...");
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course( "Software Development", 1,  "ITWS"));
        student.setCourses(courses);

        logger.info("Printing student's information...");
        student.printStudentInfo();
    }
}
