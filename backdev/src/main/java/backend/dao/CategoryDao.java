package backend.dao;

import java.util.List;




public interface CategoryDao {
	
	
	 public void insertCategory(CategoryDao Category);

	 public List<CategoryDao> getAll();
	 
	 public void updateCategory(int id);
	 
	 public void deleteCategory(int id);

	public CategoryDao getById(int id);
	 
}
