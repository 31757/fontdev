package niitffont.backdev.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import niitffont.backdev.model.products;
import niitffont.backdev.dao.productsdao;
import niitffont.backdev.dto.productsdto;



public class productsdaoimpl implements productsdao {

	
	public void  createNewproducts()
	{
		products p=new products();
		p.setMobilemodel("samsung galaxy s7");
		p.setOsversion("4.7.6");
		p.setPrice("21756");
		
		
		
	}

	public void add(products products) {
		// TODO Auto-generated method stub
		products p=new products();
		p.setMobilemodel("");
		p.setOsversion("");
		p.setPrice("");
		
		
	}

	public void edit(products products) {
		// TODO Auto-generated method stub
		products p=new products();
		p.setMobilemodel("");
		p.setOsversion("");
		p.setPrice("");
	}

	public void delete(String mobilemodel) {
		// TODO Auto-generated method stub
		products p=new products();
		p.setMobilemodel("");
		p.setOsversion("");
		p.setPrice("");
	}

	public products getproducts(String mobilemodel) {
		// TODO Auto-generated method stub
		products p=new products();
		p.setMobilemodel("");
		p.setOsversion("");
		p.setPrice("");
		return null;
	}

	public List getAllproducts() {
		// TODO Auto-generated method stub
		products p=new products();
		p.setMobilemodel("");
		p.setOsversion("");
		p.setPrice("");
		return null;
	}

	public void delete(products products) {
		// TODO Auto-generated method stub
		products p=new products();
		p.setMobilemodel("");
		p.setOsversion("");
		p.setPrice("");
			
	}

	public productsdto createNewproduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
