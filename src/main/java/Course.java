public class Course {
    private String name;
    private String subject;
    private Integer id;
    private College university;
    
    public Course(String name, Integer id, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = id;
    }

    public Course(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getCourseName() {
        return name;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return name;
    }

    public void setClassName(String name) {
        this.name = name;
    }

    public College getUniversity() {
        return university;
    }

    public void setUniversity(College university) {
        this.university = university;
    }
}
