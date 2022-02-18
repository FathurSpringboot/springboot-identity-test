package com.fathur.springboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fathur.springboot.test.model.Identity;
import com.fathur.springboot.test.repo.IdentityRepos;



@Controller
public class IdentityController {
	
	@Autowired
	private IdentityRepos identityrepo;

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute Identity identity, Model model) {
		System.out.println(identity.toString());
		// validate 
		System.out.println(identity.getName());
		System.out.println(identity.getSsn());
		System.out.println(identity.getDob());
		System.out.println(identity.getDoc());
		System.out.println(identity.getDou());
		System.out.println(identity.getUpdateby());
		System.out.println(identity.getCreatedby());
		
		Identity identity_inserted = identityrepo.save(identity);
		model.addAttribute("message", identity_inserted.getName() + "inserted");
		return "welcome";
	}
}
