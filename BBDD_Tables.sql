create database Veterinaria_Patitas_Felices;

use Veterinaria_Patitas_Felices;

-- drop database Veterinaria_Patitas_Felices;

create table Owners(
	id_owners int not null auto_increment primary key,
    name1 varchar(255) not null,
    identification int(15) not null,
    address varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    emergency_contact int(15) not null,
    points varchar(255) not null,
    password1 varchar(255) not null
);

/*select * from Owners;*/

create table Additional_Services(
	id_services int(15) not null auto_increment primary key,
    type_service varchar(255) not null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners(id_owners) on delete cascade
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
    foreign key(id_owners) references Owners (id_owners) on delete cascade
);

/*select * from Pets;*/
/*select * from Administrator;*/

/*select p.*, o.* from Pets p inner join Owners o on o.id_owners = p.id_owners where id_pets = 1;*/

create table Doctors(
	id_doctor int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    speciality varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    password1 varchar(255) not null
);


/*select * from Doctors;*/

create table Consult(
	id_consult int(15) not null auto_increment primary key,
    date1 date not null,
    hour1 varchar(255) not null,
    reason varchar(255) not null,
    diagnosis varchar(255) not null,
    prescription varchar(255) not null,
    id_doctor int(15) not null,
    id_pets int(15) not null,
    foreign key(id_pets) references Pets(id_pets) on delete cascade,
    foreign key(id_doctor) references Doctors(id_doctor) on delete cascade
);

create table Procedures(
	id_procedure int(15) not null auto_increment primary key,
    procedure_type varchar(255) not null,
    date1 date not null,
    description1 varchar(255) not null,
    inputs varchar(255) not null,
    recovery_time varchar(255) not null,
    id_pets int(15) not null,
    foreign key(id_pets) references Pets(id_pets) on delete cascade
);

create table Vaccine_History(
	id_vaccine int(15) not null auto_increment primary key,
    name2 varchar(255) not null,
    lot int(15),
    application_date date not null,
    next_dose date not null,
    id_pets int(15) not null,
    foreign key(id_pets) references Pets(id_pets) on delete cascade
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
    foreign key(id_pets) references Pets(id_pets) on delete cascade,
    foreign key(id_procedure) references Procedures(id_procedure) on delete cascade,
    foreign key(id_vaccine) references Vaccine_History(id_vaccine) on delete cascade
);

create table Appointments(
	id_appointment int(15) not null auto_increment primary key,
    date1 date not null,
    hour1 varchar(255) not null,
    state varchar(255) not null,
    process1 varchar(255) not null,
    reason varchar(255) not null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners (id_owners) on delete cascade
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

/*select name1, type1, manufacturer, quantity, expiration_date, price from Medicines where id_medicine = 1;*/

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
    foreign key(id_medicine) references Medicines(id_medicine) on delete cascade,
    foreign key(id_product) references Products(id_product) on delete cascade
);

/*select i.*, m.* from Inventary i inner join Medicines m on i.id_medicine = m.id_medicine where i.id_medicine = 2;
select i.*, p.* from Inventary i inner join Products p on i.id_product = p.id_product where i.id_product =1;*/

create table Administrator(
	id_administrator int(15) not null auto_increment primary key,
    name1 varchar(255) not null,
    phone int(15) not null,
    email varchar(255) not null,
    nit int(15) not null,
    password1 varchar(255) not null
);

create table Details(
	id_details int(15) not null auto_increment primary key,
    unit_value int(15) not null,
    subtotal int(15) not null,
    tax int(15) not null,
    invoice_date date not null,
    id_consult int(15) not null,
    foreign key(id_consult) references Consult(id_consult) on delete cascade
);

create table Invoice(
	id_invoice int(15) not null auto_increment primary key,
    total int(15) not null,
    cufe varchar(255) not null,
    code1 varchar(255) not null,
    id_owners int(15) not null,
    id_administrator int(15) not null,
    id_details int(15) not null,
    foreign key(id_owners) references Owners(id_owners) on delete cascade,
    foreign key(id_administrator) references Administrator(id_administrator) on delete cascade,
    foreign key(id_details) references Details(id_details) on delete cascade
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
    foreign key(id_administrator) references Administrator(id_administrator) on delete cascade,
    foreign key(id_owners) references Owners(id_owners) on delete cascade
);

create table Visits_History(
	id_visit int(15) not null auto_increment primary key,
    quantity int(15) not null,
    profit varchar(255) null,
    id_owners int(15) not null,
    foreign key(id_owners) references Owners(id_owners) on delete cascade
);

/*ver mascotas atendidas*/
select p.id_pets, p.name1, p.species, p.age, pro.procedure_type, pro.description1, pro.inputs, v.quantity, vh.name2, vh.application_date, vh.next_dose from Pets p 
inner join Procedures pro on p.id_pets = pro.id_pets 
inner join Owners o on p.id_owners = o.id_owners 
inner join Visits_History v on v.id_owners = o.id_owners
inner join Vaccine_History vh on p.id_pets = vh.id_pets;

/*servicios más solicitados*/
select type_service, count(*) as service_count from Additional_Services group by type_service order by service_count desc limit 1;

/*Desempeño de veterinario*/
select c.id_doctor, d.name1, count(*) as cant_consults from Consult c inner join Doctors d on c.id_doctor = d.id_doctor where c.id_doctor = 1 group by id_doctor order by cant_consults desc;

/*Inventario*/
select c.id_consult, m.name1, m.expiration_date from Consult c inner join Medicines m on find_in_set(m.name1, replace(c.prescription, ' ', ''));