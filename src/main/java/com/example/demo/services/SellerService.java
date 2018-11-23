package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Seller;
import com.example.demo.repositories.SellerRepository;

@Service
public class SellerService {
	
	private SellerRepository sellerRepo;

	@Autowired
	public SellerService(SellerRepository sellerRepo) {
		super();
		this.sellerRepo = sellerRepo;
	}
	
	public Seller findByName(String name) {
		List<Seller> sellers = sellerRepo.findByName(name);
		return (sellers.isEmpty()) ?  null : sellers.get(0);
	}
	
	public Seller findById(Long id) {
		Seller s = sellerRepo.findById(id);
		
		return s;
	}

}
