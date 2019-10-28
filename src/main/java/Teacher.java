import java.util.ArrayList;

public class Teacher extends Person{
    private ArrayList<Course> classes;

    public Teacher(Integer id, String name) {
        super(id, name);
    }

    public ArrayList<Course> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Course> classes) {
        this.classes = classes;
    }
}
