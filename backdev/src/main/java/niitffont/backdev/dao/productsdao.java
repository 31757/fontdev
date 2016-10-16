package niitffont.backdev.dao;

import java.util.List;

import niitffont.backdev.dto.productsdto;
import niitffont.backdev.model.products;

public interface productsdao {
	
	
	public void add(products products);
	public void edit(products products);
	public void delete(products products);
	public products getproducts(String products);
	public List getAllproducts();
	public productsdto createNewproduct();
}
