package com.kluca.springproject.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kluca.springproject.model.Calculator;

@Controller
@RequestMapping("/app")
public class CalculatorController {

	@RequestMapping("/showCalculator")
	public String showCaltulator(Model model) {

		model.addAttribute("calculator", new Calculator());
		
		return "calculator-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("calculator") Calculator theCalculator, 
			BindingResult theBindingResult, Model model) {

		System.out.println("The Binding result: " + theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "calculator-form";
		} else {
			
			// result can be counted independently
			int amount = theCalculator.getAmount();
			double interest = theCalculator.getInterest();
			int years = theCalculator.getYears();
			double result = Math.pow(1+interest, years)*amount;
			
			model.addAttribute("result", result);
			
			return "calculator-result";	
		}
				
	}
	
}
