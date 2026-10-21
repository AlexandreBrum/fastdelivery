package com.fastdelivery.api.domain.legal_entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "legal_entity")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LegalEntity {
	@Id
	@GeneratedValue
	private UUID id;
	
	private String document;
	
	private String name;
	
	private String address;
	
	private String state;
	
	private String city;
	
	private String postalcode;
	
	private String phoneNumber;
	
	private String cellNumber;
	
	private String country;
}
