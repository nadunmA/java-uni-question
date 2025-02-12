import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> studentList;

    public StudentManager(){

        studentList = new ArrayList<>();

    }

    public void addStudent(Student student){

        studentList.add(student);

    }

    public void searchStudent(int studentId){

        for(Student student : studentList){
            if(student.getStudentId() == studentId){
                student.displayStudentDetails();
                return;
            }
        }
        System.out.println("not found "+studentId);

    }

    public void updateStudentGPA(int studentId, double newGPA){

        for(Student student : studentList){
            if(student.getStudentId() == studentId){
                student.updateGPA(newGPA);
                return;
            }
        }
        System.out.println("GPA update success "+studentId);

    }

    public void displayAllStudent(){

        for(Student student : studentList){
            student.displayStudentDetails();
        }

    }


}
