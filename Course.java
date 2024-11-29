package StudentData;

public class Course {
    private String courseId;
    private String courseName;
    private double creditHours;
    private String instructorName;

    public Course(String courseId, String courseName, double creditHours, String instructorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructorName = instructorName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public String getInstructorName() {
        return instructorName;
    }
}

