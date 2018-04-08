package com.kluca.springproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kluca.springproject.model.Person;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@RequestMapping("/show-form")
	public String showForm(Model model) {
		Person p = new Person();
		p.setLastName("Popokapepetl");
		model.addAttribute("person", p);		
		return "person-form";
	}
	
	@RequestMapping("/processForm1")
	//automatically populate object thePerson from parameters and save it to model as person parameter
	public String  processForm(@ModelAttribute("person") Person thePerson) {				
		System.out.println("Processing.");
		return "person-confirmation";		
	}

	public String  processForm2(HttpServletRequest request, Model model) {				
		System.out.println("Processing.");
				
		Person p = new Person();
		// read parameters from objects - variables must be populated manually
		p.setFirstName(request.getParameter("firstName"));
		p.setLastName(request.getParameter("lastName"));
		p.setAge(Integer.parseInt(request.getParameter("age")));
		
		model.addAttribute("person", p);		
		
		return "person-confirmation";
	}
}
