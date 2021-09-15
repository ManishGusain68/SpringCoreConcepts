package springMVC.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
//below are handler methods
	@RequestMapping(path="/home" , method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Manish Gusain");
		model.addAttribute("id", 123);

		List<String> friends = Arrays.asList("Vandana", "Roshni", "Sanjeeta");
		model.addAttribute("f", friends);

		return "index";

	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		// creating modelandview object
		ModelAndView modelAndView = new ModelAndView();
		// setting the view name
		modelAndView.addObject("name", "Manish");
		modelAndView.addObject("rollnumber", 68);

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		modelAndView.addObject("time", now);
		List<String> myfriends=Arrays.asList("Manish","sanjeeta","nishant","nitika","Pushan");
		modelAndView.addObject("myfriends", myfriends);
		
		// setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
