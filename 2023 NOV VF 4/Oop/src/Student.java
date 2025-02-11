import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Course> enrolleCourses;

    public Student() {

        super();
        this.enrolleCourses = new ArrayList<>();
    }

    public Student(int ID, String name) {
        super(ID, name);
        this.enrolleCourses = new ArrayList<>();
    }

    public void enrolleCourses(Course c) {
        enrolleCourses.add(c);
    }

    @Override
    public void displayDetails() {

        System.out.println("\nStudent Details");
        System.out.println("Student ID : " + Id);
        System.out.println("Student Name : " + name);
        System.out.println("\nList of Enrolled Course");

        for (Course course : enrolleCourses) {
            course.displayCourseDetails();
        }

    }

}
