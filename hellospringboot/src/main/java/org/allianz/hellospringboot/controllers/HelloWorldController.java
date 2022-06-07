package org.allianz.hellospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/api/hello")
	public String hello(@RequestParam(defaultValue = "Mundo") String nombre) {
		return "Hola " + nombre;
	}
}
