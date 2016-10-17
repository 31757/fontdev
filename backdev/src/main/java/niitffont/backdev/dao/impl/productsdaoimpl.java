package niitffont.backdev.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import niitffont.backdev.dao.ProductsDao;
import niitffont.backdev.model.Products;

@Repository 
public class ProductsDaoImpl implements ProductsDao {

	@Autowired
	private SessionFactory session;
	
	
	public void add(Products product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(product);

	}

	
	public void edit(Products product) {
		// TODO Auto-generated method stub
session.getCurrentSession().update(product);
	}

	
	public void delete(int productid) {

session.getCurrentSession().delete(getProducts(productid));
	}

	
	public Products getProducts(int productid) {
		// TODO Auto-generated method stub
		return (Products) session.getCurrentSession().get(Products.class, productid);
	}

	
	public List getAllproducts() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Products").list();
	}


	public void insert(Products p) {
		// TODO Auto-generated method stub
		
	}


	

}
