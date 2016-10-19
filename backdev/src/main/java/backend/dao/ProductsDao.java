package backend.dao;

import java.util.List;

import backend.model.ProductModel;


public interface ProductsDao {
	
	
	 public void insertProduct(ProductModel Product);

	 public List<ProductModel> getAll();
	 
	 public void updateProduct(ProductModel p1);
	 
	 public void deleteProduct(int id);

	public ProductModel getById(int id);
	 
}
