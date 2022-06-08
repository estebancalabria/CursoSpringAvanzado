package org.allianz.hellospringboot.services;

import java.util.List;
import org.allianz.hellospringboot.models.Cliente;
import org.allianz.hellospringboot.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> getAll() {
		return this.repository.findAll();
	}

	public void add(Cliente cliente) {
		
		if ((cliente.getNombre()==null) || cliente.getNombre().length()==0) {
			throw new RuntimeException("El nombre del cliente no puede quedar vacio");
		}
		
		this.repository.save(cliente);
	}

}
