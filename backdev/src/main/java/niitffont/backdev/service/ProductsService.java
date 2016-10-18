package niitffont.backdev.service;

import java.util.List;

import niitffont.backdev.model.Products;

public interface ProductsService {
	public void add(Products product);
	public void edit(Products product);
	public void delete(Products product);
	public Products getProducts(int productid);
	@SuppressWarnings("rawtypes")
	public List getAllproducts();
	public void delete(int productid);

}
