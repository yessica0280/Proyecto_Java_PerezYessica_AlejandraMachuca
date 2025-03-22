use Veterinaria_Patitas_Felices;

insert into Pets values ( 1, 'Booby', 'Dog', 'Bichón frisé', 4, 21-02-2021, 'Male', true, true, false, 1),
( 2, 'Mateo', 'Dog', 'Bergamasco', 2, 25-05-2023, 'Male', false, true, false, 2),
( 3, 'Osito', 'Dog', 'Bichón Boloñés', 5, 12-03-2020, 'Male', false, false, false, 3),
( 4, 'Diva', 'Cat', 'Abisinio', 2, 30-04-2023, 'Female', false, false, false, 4),
( 5, 'Lali', 'Sheep', 'Corriedale', 8, 15-05-2018, 'Female', true, false, false, 5),
( 6, 'Tony', 'Wolf', 'Lobo-Ártico', 1, 2-06-2024, 'Male', true, true, false, 6),
( 7, 'Tobby', 'raccoon', 'Boreal', 3, 1-07-2024, 'Male', true, true, true, 7),
( 8, 'Odin', 'Dog', 'Bretón', 6, 16-08-2020, 'Male', true, false, true, 8),
( 9, 'Luna', 'Butterfly', 'Monarca', 4, 11-05-2022, 'Female', false, false, true, 9),
( 10, 'Princesa', 'Iguana', 'Marina', 2, 12-10-2023, 'Female', true, false, false, 10);

insert into Owners values (1, 'Yessica Andrea Perez Machuca', 5631489752, 'Calle 24 av 33', 3132459782, 'yessica@gamil.com', 3125478964, 2), 
(2, 'Alejandra Machuca Molina', 8975621403, 'Calle 12 av 12', 3112547896, 'alejandra@gamil.com', 3152147895, 3), 
(3, 'Camilo Machuca Molina', 1002547896, 'Calle 2 av central', 3105478963, 'camilo@gamil.com', 3102478563, 5), 
(4, 'Liceth Carolina Ortega Machuca', 51005478965, 'Calle 24 barrio porvenir', 3148759643, 'lictha@gamil.com', 3115896742, 3),
(5, 'Esperanza Machuca Molina', 5631489752, 'Calle 24 barrio el puerto', 3125789654, 'esperanza@gamil.com', 3125478989, 1),  
(6, 'Leidy Machuca Molina', 1005248975, 'Calle 22 av 13', 3132498745, 'yleidy@gamil.com', 3104596874, 2), 
(7, 'Ruben Dario Perez Bernal', 1005236987, 'Calle 12 barrio belen', 3113597752, 'ruben@gamil.com', 3128975634, 8), 
(8, 'Yurley Botello Garcia', 1008974236, 'Calle 12 barrio prados', 3108564789, 'yurlei@gamil.com', 3115975632, 3), 
(9, 'Karla Valentina Parada Perez', 1003124789, 'Calle 12 av 34', 3184597563, 'karla@gamil.com', 3108975634, 1), 
(10, 'Zully Fernanda Ortiz Avendaño', 1009786541, 'Calle 12 av 5', 3135978641, 'zully@gamil.com', 3115236987, 2);

insert into  Vaccine_History values(1, 'Adjuvants', 2, 02-12-2024, 03-5-2025, 1),
(2, 'Antigens', 4, 03-08-2022, 12-11-2023,2 ),
(3, 'Inactivators', 5, 02-12-2022, 03-05-2023, 3),
(4, 'Emulsions', 2, 11-11-2020, 03-05-2021, 4),
(5, 'Immunostimulants', 4, 01-10-2018, 03-06-2019, 5),
(6, 'Preservatives', 6, 10-02-2020, 01-04-2020, 6),
(7, 'Immunostimulants', 7, 03-09-2021, 03-10-2021, 7),
(8, 'Emulsions', 3, 04-04-2022, 08-05-2022, 8),
(9, 'Antigens', 6, 05-12-2023, 08-01-2024, 9);
(10, 'Antigens', 6, 05-12-2023, 08-01-2024, 9);

