package com.wipro.velocity.efarming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.efarming.module.Claim;
import com.wipro.velocity.efarming.repository.ClaimRepository;

@RestController
@RequestMapping("/e-farming")
//@CrossOrigin(origins="http://localhost:4200")
public class ClaimController {
	@Autowired
	
	private ClaimRepository crepo;
	
	//create claim
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/claim")
	public Claim createClaim(@Validated @RequestBody Claim claim) {

		Claim c = new Claim();
		c.setPolicyNo(claim.getPolicyNo());
		c.setInsuranceCompany(claim.getInsuranceCompany());
		c.setNameOfInsuree(claim.getNameOfInsuree());
		c.setSumOfInsured(claim.getSumOfInsured());
        c.setDateOfLoss(claim.getDateOfLoss());
        c.setCauseOfLoss(claim.getCauseOfLoss());

        
		crepo.save(c);
		return claim;
	}
}
