package org.allianz.hellospringboot;

import org.allianz.hellospringboot.controllers.ClienteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ClienteControllerTests {

	@Autowired
	private ClienteController controller;
	
	@Test
	public void testControllerLoads() {
		assertThat(controller).isNotNull();
	}
}