insert into Consult values(1, 03-08-2022, '10:00:00', 'General inquiry', 'reserved', 'Antiparasitic and Antibiotic', 1, 2),
(2, 04-05-2020, '06:00:00', 'Preventive consultation', 'Medical examinations were performed', 'Anti-inflammatories and Psychotropics', 2, 2),
(3, 05-06-2021, '12:00:00', 'Specialized consultation', 'Ultrasound performed', 'Take atinflammatories 1 daily', 3, 3),
(4, 06-07-2022, '11:00:00', 'General inquiry', 'Blood tests were performed', 'Take Psychotropics every 9 hours', 4, 4),
(5, 07-08-2023, '08:30:00', 'Preventive consultation', 'Biochemistry performed', 'Take antiparasitics', 5, 5),
(6, 08-09-2024, '05:20:00', 'Specialized consultation', 'A cytology was performed', 'Take analgesics every 5 hours', 6, 6),
(7, 09-10-2018, '04:10:00', 'General inquiry', 'Observed the signs of the animal', 'Take nutritional supplements', 7, 7),
(8, 10-11-2019, '01:00:00', 'Specialized consultation', 'Radiological studies were performed', 'Take antidiarrheal every 8 hours', 8, 8),
(9, 11-12-2018, '02:40:00', 'Preventive consultation', 'Medical examinations were performed', 'Take antibiotics', 9, 9),
(10, 12-05-2021, '03:00:00', 'General inquiry', 'Radiological studies were performed', 'Take psychotropics every 7 hours', 10, 10);

insert into Doctors values(1, 'Dr. Juan Perez', 'Exotic animal veterinarian', 3135248975, 'juan@gmail.com'),
(2, 'Dra. Laura Camacho', 'Veterinary Surgeon', 3125478965, 'laura@gmail.com'),
(3, 'Dr. Carlos Bernal', 'Veterinary dermatologist', 3115478965, 'carlos@gmail.com'),
(4, 'Dra. Ana Martínez', 'Veterinary dentist', 3105789642, 'ana@gmail.com'),
(5, 'Dr. Roberto Díaz', 'Veterinary Cardiology', 3152478965, 'roberto@gmail.com'),
(6, 'Dra. Carmen Sanchez', 'Veterinary Oncology', 3162314789, 'carmen@gmail.com'),
(7, 'Dr. Javier lopez', 'Equine veterinarian', 3145697820, 'javier@gmail.com'),
(8, 'Dra. Alejandra Ramirez', 'Avian veterinarian', 31254852032, 'alejandra@gmail.com'),
(9, 'Dr. Miguel Machuca', 'Animal behavior', 3105478965, 'miguel@gmail.com'),
(10, 'Dra. Andrea Perez', 'Veterinary Surgeon', 3127895420, 'andrea@gmail.com');

insert into Medications values(1, 'Amoxixiline', 'Antibiotic', 'Pharmaceuticals lios', 50, 2025-12-01, 10.000),
(2, 'Ibuprofen', 'Anti-inflammatory', 'Laboratory genfar', 22, '2024-12-10', 55.000),
(3, 'Paracetamol', 'Analgesic', 'Pharmaco', 100, '2023-10-05', 44.000),
(4, 'Cirpofloxacin', 'Antibiotic', 'Global pharmaceutica', 90, '2022-20-04',  44.000),
(5, 'Loratadine', 'Antihistamine', 'Delta Pharmaceutica', 75, '2023-06-01', 75.000),
(6, 'Omeprazole', 'Antibiotic' 'Delta Pharmaceutica', 15, '2022-05-08', 65.000),
(7, 'Losartan', 'Antihypertensive', 'MedTech laboratorio', 25, '2024-06-12', 62.000),
(8, 'Salmetrol', 'Bronchodilator', 'pharma laboratory', 18, '2023-08-04', 24.000),
(9, 'Metformin', 'Antidiabetic', 'PharmaLife', 55, '2021-20-10', 74.000),
(10, 'Aspirin', 'Anti-inflammatory', 'Laboratorio zeta', 86, '2018-15-03', 69.000);

