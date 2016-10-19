package backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import backend.model.ProductModel;



@Transactional
public class ProductsDaoImpl implements ProductsDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private ProductsDao productdao;

	public void insertProduct(ProductModel Product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(Product);
		
	}

	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM ProductModel").list();
	}

	public void updateProduct(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(id);
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
		
	}

	

	public ProductModel getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ProductModel.class,id);
	}

	public void updateProduct(ProductModel p1) {
		// TODO Auto-generated method stub
		
	}

}
