package com.tomc.sysapp.controller.branches;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomc.sysapp.model.branches.impl.Branch;

@RestController
@RequestMapping(value = "branches")
public class BranchController {

	@GetMapping(value = "list", produces = "application/json")
	public String branchesList() {
		return "List of Branches";
	}

	@PostMapping(value = "save", produces = "application/json")
	public Branch save() {
		Branch branch = new Branch();
		return branch;

	}
}