insert into Procedures values(1, 'Sterilization surgery', '2025-04-10', 'Sterilization of a male dog', 'Anesthesia, sutures, antibiotics', 'Recovery at home', 85,000, 1),
(2, 'Dental extraction', '2025-05-12', 'Removal of damaged teeth of a cat', 'Anesthesia and antibiotics', 'Rest and soft diet', 68,000, 2),
(3, 'Fracture repair', '2025-06-01', 'Surgery for the repair of a sheeps leg', 'Orthopedic plate and cast', 'Rest for 4 weeks', 100,000, 3),
(4, 'Tumor surgery', '2025-07-03', 'Raccoon tumor removal', 'Anesthesia, sutures, antibiotics', 'Cage recovery', 105,000, 4),
(5, 'Ear cleaning', '2024-08-15', 'Cleaning of a dogs ears', 'Cleaning solution, cotton wool', 'Immediate recovery', 30,000, 5),
(6, 'Annual vaccination', '2025-09-20', 'Annual vaccination of a cat', 'Vaccines and syringes', 25,000, 6),
(7, 'Parasite treatment', '2024-10-10', 'Deworming of an iguana with parasites', 'Oral dewormers', 'Home recovery', 35,000, 7),
(8, 'Eye surgery', '2025-05-25', 'Surgery to remove cataracts in a wolf', 'Anesthesia, saturations, eye medication', 'Home rest and check vision', 150,000, 8),
(9, 'Endoscopy', '2024-12-06', 'Endoscopy examination', 'Anesthesia, endoscopic equipment', 'Quick recovery and avoid heavy food', 89,000, 9),
(10, 'Castration', '2023-01-15', 'Castration of a female cat', 'Anesthesia, susturas, antibiotics', 'Recovery at home and check wounds daily', 60,000, 10);

insert into Inventory values(1, 'Delta pharmaceutica', 1, 2),
(2, 'Global pharmaceutica', 5, 6),
(3, 'pharma laboratory', 5, 8),
(4, 'Zeta laboratory', 7, 8),
(5, 'PharmaLife', 3, 7),
(6, 'Pharmaco', 9, 10),
(7, 'Genfar Laboratory', 5, 4),
(8, 'Lios Pharmaceuticals', 2, 1),
(9, 'Zeta laboratory', 4, 4),
(10, 'pharma laboratory', 5, 8);

insert into Health_History values(1, 15, 'None', 'Hypothyroidism', 'Normal', 1, 2, 3),
(2, 20, 'Pollen', 'Arthrosis', 'Agitated', 2, 3, 2),
(3, 8, 'Allergic to penicillin', 'No problems', 'Calm', 3, 3, 3),
(4, 12, 'None', 'Obesity', 'Normal', 6, 5, 4),
(5, 7, 'Gluten', 'Dermatitis', 'Playful', 5, 2, 7),
(6, 30, 'None', 'Heart disease', 'Slow', 6, 8, 3),
(7, 10, 'Mites', 'Epilepsy', 'Euphoric', 10, 7, 3),
(8, 22, 'Dust', 'Diabetes', 'Calm', 8, 2, 1),
(9, 14, 'None', 'No problems', 'Very active', 9, 2, 3),
(10, 9, 'Lactose', 'Chronic cold', 'Relaxed', 1, 2, 10);

insert into Invoice values(1, 150.000, 'Cufe12547896520', 'INV001', 1, 2, 3),
(2, 99.000, 'Cufe54789654128', 'INV002', 2, 5, 8),
(3, 55.000, 'Cufe57896412304', 'INV004', 6, 8, 5),
(4, 89.000, 'Cufe89742031561', 'INV004', 8, 2, 3),
(5, 66.000, 'Cufe32145978528', 'INV005', 6, 9, 10),
(6, 55.000, 'Cufe95210547894', 'INV008', 3, 2, 8),
(7, 30.000, 'Cufe52103489751', 'INV009', 4, 4, 4),
(8, 65.000, 'Cufe52147896521', 'INV003', 1, 5, 3),
(9, 75.000, 'Cufe59784103210', 'INV001', 2, 8, 10),
(10, 85.000, 'Cufe89745631025', 'INV010', 10, 9, 8);

insert into Appointments values(1, '2024-10-12', '09:00:00', 'Confirmed', 'General consultation', 'Annual check-up', 2),
(2, '2025-05-05', '10:30:00', 'Pending', 'Vaccination', 'Rabies vaccination', 3),
(3, '2025-04-14', '05:20:00', 'Confirmed', 'Surgery', 'Sterilization', 5),
(4, '2025-04-16', '06:10:00', 'Canceled', 'Dermatological consultation', 'Skin problems', 2),
(5, '2025-04-18', '03:00:00', 'Confirmed', 'General check-up', 'Weight check', 6),
(6, '2025-04-20', '11:50:00', 'Confirmed', 'Emergency consultation', 'Leg trauma', 9),
(7, '2025-04-22', '08:00:00', 'Pending', 'Dental check-up', 'Dental check-up', 7),
(8, '2025-04-24', '15:10:00', 'Confirmed', 'Veterinary consultation', 'Eye check-up', 4),
(9, '2025-04-26', '12:00:00', 'Pending', 'Blood test', 'Health check', 10),
(10, '2025-04-28', '14:20:00', 'Confirmed', 'Vaccination', 'Distemper vaccination', 1);

