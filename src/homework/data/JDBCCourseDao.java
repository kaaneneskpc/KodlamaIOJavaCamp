package homework.data;

import homework.entities.Course;

public class JDBCCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Course Added");
    }
}
