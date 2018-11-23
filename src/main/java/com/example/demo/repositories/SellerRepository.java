package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Seller;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long>{
	List<Seller> findByName(String name);
}
