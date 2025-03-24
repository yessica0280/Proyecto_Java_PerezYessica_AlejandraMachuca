create database Veterinaria_Patitas_Felices;

use Veterinaria_Patitas_Felices;

create table Owners(
	id_owners int not null auto_increment primary key,
    name1 varchar(255) not null,
    identification int(15) not null,
    address varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    emergency_contact int(15) not null,
    points varchar(255) not null
);

create table Additional_Services(
	id_services int(15) not null auto_increment primary key,
    type_service varchar(255) not null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners(id_owners)
);

create table Pets(
	id_pets int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    species varchar(255) not null,
    race varchar(255) not null,
    age int(15) not null,
    date_of_birth date not null,
    sex varchar(255) not null,
    microchip boolean not null,
    photo varchar(1000) not null,
    tattoo boolean not null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners (id_owners)
);

create table Doctors(
	id_doctor int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    speciality varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null
);

create table Consult(
	id_consult int(15) not null auto_increment primary key,
    date1 date not null,
    hour1 varchar(255) not null,
    reason varchar(255) not null,
    diagnosis varchar(255) not null,
    prescription varchar(255) not null,
    id_doctor int(15) not null,
    id_pets int(15) not null,
    foreign key(id_pets) references Pets(id_pets),
    foreign key(id_doctor) references Doctors(id_doctor)
);

create table Procedures(
	id_procedure int(15) not null auto_increment primary key,
    procedure_type varchar(255) not null,
    date1 date not null,
    description1 varchar(255) not null,
    inputs varchar(255) not null,
    recovery_time varchar(255) not null,
    id_pets int(15) not null,
    foreign key(id_pets) references Pets(id_pets)
);

create table Vaccine_History(
	id_vaccine int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    lot int(15),
    application_date date not null,
    next_dose date not null,
    id_pets int(15) not null,
    foreign key(id_pets) references Pets(id_pets)
);

create table Health_history(
	id_history int(15) not null auto_increment primary key,
    weight varchar(255) not null,
    allergies varchar(255) not null,
    conditions varchar(255) not null, 
    behavior varchar(255) not null,
    id_pets int(15) not null,
    id_procedure int(15) not null,
    id_vaccine int(15) not null,
    foreign key(id_pets) references Pets(id_pets),
    foreign key(id_procedure) references Procedures(id_procedure),
    foreign key(id_vaccine) references Vaccine_History(id_vaccine)
);

create table Appointments(
	id_appointment int(15) not null auto_increment primary key,
    date1 date not null,
    hour1 varchar(255) not null,
    state varchar(255) not null,
    process1 varchar(255) not null,
    reason varchar(255) not null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners (id_owners)
);

create table Medicines(
	id_medicine int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    type1 varchar(255) not null,
    manufacturer varchar(255) not null,
    quantity int(15) not null,
    expiration_date date not null,
    price int(15) not null
);

create table Products(
	id_product int(15) not null auto_increment primary key,
    type1 varchar(255) not null,
    manufacturer varchar(255) not null,
    quantity int(15) not null,
    expiration_date date not null,
    price int(15) not null
);

create table Inventary(
	id_inventory int(15) not null auto_increment primary key,
    supplier varchar(255) not null,
    id_medicine int(15) not null,
    id_product int(15) not null,
    foreign key(id_product) references Products(id_product)
);

create table Administrator(
	id_administrator int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    nit int(15) not null
);

create table Details(
	id_details int(15) not null auto_increment primary key,
    unit_value int(15) not null,
    subtotal int(15) not null,
    tax int(15) not null,
    invoice_date date not null,
    id_consult int(15) not null,
    foreign key(id_consult) references Consult(id_consult)
);

create table Invoice(
	id_invoice int(15) not null auto_increment primary key,
    total int(15) not null,
    cufe varchar(255) not null,
    code1 varchar(255) not null,
    id_owners int(15) not null,
    id_administrator int(15) not null,
    id_details int(15) not null,
    foreign key(id_owners) references Owners(id_owners),
    foreign key(id_administrator) references Administrator(id_administrator),
    foreign key(id_details) references Details(id_details)
);

create table Adoption(
	id_adoption int(15) not null auto_increment primary key,
    full_name varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    address varchar(255) not null,
    adoption_date date not null,
    id_administrator int(15) not null,
    id_owners int(15) not null,
    foreign key(id_administrator) references Administrator(id_administrator),
    foreign key(id_owners) references Owners(id_owners)
);

create table Visits_History(
	id_visit int(15) not null auto_increment primary key,
    quantity int(15) not null,
    profit varchar(255) null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners(id_owners)
);