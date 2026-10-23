CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS individual (

	id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
	document VARCHAR(11) NOT NULL,
	name VARCHAR(40) NOT NULL,
	address VARCHAR(100) NOT NULL,
	state VARCHAR(30) NOT NULL,
	city VARCHAR(30) NOT NULL,
	postalcode VARCHAR(12) NOT NULL,
	phoneNumber VARCHAR(13) NOT NULL,
	cellNumber VARCHAR(13) NOT NULL,
	country VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS legal_entity (

	id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
	document VARCHAR(14) NOT NULL,
	name VARCHAR(40) NOT NULL,
	address VARCHAR(100) NOT NULL,
	state VARCHAR(30) NOT NULL,
	city VARCHAR(30) NOT NULL,
	postalcode VARCHAR(12) NOT NULL,
	phoneNumber VARCHAR(13) NOT NULL,
	cellNumber VARCHAR(13) NOT NULL,
	country VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS vehicle_model (

	id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
	name VARCHAR(40) NOT NULL,
	seatQuantity INTEGER NOT NULL,
	weight DECIMAL(7,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS vehicle_owner (

	id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
	individual_id UUID,
	FOREIGN KEY (individual_id) REFERENCES individual(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS vehicle_shipping (

	id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
	
	shippingDate TIMESTAMP NOT NULL,
	
	individual_id UUID,
	FOREIGN KEY (individual_id) REFERENCES individual(id) ON DELETE CASCADE,
	
	legalEntity_id UUID,
	FOREIGN KEY (legalEntity_id) REFERENCES legal_entity(id) ON DELETE CASCADE,
	
	vehicleOwner_id UUID,
	FOREIGN KEY (vehicleOwner_id) REFERENCES vehicle_owner(id) ON DELETE CASCADE
);


