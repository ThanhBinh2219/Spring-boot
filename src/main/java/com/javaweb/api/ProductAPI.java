package com.javaweb.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/product")
public class ProductAPI {
	@GetMapping
	public String test() {
		return "run ok";
	}
	@PostMapping
	public String test2() {
		return "ok run";
	}
}
