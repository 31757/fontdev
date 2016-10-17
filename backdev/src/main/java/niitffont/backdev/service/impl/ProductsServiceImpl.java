package niitffont.backdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import niitffont.backdev.dao.ProductsDao;
import niitffont.backdev.model.Products;
import niitffont.backdev.service.ProductsService;
@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired 
	private ProductsDao productsdao;

	@Transactional
	public void add(Products product) {
		// TODO Auto-generated method stub
		productsdao.add(product);

	}

	@Transactional
	public void edit(Products product) {
		// TODO Auto-generated method stub
		productsdao.edit(product);

	}

	@Transactional
	public void delete(int productid) {
		// TODO Auto-generated method stub
productsdao.delete(productid);
	}

	@Transactional
	public Products getProducts(int productid) {
		// TODO Auto-generated method stub
		
		return productsdao.getProducts(productid);
	}

	@Transactional
	public List getAllproducts() {
		// TODO Auto-generated method stub
		return productsdao.getAllproducts();
	}

	public void delete(Products product) {
		// TODO Auto-generated method stub
		
	}

}
