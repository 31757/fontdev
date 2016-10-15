package fontdev.niit;
 
	import org.springframework.stereotype.Controller;

	import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
	 
	@Controller
	
	public class hellojavacontroller {
		@RequestMapping(value={"/home", "/index","/"})
		public ModelAndView gotoindex()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("index");
	 return mvc;
		}
		
		@RequestMapping(value={"/signin"})
		public ModelAndView gotosignin()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("signin");
	 return mvc;
		
	      }
	}		
		
		
		
		
		

