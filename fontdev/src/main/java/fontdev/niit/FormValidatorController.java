package fontdev.niit;

import javax.servlet.Registration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FormValidatorController {
	
		@RequestMapping(value="/admin/insert", method=RequestMethod.POST)
	    public String submitForm(@Validated Registration sub, BindingResult result, Model m) {
	        if(result.hasErrors()) {
	            return "formPage";
	        }
	         
	        m.addAttribute("message", "Successfully saved User: " + sub.toString());
	        return "formPage";
	    }
}
