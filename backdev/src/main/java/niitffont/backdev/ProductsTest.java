package niitffont.backdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import backend.dao.ProductsDao;
import backend.model.Product;
public class ProductsTest {

	
	public static void main(String []args)
	{
			
					
					// TODO Auto-generated method stub
		
					AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
					ctxt.scan("backend.dao");
					ctxt.refresh();
					
					ProductsDao productsdao = ctxt.getBean(ProductsDao.class);
					
					
					Product p = new Product();
					p.setId(1);
					p.setBrand("iPhone");
					p.setModel("6s");
					p.setOs("ios");
					p.setVersion("latest");
					p.setPrice("45000");
					Product.add(p);
					p.insert(p);
					
					p = new Product();
					p.setId(2);
					p.setBrand("samsung");
					p.setModel("galaxy s7");
					p.setOs("android");
					p.setVersion("4.7.3");
					p.setPrice("12679");
					Product.add(p);
					p.insert(p);
					
					p = new Product();
					p.setId(3);
					p.setBrand("micromax");
					p.setModel("a111");
					p.setOs("android");
					p.setVersion("4.4.1");
					p.setPrice("8952");
					Product.add(p);
					p.insert(p);

					ctxt.close();
					
									}

			

				
			}

		

		
	
	
	
	

