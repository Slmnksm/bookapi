package tr.kasim.bookapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tr.kasim.bookapi.model.User;
import tr.kasim.bookapi.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	 	@GetMapping("/login")
	    public ModelAndView showLoginForm() {
	        return new ModelAndView("login.jsp", "userLoginModel", new User());
	    }
	 
	    @PostMapping("/loginUserPage")
	    public String loginSubmit(@Valid @ModelAttribute("userLoginModel")User user, BindingResult result, ModelMap model) {
	        
	    	if (result.hasErrors()) {
	            return "loginError.jsp";
	        }
	    	
	    	String userName = user.getUserName();
	    	String password = user.getPassword();
	    	
	        model.addAttribute("userName", userName);
	        model.addAttribute("password", password);
	        
	        String loginAction= userService.login(userName , password);
	        
	        if(loginAction.equals("Login Successful")) {
	        	return "loginSuccessfulUserView.jsp";
	        } else if(loginAction.equals("Login Failed!")) {
	        	return "loginError.jsp";
	        }
	        
	        return "loginError.jsp";
	    }
	    
	    @GetMapping("/register")
	    public ModelAndView showRegisterForm() {
	    	return new ModelAndView("register.jsp", "userRegisterModel", new User());
	    }
	    
	    @PostMapping("/registerUserPage")
	    public String registerSubmit(@Valid @ModelAttribute("userLoginModel")User user, BindingResult result, ModelMap model) {
	        
	    	if (result.hasErrors()) {
	            return "registerError.jsp";
	        }
	    	Long registeredUserId = userService.registerUser(user);
	    	User registeredUser = userService.getUser(registeredUserId);
	    	
	    	model.addAttribute("id", registeredUser.getId());
	        model.addAttribute("userName", registeredUser.getUserName());
	        model.addAttribute("password", registeredUser.getPassword());
	        model.addAttribute("eMail", registeredUser.geteMail());
	        model.addAttribute("creationDate", registeredUser.getCreationDate());
	        model.addAttribute("modificationDate", registeredUser.getModificationDate());
	        
	        return "registerSuccessfulUserView.jsp";
	    }
	    
	    @GetMapping("/userList")
	    public ModelAndView showUserList() {
	    	
	    	ModelAndView mav = new ModelAndView();
	    	List<User> userList = userService.listUser();
	    	mav.addObject("list",userList);
	    	mav.setViewName("userListView.jsp");
			return mav;
	    }
	    
	    
	    @GetMapping("/userSearch")
	    public ModelAndView showSearchForm() {
	        return new ModelAndView("userSearch.jsp", "userSearchModel", new User());
	    }

	    @PostMapping("/searchUserPage")
	    public String searchSubmit(@Valid @ModelAttribute("userSearchModel")User user, BindingResult result, ModelMap model) {
	        
	    	if (result.hasErrors()) {
	            return "searchError.jsp";
	        }
	    	
	    	User singleUser = userService.getUser(user.getId());
	    	
	    	if(singleUser==null) {
	    		return "searchError.jsp";
	    	}
	    	
	    	model.addAttribute("id", singleUser.getId());
	        model.addAttribute("userName", singleUser.getUserName());
	        model.addAttribute("password", singleUser.getPassword());
	        model.addAttribute("eMail", singleUser.geteMail());
	        model.addAttribute("creationDate", singleUser.getCreationDate());
	        model.addAttribute("modificationDate", singleUser.getModificationDate());
	        
	        return "userSingleView.jsp";
	    }
	    
	    
	    
//	    @GetMapping("/{id}")
//	    public ModelAndView showSingleUser(@PathVariable("id") Long id) {
//	    	
//	    	ModelAndView mav = new ModelAndView();
//	    	User singleUser = userService.getUser(id);
//	    	mav.addObject("singleUser", singleUser);
//	    	mav.setViewName("userSingleView.jsp");
//	    	return mav;
//	    }
	
	
	
	
	
	
}
