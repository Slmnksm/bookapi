package tr.kasim.bookapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView onSubmit() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.html");
		return mav;
	}
	
	
	@RequestMapping("/welcome")
	public ModelAndView onWelcomeClicked() {

		String welcomeStr= "This is Welcome Message to Book Api!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", welcomeStr);
		mav.setViewName("index.jsp");
		return mav;
	}
}
