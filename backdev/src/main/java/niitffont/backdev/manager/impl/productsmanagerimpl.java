package niitffont.backdev.manager.impl;
import niitffont.backdev.dto.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import niitffont.backdev.dao.productsdao;
import niitffont.backdev.dto.productsdto;
import niitffont.backdev.model.products;

@Service ("productsmanager")
	public class productsmanagerimpl implements productsdao {

		@Autowired
		productsdao dao;
		public productsdto createNewEmployee()
		{
			return dao.createNewproduct();
			}
		public void add(products products) {
			// TODO Auto-generated method stub
			
		}
		public void edit(products products) {
			// TODO Auto-generated method stub
			
		}
		public void delete(products products) {
			// TODO Auto-generated method stub
			
		}
		public products getproducts(String mobilemodel) {
			// TODO Auto-generated method stub
			return null;
		}
		public List getAllproducts() {
			// TODO Auto-generated method stub
			return null;
		}
		public productsdto createNewproduct() {
			// TODO Auto-generated method stub
			return null;
		}

}
