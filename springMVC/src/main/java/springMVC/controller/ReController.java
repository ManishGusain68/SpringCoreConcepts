package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	/*@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/enjoy";
	}    */
	
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView rv=new RedirectView();
		//rv.setUrl("enjoy");
		rv.setUrl("https://www.google.com");
		return rv;
		
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is second handler (enjoy) ");
		return "contact";
	}
	
}
