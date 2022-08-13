package com.wipro.velocity.efarming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.efarming.module.Sold;
import com.wipro.velocity.efarming.repository.SoldRepository;

@RestController
@RequestMapping("/e-farming")

public class SoldController {
	@Autowired
	private SoldRepository srepo;

	//create sold
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/sold")
	public Sold createSold(@Validated @RequestBody Sold sold) {

		Sold s = new Sold();
		s.setDate(sold.getDate());
        s.setCropName(sold.getCropName());
        s.setQuantity(sold.getQuantity());
        s.setMsp(sold.getMsp());
        s.setSoldPrice(sold.getSoldPrice());
        s.setTotalPrice(sold.getTotalPrice());

        
		srepo.save(s);
		return sold;

}
}
