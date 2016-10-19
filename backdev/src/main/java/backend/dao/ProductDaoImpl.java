package backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import backend.model.Product;


@Service("ProductsDao")
@Transactional 
public class ProductDaoImpl implements ProductsDao {
	private SessionFactory sessionFactory;
	
	@Autowired
	private ProductsDao productdao;

	public void insertProduct(Product Product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(Product);
		
	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Product").list();
	}

	public void updateProduct(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(id);
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
		
	}

	

	public Product getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Product.class,id);
	}

}
