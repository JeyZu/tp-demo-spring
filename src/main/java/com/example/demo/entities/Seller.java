package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="sellers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String address;
	
	private Integer zip_code;
	
	private String city;
	
	@OneToMany(mappedBy="seller")
	private List<Product> products;
	
}
