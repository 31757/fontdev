package niitffont.backdev.manager;
import niitffont.backdev.dto.*;

import java.util.List;

import niitffont.backdev.dto.productsdto;
import niitffont.backdev.model.products;

public interface productsmanager {

	public void add(products products);
	public void edit(products products);
	public void delete(products products);
	public products getproducts(String mobilemodel);
	public List getAllproducts();
	public productsdto createNewproduct();
}
	