insert into  Administrator values(1, 'Carlos Martinez', 3132589745, 'carlos@gmail.com', 1234567890),
(2, 'Ana Gomez', 3112547894, 'ana@gmail.com', 0987456321),
(3, 'Pedro lLopez', 3145978521, 'pedro@gmail.com', 2547896541),
(4, 'Lucia Fernandez', 3156478954, 'lucia@gmail.com', 2012365482),
(5, 'Jose Rodriguez', 3125478965, 'jose@gmail.com', 5421036978),
(6, 'Maria Sanchez', 3132547895, 'maria@gmail.com', 5213647896),
(7, 'Raul Perez', 3145978642, 'raul@gmail.com', 8542103654),
(8, 'Patricia Diaz', 3154897562, 'patricia@gmail.com', 8754201369),
(9, 'Ricardo Hernandez', 3145978521, 'ricardo@gmail.com', 9654213654),
(10, 'Isabel Ruiz', 3159785420, 'isabel@gmail.com', 4521302698);

insert into Details values(1, 25.000, 25.000, 5.000, '2025-04-10', 1),
(2, 35.000, 35.000, 3.000, '2024-10-05', 10),
(3, 15.000, 15.000, 2.000, '2025-10-02', 9),
(4, 55.000, 55.000, 6.000, '2025-04-16', 8),
(5, 45.000, 45.000, 4.000, '2024-04-18', 7),
(6, 62.000, 65.000, 6.000, '2025-04-12', 6),
(7, 85.000, 85.000, 8.000, '2025-04-22', 5),
(8, 38.000, 38.000, 5.000, '2025-04-24', 4),
(9, 85.000, 85.000, 7.000, '2024-10-25', 3),
(10, 75.000, 75.000, 4.000, '2025-04-28', 2);

insert into Adoption values(1, 'Laura Gonzales', 3132547895, 'laura@gmail.com', 'Calle 45 # 12 -34', 1, 2),
(2, 'Carlos Ramirez', 3151203145, 'carlos@gmail.com', 'Avenida 23', 2, 1),
(3, 'Maria Lopez', 3120548975, 'maria@gmail.com', 'Calle 10 # 34 - 12', 3, 4),
(4, 'Jose Martinez', 3102459785, 'jose@gmail.com', 'Carrera 15 # 51 - 02', 4, 3),
(5, 'Isabel Perez', 3145023158, 'isabel@gmail.com', 'Calle 11 # 15 - 04', 5, 6),
(6, 'Raul Torres', 3102564789, 'raul@gmail.com', 'Calle 8 # 05 - 12', 6, 5),
(7, 'Patricia Diaz', 3184521023, 'patricia@gmail.com', 'Avenida 9 # 45 - 15', 7, 8),
(8, 'Ricardo Herrera', 3115210548, 'ricardo@gmail.com', 'Calle 20 # 07 - 20', 8, 7),
(9, 'Veronica Jimenez', 3128541203, 'veronica@gmail.com', 'Calle 30 # 12 - 07', 9, 10),
(10, 'Luis Sanchez', 3105478965, 'luis@gmail.com', 'Carrera 17 # 23 - 45', 10, 9);

insert into Products values(1, 'Medicamento', 'Global pharmaceutica', 50, '2026-12-31', 50.000),
(2, 'Alimento', 'Farmacéutica Delta', 55, '2025-05-15', 45.000),
(3, 'Accesorio', 'laboratorio pharma', 15, '2027-05-15', 65.000),
(4, 'Medicamento', 'Laboratorio zeta', 45, '2024-09-20', 35.000),
(5, 'Alimento', 'PharmaLife', 13, '2025-06-01', 82.000),
(6, 'Accesorio', 'Pharmaco', 32, '2026-11-25', 54.000),
(7, 'Medicamento', 'Laboratorio genfar', 29, '2025-01-15', 32.000),
(8, 'Alimento', 'Farmacéutica lios', 85, '2025-07-10', 62.000),
(9, 'Accesorio', 'Laboratorio zeta', 42, '2026-10-05', 74.000),
(10, 'Medicamento', 'laboratorio pharma', 43, '2024-12-30', 52.000);

insert into Visit_history values();

insert into Additional_Services values();