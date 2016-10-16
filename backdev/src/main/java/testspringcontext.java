import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import niitffont.backdev.dto.productscontroller;

public class testspringcontext {
	public static void main(String[] args)
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//EmployeeManager manager = (EmployeeManager) context.getBean(EmployeeManager.class);
	//OR this will also work
	productscontroller controller = (productscontroller) context.getBean("employeeController");
	System.out.println();
	}

}
