public class Student {

    int studentId;
    String name;
    int age;
    String major;
    double GPA;

    public Student(){

        studentId = 0000;
        name = "unknown";
        age = 00;
        major = "unknown";
        GPA = 0.00;

    }

    public Student(int studentId, String name, int age, String major, double GPA){

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
        this.GPA = GPA;

    }

    public void updateGPA(double newGPA){

        this.GPA = newGPA;

    }

    public void displayStudentDetails(){

        System.out.println("Student Id : "+studentId);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Major : "+major);
        System.out.println("GPA : "+GPA);

        System.out.println();
        
    }

    public int getStudentId(){
        return studentId;
    }

}
