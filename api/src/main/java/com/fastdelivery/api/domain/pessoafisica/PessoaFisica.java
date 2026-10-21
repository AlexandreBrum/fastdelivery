package com.fastdelivery.api.domain.pessoafisica;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "pessoafisica")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica {
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
	
	private String cell;
	
	private String contry;
	

}
