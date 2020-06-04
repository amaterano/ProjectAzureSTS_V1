package net.amaterano.holamundo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String inicio() {
		/*
		 * 
		 */
		return "Hola Mundo";
	}
}
