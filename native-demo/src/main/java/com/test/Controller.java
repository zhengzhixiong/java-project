package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author max
 */
@RestController
public class Controller {

	@GetMapping("/")
	public String index() {
		return "Native Demo For Spring Boot!";
	}

}
