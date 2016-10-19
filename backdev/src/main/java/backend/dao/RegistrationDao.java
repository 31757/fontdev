package backend.dao;

import java.util.List;

import javax.servlet.Registration;

import backend.model.RegistrationModel;




public interface RegistrationDao {
	
	
	public List<Registration> getAll();
	public void insert(RegistrationModel c);
	public void update(Registration p);
	public Registration getById(int id);
	public void delete(int id);
	 
}
