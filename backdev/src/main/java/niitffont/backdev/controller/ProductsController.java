package niitffont.backdev.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import niitffont.backdev.model.Products;
import niitffont.backdev.service.ProductsService;

@Controller 
public class ProductsController {
	
	@Autowired
	private ProductsService ProductsService;

	@RequestMapping("/index")
	private String setupForm(Map<String,Object> map){
		Products product=new Products();
		map.put("product",product);
		map.put("productsList", ProductsService.getAllproducts());
		return "product";
		
	}
	@RequestMapping(value="/products.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Products products, BindingResult result, @RequestParam String action,Map<String,Object> map){
Products product=new Products();
/*
switch(action.toLowerCase()){
case "add":
	ProductsService.add(product);
	products=product;
	break;
case "edit":
	ProductsService.edit(product);
	products=product;
	break;
case "delete":
	ProductsService.delete(products.getProductid());
	products=new Products();
	break;
case "search":
	Products searchedProducts=ProductsService.getProducts(product.getProductid());
	products=searchedProducts!=null ? searchedProducts:new Products();
	break;
}
*/
ProductsService.add(product);
products=product;

map.put("products", product);
map.put("productslist",ProductsService.getAllproducts());
		return "products";		
}
}
