package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String acceptController() {
		return "main-menu";
	}
		@RequestMapping("/home")
		public String acceptController1() {
			
			return "home";
		}
		@RequestMapping("/show")
		public String acceptController2( @RequestParam("username") String s, @RequestParam("password") String p, Model m) {
	/*		String s= req.getParameter("username");
			String p= req.getParameter("password");  
	*/		m.addAttribute("username", s.toUpperCase());
			m.addAttribute("password", p.toUpperCase());
			return "show";
	}
}
