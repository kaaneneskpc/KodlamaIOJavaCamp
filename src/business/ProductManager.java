package business;

import core.logging.Logger;
import data.HibernateProductDao;
import data.ProductDao;
import entities.Product;

import java.util.List;

public class ProductManager {

    private final ProductDao productDao;
    private Logger[] loggerList;

    public ProductManager(ProductDao productDao, Logger[] loggerList) {
        this.productDao = productDao;
        this.loggerList = loggerList;
    }

    public void add(Product product) {
        if(product.getUnitPrice() < 10) System.out.println("Product unit price doesn't lower than 10");
        productDao.add(product);
        for (Logger logger : loggerList) {
            logger.log(product.getProductName());
        }
    }


}
