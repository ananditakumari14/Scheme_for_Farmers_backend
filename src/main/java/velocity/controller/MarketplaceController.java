package com.wipro.velocity.efarming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.efarming.module.Marketplace;
import com.wipro.velocity.efarming.repository.MarketplaceRepository;

@RestController
@RequestMapping("/e-farming")
public class MarketplaceController {
	
	@Autowired
	private MarketplaceRepository mrepo;

	//create marketplace
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/marketplace")
	public Marketplace createMarketplace(@Validated @RequestBody Marketplace marketplace) {

		Marketplace m = new Marketplace();
		m.setCropType(marketplace.getCropType());
        m.setCropName(marketplace.getCropName());
        m.setBasePrice(marketplace.getBasePrice());

        
		mrepo.save(m);
		return marketplace;

	}	

}
