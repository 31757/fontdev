package niitffont.backdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niitffont.backdev.dao.ProductsDao;
import niitffont.backdev.model.Products;

public class ProductsTest {

	public static void main(String []args)
	{
		 AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
				ctxt.scan("com.niit");
				ctxt.refresh();
				
				ProductsDao productsdao= ctxt.getBean(ProductsDao.class);
				
				
				Products p = new Products();
				p.setProductid(1022);
				p.setBrand("Samsung");
				p.setModel("Galaxy S7");
				p.setOs("Android");
				p.setVersion("4.7"); 
				p.setPrice(28799);
				
				
				
				productsdao.insert(p);
				
				p = new Products();
				p.setProductid(1023);
				p.setBrand("Lenovo");
				p.setModel("Vibe K5");
				p.setOs("Android");
				p.setVersion("4.6.1"); 
				p.setPrice(19807);
				
				productsdao.insert(p);
				
				ctxt.close();
				
			}

		

		
	
	
	}
	

