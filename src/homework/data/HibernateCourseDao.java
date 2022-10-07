package homework.data;

import data.ProductDao;
import entities.Product;
import homework.entities.Course;


public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course Added");
    }
}
