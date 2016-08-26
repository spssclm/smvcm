package com.cloudcross.anon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

	@RequestMapping(value="index.do")
	public void index_jsp(Model model){
		model.addAttribute("name", "ioy");
		System.out.println("index.jsp");
	}
}
