package com.tomc.sysapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tomc.sysapp.service.IGenericService;

@RestController
public class GenericController {
	
	private IGenericService genericService;
	
	public GenericController(IGenericService genericService) {
		this.genericService = genericService;
	}
}
