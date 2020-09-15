package com.hkm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hkm.model.User;

@Controller
public class ControllerClass {
	
	@RequestMapping("/signin")
	public String first(@RequestParam("uname") String name, @RequestParam("upass") String pass,Model model) {
		// in real word project we'll fetch from database
		System.out.println(name+":"+pass);
		if(name.equals("admin@gmail.com") && pass.equals("pass")) {
		model.addAttribute("user",name);
		model.addAttribute("pass",pass);
		return "login";
		}
		
		else {
			model.addAttribute("msg","wrong username or password");
			return "index";
		}
	}
	
	@RequestMapping("/register")
	public String second() {
		return "register";
	}
	
	@RequestMapping("/registerSuccess")
	public String third(@ModelAttribute User user) {
		return "registerSuccess";
	}
	
}
