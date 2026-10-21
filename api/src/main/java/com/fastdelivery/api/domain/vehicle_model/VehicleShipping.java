package com.fastdelivery.api.domain.vehicle_model;

import java.sql.Date;
import java.util.UUID;

import com.fastdelivery.api.domain.individual.Individual;
import com.fastdelivery.api.domain.legal_entity.LegalEntity;

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

@Table(name = "vehicle_shipping")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleShipping {
	@Id
	@GeneratedValue
	private UUID id;
	
	private Date shippingDate;
	
	@OneToOne
	@JoinColumn(name = "individual_id")	
	private Individual individual;
	
	@OneToOne
	@JoinColumn(name = "legal_entity_id")
	private LegalEntity legalEntity;
	
	@OneToOne
	@JoinColumn(name = "vehicle_owner_id")	
	private VehicleOwner vehicleOwner;
}
