package StudentManagerment.model;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String semester;
    private ArrayList<String> courseName;
    public Student( String name, String semester, ArrayList<String> courseName) {
        
        this.name = name;
        this.semester = semester;
        this.courseName = courseName;
    }
    public Student() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public ArrayList<String> getCourseName() {
        return courseName;
    }
    public void setCourseName(ArrayList<String> courseName) {
        this.courseName = courseName;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", semester=" + semester + ", courseName=" + courseName + "]";
    }
    
}
