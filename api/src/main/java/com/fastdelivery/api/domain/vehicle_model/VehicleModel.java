package com.fastdelivery.api.domain.vehicle_model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "vehicle_model")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleModel {
	@Id
	@GeneratedValue
	private UUID id;
	
	private String name;
	
	private Integer seatQuantity;
	
	private float weight; 
}
