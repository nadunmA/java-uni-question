public class InstitutionManagementApp {

    public static void main(String[] args) throws Exception {

        Student student1 = new Student(1234, "Nadun");
        Student student2 = new Student(3457, "Tom");

        Teacher teacher1 = new Teacher(707, "Mr. Gamage");
        Teacher teacher2 = new Teacher(505, "Ms. Nimali");

        courseDetails course1 = new courseDetails("IT1020", "OOP");
        courseDetails course2 = new courseDetails("IT1040", "DMS");
        courseDetails course3 = new courseDetails("IT1060", "SE");

        System.out.println("Student Enrollement");
        student1.enrolleCourses(course1);
        student1.enrolleCourses(course2);
        student2.enrolleCourses(course3);

        System.out.println("Teacher Course Assignments");
        teacher1.teachCourse(course1);
        teacher1.teachCourse(course2);
        teacher2.teachCourse(course3);

        student1.displayDetails();
        student2.displayDetails();

        teacher1.displayDetails();
        teacher2.displayDetails();

    }
}
