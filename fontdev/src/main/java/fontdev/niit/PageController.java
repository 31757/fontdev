package fontdev.niit;
 
	import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
	 
	@Controller
	
	public class PageController {
		@RequestMapping(value={"/home", "/index","/"})
		public ModelAndView gotoindex()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("index");
	 return mvc;
		}
		
		@RequestMapping(value={"/about"})
		public ModelAndView gotoabout()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("about");
	 return mvc;
		}
		
		@RequestMapping(value={"/sign"})
		public ModelAndView gotosign()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("sign");
	 return mvc;
		}
		
	 @RequestMapping(value={"/log"})
		public ModelAndView gotolog()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("log");
	 return mvc;
	 
	      }
		
		@RequestMapping(value={"/contact"})
		public ModelAndView gotocontact()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("contact");
	 return mvc;
		
	      }
		
		@RequestMapping(value={"/product"})
		public ModelAndView gotoproduct()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("product");
	 return mvc;
		
	      }
		
		@RequestMapping(value={"/viewall"})
		public ModelAndView gotoviewall()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("viewall");
	 return mvc;
		
	      }
		
		@RequestMapping(value={"/adminlogin"})
		public ModelAndView gotoadminlogin()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("adminlogin");
	 return mvc;
		} 
		
		@RequestMapping(value={"/admin"})
		public ModelAndView gotoadmin()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("admin");
	 return mvc;
		} 
		
		@RequestMapping(value={"/prodform"})
		public ModelAndView gotoprodform()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("prodform");
	 return mvc;
		} 
		@RequestMapping(value={"/viewform"})
		public ModelAndView gotoviewform()
		{
	 ModelAndView mvc=new ModelAndView();
	 mvc.setViewName("viewform");
	 return mvc;
		} 
		
	      }
			
		
		
		
		
		

