create database Veterinaria_Patitas_Felices;

use Veterinaria_Patitas_Felices;

create table Owners(
	id_owner int(15) not null auto_increment,
    name1 varchar(255) not null,
    identification int(15) not null,
    address varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    emergency_contact int(15) not null,
    points varchar(255) not null
);

create table Pets(
	id_pet int(15) not null auto_increment,
    name1 varchar(255) not null,
    species varchar(255) not null,
    race varchar(255) not null,
    age int(15) not null,
    date_of_birth varchar(255),
    sex varchar(255) not null,
    microchip varchar(255),
    photo boolean not null,
    tattoo boolean not null,
    id_owner int(15),
    foreign key(id_owner) references Owners (id_owner)
);

create table Consult(
	id_consult int(15) not null auto_increment,
    date1 varchar(255) not null,
    hour1 int(15) not null,
    reason varchar(255) not null,
    diagnosis varchar(255) not null,
    prescription varchar(255) not null,
    id_pet int(15),
    foreign key(id_pet) references Pets(id_pet)
);

create table Procedures(
	id_procedure int(15) not null auto_increment,
    procedure_type varchar(255) not null,
    date1 varchar(255) not null,
    description1 varchar(255) not null,
    inputs varchar(255) not null,
    recovery_time varchar(255) not null,
    id_pet int(15),
    foreign key(id_pet) references Pets(id_pet)
);

create table health_history(
	id_history int(15) not null auto_increment,
    weight varchar(255) not null,
    allergies varchar(255) not null,
    behavior varchar(255) not null,
    id_pet int(15),
    id_procedure int(15),
    foreign key(id_pet) references Pets(id_pet),
    foreign key(id_procedure) references Procedures(id_procedure)
);

create table Appointments(
	id_appointment int(15) not null auto_increment,
    date1 varchar(255) not null,
    hour1 varchar(255) not null,
    state varchar(255) not null,
    process1 varchar(255) not null,
    reason varchar(255) not null,
    id_owner int(15),
    foreign key(id_owner) references Owners (id_owner)
);

create table Vaccine_History(
	id_vaccine int(15) not null auto_increment,
    name1 varchar(255) not null,
    lot int(15),
    date_application varchar(255) not null,
    next_dose varchar(255) not null,
    id_pet int(15),
    foreign key(id_pet) references Pets(id_pet)
);
