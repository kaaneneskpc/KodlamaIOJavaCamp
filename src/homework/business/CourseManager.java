package homework.business;

import core.logging.Logger;
import data.ProductDao;
import entities.Product;
import homework.data.CourseDao;
import homework.entities.Course;

public class CourseManager {

    private final CourseDao courseDao;
    private Logger[] loggerList;

    public CourseManager(CourseDao courseDao, Logger[] loggerList) {
        this.courseDao = courseDao;
        this.loggerList = loggerList;
    }

    public void add(Course course) {
        if(checkIfCourseNameExists(course)) System.out.println("This course is already exists");
        if (checkIfCoursePriceLessThanZero(course)) System.out.println("This course's price isn't lower than 0");

        courseDao.add(course);

        for (Logger logger : loggerList) {
            logger.log(course.getCourseName());
        }
    }
    private static boolean checkIfCoursePriceLessThanZero(Course course) {
        return course.getCourseUnitPrice() <= 0;
    }

    private static boolean checkIfCourseNameExists(Course course) {
        Course[] courses = {
                new Course(1, "Java + React", 10),
                new Course(2, "C#", 15),
                new Course(3, "Python",  20),
                new Course(4, "C++", 15),
        };

        for (Course crs : courses) {
            if (crs.getCourseName().equals(course.getCourseName())) {
                return true;
            }
        }

        return false;
    }


}
