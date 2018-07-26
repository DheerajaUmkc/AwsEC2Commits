package com.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/newProject")
public class EmployeeController {

	/*
	 * @RequestMapping("/") public String acceptController() { return "main-menu"; }
	 */

	@RequestMapping("/showForm")
	public String processForm(Model m) {
		Employee employee = new Employee();
		m.addAttribute("emp", employee);
		return "employee";
	}

	@RequestMapping("/processForm")

	public String processing(@Valid @ModelAttribute("emp") Employee employee, BindingResult bR) {  /*@valid should
																									 always be binded
																									 with
																									bindingResults*/

		if (bR.hasErrors())
			return "employee";
		else
			return "displayemployee";
	}

@RequestMapping("/myPage")
	public String displayMyPage(@ModelAttribute("emp") Employee employee) {

		return "displaypage";
	}

	
	/* * @RequestMapping("/myPage1") public String processing1(@ModelAttribute("emp1")
	 * Employee employee) { return "displayemployee1";
	 * 
	 * }
	 */
}
