package homework.entities;

public class Course {
    private int courseId;
    private String courseName;
    private double courseUnitPrice;

    public Course() {
        super();
    }

    public Course(int courseId, String courseName, double courseUnitPrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseUnitPrice = courseUnitPrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseUnitPrice() {
        return courseUnitPrice;
    }

    public void setCourseUnitPrice(double courseUnitPrice) {
        this.courseUnitPrice = courseUnitPrice;
    }
}
