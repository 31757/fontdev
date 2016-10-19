package niitffont.backkdev.springmvc;

@Controller
public class JspController {
	@RequestMapping(value={"/index","/"})
	public ModelAndView welcomeMessage(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
	@RequestMapping(value={"/login"})
	public ModelAndView login(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		return view;
	}
	@RequestMapping(value={"/register"})
	public ModelAndView register(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("register");
		return view;
	}
	@RequestMapping(value={"/contact"})
	public ModelAndView contact(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("contact");
		return view;
	}
	@RequestMapping(value={"/products"})
	public ModelAndView products(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("products");
		return view;
	}
	@RequestMapping(value={"/single"})
	public ModelAndView single(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("single");
		return view;
	}
	@RequestMapping(value={"/aboutus"})
	public ModelAndView aboutus(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("aboutus");
		return view;
	}
	@RequestMapping(value={"/viewall"})
	public ModelAndView viewall(){
		
		ModelAndView view = new ModelAndView();
		view.setViewName("viewall");
		return view;
	}
	@RequestMapping(value={"/viewall/{pro}"})
    public ModelAndView products(@PathVariable("pro") String st)
	{
		
		ModelAndView view = new ModelAndView();
		view.setViewName("viewall");
		view.addObject("st", st);
		return view;
	}

}
