 package org.allianz.hellospringboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {
	private static final long serialVersionUID = 1L;
	
	public NotFoundException(){
		super("Entidad No Encontrada");
	}
}