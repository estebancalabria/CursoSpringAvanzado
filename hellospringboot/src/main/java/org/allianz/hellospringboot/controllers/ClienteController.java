package org.allianz.hellospringboot.controllers;

import org.allianz.hellospringboot.dto.*;
import org.allianz.hellospringboot.models.Cliente;
import org.allianz.hellospringboot.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ClienteController {
	
	IClienteService service;
	
	public ClienteController(@Autowired IClienteService service) {
		this.service = service;
	}

	@GetMapping("/api/cliente")
	public List<Cliente> listarTodos(){
		return this.service.getAll();
	}
	
	@PostMapping("/api/cliente")
	public ResponseEntity<AddResult> agregar(@RequestBody Cliente cliente){
		try {
			this.service.add(cliente);
			return ResponseEntity.ok(new AddResult(true, "Cliente agregado satisfactoriamente", cliente));
		} catch (Exception ex) {
			return new ResponseEntity<AddResult>(new AddResult(false, ex.getMessage(), cliente), 
					HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
