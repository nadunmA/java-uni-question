import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<Course> courseTaught;

    public Teacher() {

        super();
        this.courseTaught = new ArrayList<>();
    }

    public Teacher(int ID, String name) {

        super(ID, name);
        this.courseTaught = new ArrayList<>();
    }

    public void teachCourse(Course c) {
        courseTaught.add(c);
    }

    @Override
    public void displayDetails() {

        System.out.println("\nTeacher's Details");
        System.out.println("Teacher's ID : " + Id);
        System.out.println("Teacher's Name : " + name);

        System.out.println("\nList Teacher courseTaught");
        for (Course course : courseTaught) {
            course.displayCourseDetails();
        }

    }

}
