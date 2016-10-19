package fontdev.niit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import backend.dao.ProductsDao;
import backend.dao.ProductsDaoImpl;
import backend.model.ProductModel;


@Controller
public class ProductController {

	@Autowired
	ProductsDao proDao= new ProductsDaoImpl();
	@RequestMapping(value={"/v/get"})
	@ResponseBody List<ProductModel> view()
	{
		return  proDao.getAll();
	}

}
