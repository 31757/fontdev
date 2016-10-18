package backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import niitffont.backdev.model.Products;


public class ProductsDaoImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

		@SuppressWarnings("deprecation")
		
		public List<Products> getAll() {
	// TODO Auto-generated method stub
	return sessionFactory.getCurrentSession().createQuery("from Product").list();
}

public void insert(Products p) {
	// TODO Auto-generated method stub

}
}
