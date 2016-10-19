package niitffont.backdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import backend.dao.RegistrationDao;
import backend.model.RegistrationModel;

public class ProductsTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
		ctxt.scan("backend.dao");
		ctxt.refresh();

		RegistrationDao cDao = ctxt.getBean(RegistrationDao.class);

		RegistrationModel c = new RegistrationModel();
		c.setUname("Vanu");
		c.setEmail("sonofvanu@gmail.com");
		c.setPwd("vanu");
		c.setAddress("Coimbatore");
		cDao.insert(c);
		ctxt.close();

	}

}
