package org.allianz.hellospringboot.models;

import lombok.*;

@Getter @Setter
public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
}
