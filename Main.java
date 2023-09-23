package StudentManagerment;

import java.util.ArrayList;
import java.util.Scanner;

import StudentManagerment.controller.StudentController;
import StudentManagerment.model.Student;
import StudentManagerment.view.Menu;

public class Main extends Menu {
    Scanner sc = new Scanner(System.in);
    StudentController studentController = new StudentController();
    static String[] mc = { "Create", "Find", "Update/Delete", "Report", "Exit" };
    String[] courseList = { "Java", ".Net", "C/C++" };

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public Main() {
        super("Programing", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Enter Student name, Semester");
                String name = sc.nextLine();
                String semester = sc.nextLine();
                System.out.println("choose Course");
                for (int i = 0; i < courseList.length; i++) {
                    System.out.println(i + 1 + courseList[i]);
                }
                int choice = Integer.parseInt(sc.nextLine());
                ArrayList<String> courseName = new ArrayList<>();
                courseName.add(courseList[choice - 1]);
                System.out.println("Enter the next course, Enter 0 to skip");
                    int cN = Integer.parseInt(sc.nextLine());
                    if (cN != 0) {
                        courseName.add((courseList[cN - 1]));
                    }
                Student student = new Student(name, semester, courseName);
                studentController.addNew(student);
                break;
            case 2:
                System.out.println("Enter Name Student");
                String namesearch = sc.nextLine();
                ArrayList<Student> search = studentController.getByName(namesearch);
                System.out.println(search.toString());
                break;
            case 3:
                System.out.println("Enter your choice \n1.Update\n2.Delete\n");
                int choose = Integer.parseInt(sc.nextLine());
                if (choose == 1) {
                    System.out.println("Enter Student name, Semester");
                    String name1 = sc.nextLine();
                    String semester1 = sc.nextLine();
                    System.out.println("choose Course");
                    for (int i = 0; i < courseList.length; i++) {
                        System.out.println(i + 1 + courseList[i]);
                    }
                    int choice1 = Integer.parseInt(sc.nextLine());
                    ArrayList<String> courseName1 = new ArrayList<>();
                    courseName1.add((courseList[choice1 - 1]));
                    System.out.println("Enter the next course, Enter 0 to skip");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    if (choice2 != 0) {
                        courseName1.add((courseList[choice2 - 1]));
                    }
                    Student student1 = new Student(name1, semester1, courseName1);
                    System.out.println(studentController.update(student1));

                } else if (choose == 2) {
                    System.out.println("Enter name student");
                    String nameDelete = sc.nextLine();
                    System.out.println(studentController.delete(nameDelete));
                }
                break;
            case 4:
                System.out.println(studentController.getAll().toString());
                break;

            default:
                break;
        }
        // TODO Auto-generated method stub
        
    }

}
