package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DemoService;
import com.example.demo.services.IService;
import com.example.demo.services.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	private SellerService sellerService; 
	
	@Autowired
	public SellerController(SellerService seller) {
		super();
		this.sellerService = seller;
		
	}
	
	
}
