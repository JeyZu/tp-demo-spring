package com.example.demo.services;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.entities.Seller;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.repositories.SellerRepository;

@Service
public class DataLoader {

	private SellerRepository sellerRepo;
	private ProductRepository productRepo;

	@Autowired
	public DataLoader(SellerRepository sellerRepo, ProductRepository productRepo) {
		super();
		this.sellerRepo = sellerRepo;
		this.productRepo = productRepo;
	}
	
	@PostConstruct
	private void loadData() {
		productRepo.deleteAll();
		sellerRepo.deleteAll();
		// create client 
		Seller seller1 = new Seller(null, "patrick", "rues des champs", 31500, "Londres", null);
		sellerRepo.save(seller1);
		
		Date date = new Date();
		
		Product p1 = new Product(null,"nintendoDS","console portable","//img//ds.png",125.6,date ,seller1);
        Product p2 = new Product(null,"ps4","console salon","//img//ps4.png",400.66,date,seller1);
		productRepo.save(p1);
		productRepo.save(p2);
	}
	
}
