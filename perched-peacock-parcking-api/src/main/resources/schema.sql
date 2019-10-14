drop table if exists User;
CREATE TABLE User
(
  id bigint NOT NULL,
  firstname VARCHAR(20),
  lastname VARCHAR(20),
  vehicle_number VARCHAR(20),
  vehicle_type VARCHAR(10),
  vehicle_weight VARCHAR(10),
  username VARCHAR(20),
  password VARCHAR(20),
  contact_number VARCHAR(10), -- 
  CONSTRAINT user_pk PRIMARY KEY (id)
);

INSERT INTO User (id,
            firstname, lastname, vehicle_number, vehicle_type, vehicle_weight, 
            username, password, contact_number)
    VALUES ( 1233,'Tusarkanta', 'Malik', 'KA53EF2123', 'Bike', '98KG', 
            'tkUser', 'myPass', '8181818181');
			INSERT INTO User (id,
            firstname, lastname, vehicle_number, vehicle_type, vehicle_weight, 
            username, password, contact_number)
    VALUES ( 1234,'Jagabandhu', 'Malik', 'KA53EF2157', 'Bike', '88KG', 
            'jmalik', 'myPass', '7171717171');

drop table if exists Parking;
CREATE TABLE Parking
(
  id bigint NOT NULL,
  name VARCHAR(20),
  area VARCHAR(20),
  lotcount INTEGER(20),
  vehicle_type VARCHAR(10),
);
INSERT INTO Parking (id,
            name, area, lotcount, vehicle_type)
             VALUES ( 100,'Acendus_North', 'WhiteField-ITPL', 100,'Bike');

	INSERT INTO Parking (id,
            name, area, lotcount, vehicle_type
           )
    VALUES ( 100,'Acendus_North', 'WhiteField-ITPL', 50,'Car');
	INSERT INTO Parking (id,
            name, area, lotcount, vehicle_type)
    VALUES ( 101,'Acendus_South', 'WhiteField-ITPL', 300,'Bike');

	INSERT INTO Parking (id,
            name, area, lotcount, vehicle_type)
    VALUES ( 101,'Acendus_South', 'WhiteField-ITPL', 150,'Car');
	
	
drop table if exists Rate;
CREATE TABLE Rate
(
  rateid bigint NOT NULL,
  parkingid bigint,
  duration VARCHAR(20),
  vehicle_type VARCHAR(20),
  amount INTEGER(20),
  
);

INSERT INTO Rate (rateid,
            parkingid, duration, vehicle_type, amount)
    VALUES ( 1000,100, '1hr', 'Bike', 10);
	INSERT INTO Rate (rateid,
            parkingid, duration, vehicle_type, amount)
    VALUES ( 1001,100, '1hr', 'Car', 20);
INSERT INTO Rate (rateid,
            parkingid, duration, vehicle_type, amount)
    VALUES ( 1002,100, '2hr', 'Bike', 18);
	INSERT INTO Rate (rateid,
            parkingid, duration, vehicle_type, amount)
    VALUES ( 1003,100, '2hr', 'Car', 35);	