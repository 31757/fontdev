package backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service("CategorysDao")
@Transactional 
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private CategoryDao Categorydao;

	public void insertCategory(CategoryDao Category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(Category);
		
	}

	public List<CategoryDao> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Category").list();
	}

	public void updateCategory(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(id);
	}

	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
		
	}

	

	public CategoryDao getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(CategoryDao.class,id);
	}

}
