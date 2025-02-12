public class StudentManagementApp {
    public static void main(String[] args) throws Exception {
        
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(new Student(1111, "Nadun", 21, "Data Science", 3.4));
        studentManager.addStudent(new Student(2222, "Algoda", 21, "Artificail Intelligence", 3.2));
        studentManager.addStudent(new Student(3333, "Jhon", 26, "Software Engneering", 2.97));
        studentManager.addStudent(new Student(4444, "Tim", 23, "Computer Science", 2.84));
        studentManager.addStudent(new Student(5555, "Bob", 28, "Cyber Seacurity", 2.78));

        System.out.println("\nSearch student id 2222");
        studentManager.searchStudent(2222);

        System.out.println("\nUpdate GPA for student id 2222\n");
        studentManager.updateStudentGPA(2222, 3.67);

        System.out.println("Display all students\n");
        studentManager.displayAllStudent();

    }
}
