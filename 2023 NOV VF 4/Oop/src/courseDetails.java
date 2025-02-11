public class courseDetails extends Course {

    public courseDetails() {

        super();
    }

    public courseDetails(String course, String courseName) {

        super(course, courseName);
    }

    @Override
    public void displayCourseDetails() {

        System.out.println("Course Code : " + course);
        System.out.println("Course Name : " + courseName);
    }

}
