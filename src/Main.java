import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import data.HibernateProductDao;
import entities.Product;
import homework.business.CourseManager;
import homework.data.HibernateCourseDao;
import homework.entities.Course;

public class Main {
    public static void main(String[] args){

        Logger[] loggerList = {new DatabaseLogger(), new FileLogger()};

        Product iphone = new Product(1,"Iphone 13",10000);
        Product iphone2 = new Product(2,"Iphone Xr", 2);

        Course course1 = new Course(1, "Java + React", 10);
        Course course2 = new Course(2,"Android", 100);

        /* ProductManager productManager = new ProductManager(new HibernateProductDao(), loggerList);
        productManager.add(iphone); */

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggerList);
        courseManager.add(course1);
        courseManager.add(course2);

    }
}