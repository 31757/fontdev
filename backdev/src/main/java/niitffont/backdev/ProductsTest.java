package niitffont.backdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import backend.dao.ProductDao;
import niitffont.backdev.model.Products;
public class ProductsTest {

	
	public static void main(String []args)
	{
			
		
				
					// TODO Auto-generated method stub
		
					AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
					ctxt.scan("backdev");
					ctxt.refresh();
					
					ProductDao productdao = ctxt.getBean(ProductDao.class);
					
					
					Products p = new Products();
					p.setName("Samsung");
					p.setPrice(12599);
					productdao.insert(p);
					
					p = new Products();
					p.setName("Nokia");
					p.setPrice(5999);
					productdao.insert(p);
					
					ctxt.close();
					
									}

			

				
			}

		

		
	
	
	
	

