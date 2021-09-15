package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import springMVC.dao.UserDaoImpl;
import springMVC.model.User;

@Controller

public class ContactController {
	
	@Autowired
	UserDaoImpl userdao;

	@RequestMapping("/contact")
	public String showform() {
		System.out.println("Creating form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {
//		String str=null;
//		System.out.println(str.length());
		System.out.println(user);
		
		if (user.getUname().isEmpty()) {
			
			
			return "redirect:/contact";

		}
		int m=userdao.update(user);
		System.out.println("database entered :" + 1);

		return "success";

	}

	@RequestMapping("/book/{id}/{username}")
	public String handler(@PathVariable("id") int id, @PathVariable("username") String name) {
		
		System.out.println(id);
		System.out.println(name);
		return "contact";
	}
	
	@ExceptionHandler({Exception.class})
	public String exceptionHandler()
	{   System.out.println("Exception occured");
		return "redirect:/contact";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * RedirectView handleForm(@ModelAttribute User user) {
	 * System.out.println(user); RedirectView rv = new RedirectView(); if
	 * (user.getUname().isEmpty()) { rv.setUrl("contact"); return rv; } String url =
	 * "https://www.google.com/search?q=" + user.getUname(); rv.setUrl(url); return
	 * rv; }
	 */

	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Learn Coding with Manish");
		model.addAttribute("desc", "home for programmer");
		System.out.println("adding common data to model");

	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("uemail") String useremail,
	 * 
	 * @RequestParam(name = "uname", required = true) String
	 * username, @RequestParam("pwd") String password, Model model) {
	 * 
	 * // System.out.println("user email id :" + useremail); //
	 * System.out.println("user name is :"+ username ); //
	 * System.out.println("password is :" +password);
	 * 
	 * User user = new User(); user.setUemail(useremail); user.setUname(username);
	 * user.setPwd(password);
	 * 
	 * // model.addAttribute("username", username); // model.addAttribute("emailid",
	 * useremail);
	 * 
	 * model.addAttribute("user",user ); return "success"; }
	 */
}
