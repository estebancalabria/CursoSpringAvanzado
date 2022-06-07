package org.allianz.hellospringboot.repositories;

import java.util.*;
import org.allianz.hellospringboot.models.*;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public ClienteRepository() {
		clientes.add(new Cliente() {{
			setId(1);
			setNombre("Juan");
			setApellido("Perez");
			setEmail("juan.perez@allianz.com");
			setTelefono("555-555555");
		}});
		
		clientes.add(new Cliente() {{
			setId(1);
			setNombre("Juan");
			setApellido("Gomez");
			setEmail("juan.perez@allianz.com");
			setTelefono("555-555555");
		}});
	}
	
	public List<Cliente> getAll(){
		return this.clientes;
	}
	
	public void add(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
