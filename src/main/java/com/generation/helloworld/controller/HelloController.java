package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello () {
		return "Hello World!!!";
	}
	
	@GetMapping("/Habilidades")
	public String getBsm () {
		return "Persistência e mais persistência!";
	}
	
	@GetMapping("/Objetivos")
	public String getObj () {
		return "Fazer exercicios completos de POO e ser rainha do Spring!";
	}
}
