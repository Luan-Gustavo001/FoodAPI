package br.com.luan.food.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteCOntroller {
	
	@GetMapping("/ola")
	@ResponseBody
	public String olaMundao() {
		
		return "Hello Luan";
	}
	
}
