package springmvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/home")
	public String home() {
		return "home";
		}
	@RequestMapping("/welcome")
	public String handerHome(@RequestParam("user") String name,Model m) {
		System.out.println(name);
		m.addAttribute("user",name);
		return "welcome";
		
	}
}
