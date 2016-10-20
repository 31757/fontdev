package niitffont.backdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import backend.dao.ProductsDao;
import backend.dao.ProductsDaoImpl;
import backend.model.ProductModel;

public class ProTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
		ctxt.scan("backend.dao");
		ctxt.refresh();

		ProductsDao cDao = ctxt.getBean(ProductsDaoImpl.class);

		ProductModel c = new ProductModel();
		c.getId();
	    c.setBrand("Samsung");
	    c.setModel("A7");
	    c.setOs("Android");
	    c.setVersion("4.7.4");
	    c.setPrice("25000");
	    cDao.insertProduct(c);
		ctxt.close();


	}

}
