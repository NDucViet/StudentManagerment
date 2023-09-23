package StudentManagerment.controller;

import java.util.ArrayList;
import java.util.Scanner;

import StudentManagerment.model.Student;

public class StudentController {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Student> getAll() {

        return studentList;
    }

    public ArrayList<Student> getByName(String name) {
        ArrayList<Student> searchList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                searchList.add(student);
            }
        }
        return searchList;
    }

    public boolean addNew(Student student) {
        student.setId((studentList.size()));
        studentList.add(student);
        return true;
    }

    public boolean delete(String name) {
        ArrayList<Student> getDelete = getByName(name);
        System.out.println(getDelete.toString());
        System.out.println("Enter id student you want to delete");
        int n = Integer.parseInt(sc.nextLine());
        for (Student student1 : studentList) {
            if(student1.getId() == n){
                studentList.remove(student1);
                return true;
            }
        }
        return false;
    }

    public boolean update(Student student) {
        ArrayList<Student> getUpdate = getByName(student.getName());
        System.out.println(getUpdate.toString());
        System.out.println("Enter id student you want to update");
        int n = Integer.parseInt(sc.nextLine());
        student.setId(n);
        for (Student student1 : studentList) {
            if(student1.getId() == n){
                student1 = student;
                return true;
            }
        }
        return false;
    }
}
