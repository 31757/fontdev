package niitffont.backdev.dto;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import niitffont.backdev.dao.productsdao;
import niitffont.backdev.dao.impl.productsdaoimpl;
import niitffont.backdev.manager.productsmanager;
import niitffont.backdev.model.products;

@Controller("productscontroller")
public class productscontroller {

	@Autowired
	productsmanager manager;
	public productsdto createNewproduct()
	{
	return manager.createNewproduct();
	}
	
	
	public class productscontroller extends HttpServlet {
	private productsdao dao;
	private static final long serialVersionUID = 1L;
	public static final String lIST_STUDENT = "/listStudent.jsp";
	public static final String INSERT_OR_EDIT = "/student.jsp";
	public StudentController() {
	dao = new productsdaoimpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
	String forward = "";
	String action = request.getParameter( "action" );
	Object mobilemodel;
	if( action.equalsIgnoreCase( "delete" ) ) {
	forward = lIST_STUDENT;
	int studentId = Integer.parseInt( request.getParameter("studentId"));
			dao.deleteproducts(mobilemodel);
			request.setAttribute("students", dao.getAllproducts() );
			}
			else if( action.equalsIgnoreCase( "edit" ) ) {
			forward = INSERT_OR_EDIT;
			int studentId = Integer.parseInt( request.getParameter("studentId"));
			products products = dao.getproductsBymobilemodel(mobilemodel);
			request.setAttribute("products", products);
			}
			else if( action.equalsIgnoreCase( "insert" ) ) {
			forward = INSERT_OR_EDIT;
			}
			else {
			forward = lIST_STUDENT;
			request.setAttribute("students", dao.getAllproducts() );
			}
			RequestDispatcher view = request.getRequestDispatcher( forward );
			view.forward(request, response);
			}
			protected void doPost(HttpServletRequest request, HttpServletResponse response)
			products products= new products();
			products.setMobilemodel( request.getParameter( "mobilemodel" ) );
			products.setOsversion( request.getParameter( "osversion" ) );
			products.setPrice( request.getParameter( "price" ) );
			String mobilemodel = request.getParameter("mobilemodel");
			if( mobilemodel == null || mobilemodel.isEmpty() )
			dao.getproducts(products);
			else {
			products.setMobilemodel( Integer.parseInt(mobilemodel) );
			dao.updateStudent(products);
			}
			RequestDispatcher view = request.getRequestDispatcher( list_products );
			request.setAttribute("products", dao.getAllproducts());
			view.forward(request, response);
			}
			}
		
}
