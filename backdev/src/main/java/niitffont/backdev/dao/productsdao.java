package niitffont.backdev.dao;

import java.util.List;

import niitffont.backdev.model.Products;

public interface ProductsDao {
	public void add(Products product);
	public void edit(Products product);
	public void delete(int productid);
	public Products getProducts(int productid);
	
	public List<Products> getAll();
	public void insert(Products p);

}


