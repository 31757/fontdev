package fontdev.niit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import backend.dao.ProductsDao;
import backend.model.ProductModel;
@Controller
@RequestMapping("admin")
public class AdminController {
	

@Autowired
	
	private ProductsDao p;
	@Bean
	@RequestMapping(value = {"a/admin"})
	public ModelAndView gotoadmin() {
		ModelAndView mv = new ModelAndView("admin");
		return mv;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String all(Model model) {
		model.addAttribute("product", new ProductModel());
		model.addAttribute("products", this.p.getAll());
		return "admin";
	}

	// For add and update product both
	@RequestMapping(value = "/admin/add", method = RequestMethod.POST)
	public String insert(@ModelAttribute("product") ProductModel p1) {

		if (p1.getId() == 0) {
			// new product, add it
			this.p.insertProduct(p1);
		} else {
			// existing product, call update
			this.p.updateProduct(p1);
		}

		return "redirect:/admin/all";
	}

	@RequestMapping("/del/{id}")
	public String del(@PathVariable("id") int id1) {

		this.p.deleteProduct(id1);
		return "redirect:/admin/all";
	}

	@RequestMapping("/edit/{id}")
	public String editPerson(@PathVariable("id") int id, Model model) {
		model.addAttribute("product", this.p.getById(id));
		model.addAttribute("products", this.p.getAll());
		return "product";
	}
}
