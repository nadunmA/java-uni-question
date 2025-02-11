public abstract class Course {

    protected String course;
    protected String courseName;

    public Course() {

        this.course = "unknown";
        this.courseName = "unknown";
    }

    public Course(String course, String courseName) {

        this.course = course;
        this.courseName = courseName;
    }

    public abstract void displayCourseDetails();

}
