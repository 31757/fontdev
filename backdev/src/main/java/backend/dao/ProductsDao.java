package backend.dao;

import java.util.List;

import backend.model.Product;


public interface ProductsDao {
	
	
	 public void insertProduct(Product Product);

	 public List<Product> listProducts();
	 
	 public void updateProduct(int id);
	 
	 public void deleteProduct(int id);

	public Product getById(int id);
	 
}
