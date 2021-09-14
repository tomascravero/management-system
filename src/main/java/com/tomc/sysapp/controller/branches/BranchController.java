package com.tomc.sysapp.controller.branches;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {

	@RequestMapping("/branches")
	public String branchesList() {
		return "List of Branches";
	}
}
