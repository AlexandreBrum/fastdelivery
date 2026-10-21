package com.fastdelivery.api.domain.vehicle_model;

import java.util.UUID;

import com.fastdelivery.api.domain.individual.Individual;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "vehicle_owner")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleOwner {
	@Id
	@GeneratedValue
	private UUID id;
	
	@OneToOne
	@JoinColumn(name = "individual_id")	
	private Individual individual;
}
