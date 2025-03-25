use Veterinaria_Patitas_Felices;

insert into Owners values (1, 'Yessica Andrea Perez Machuca', 563148975, 'Calle 24 av 33', 313245982, 'yessica@gmail.com', 312478964, 2, "123"), 
(2, 'Alejandra Machuca Molina', 897562143, 'Calle 12 av 12', 311254789, 'alejandra@gmail.com', 31514795, 3, "alejandra123"), 
(3, 'Camilo Machuca Molina', 100254786, 'Calle 2 av central', 310547893, 'camilo@gmail.com', 31024863, 5, "camilo123"), 
(4, 'Liceth Carolina Ortega Machuca', 510054785, 'Calle 24 barrio porvenir', 314875963, 'lictha@gmail.com', 311589642, 3, "liceth123"),
(5, 'Esperanza Machuca Molina', 563148752, 'Calle 24 barrio el puerto', 312578964, 'esperanza@gmail.com', 312547989, 1, "esperanza123"),  
(6, 'Leidy Machuca Molina', 100524875, 'Calle 22 av 13', 313249875, 'yleidy@gmail.com', 310459874, 2, "leidy123"), 
(7, 'Ruben Dario Perez Bernal', 100523987, 'Calle 12 barrio belen', 311359772, 'ruben@gmail.com', 312895634, 8, "ruben123"), 
(8, 'Yurley Botello Garcia', 100897426, 'Calle 12 barrio prados', 310856479, 'yurlei@gmail.com', 311597632, 3, "yurley123"), 
(9, 'Karla Valentina Parada Perez', 100312789, 'Calle 12 av 34', 318459753, 'karla@gmail.com', 310897534, 1, "karla123"), 
(10, 'Zully Fernanda Ortiz Avendaño', 100976541, 'Calle 12 av 5', 313597861, 'zully@gmail.com', 311523687, 2, "zully123");

insert into Additional_Services values(1, "Rehabilitation",1),
(2, "Transportation",2),
(3, "Consulting",7),
(4, "Training",1), /*adiestramiento*/
(5, "Rehabilitation",3);

insert into Pets values ( 1, 'Booby', 'Dog', 'Bichón frisé', 4, "2021-02-21", 'Male', true, "https://mivet.com/wp-content/uploads/fly-images/1472/shutterstock_1541338001-1760x992-c.jpg", false, 1),
( 2, 'Mateo', 'Dog', 'Bergamasco', 2, "2023-05-25", 'Male', false, "https://www.discoveranimals.org/uploads/pets/Bergamasco.jpg", false, 2),
( 3, 'Osito', 'Dog', 'Bichón Boloñés', 5, "2020-03-12", 'Male', false, "https://cdn.shopify.com/s/files/1/0650/9504/1173/files/origenes-bichon-bolones-1024x576.jpg?v=1709647596", false, 3),
( 4, 'Diva', 'Cat', 'Abisinio', 2, "2023-04-30", 'Female', false, "https://www.purina.es/sites/default/files/styles/ttt_image_510/public/2024-02/sitesdefaultfilesstylessquare_medium_440x440public2022-06Abyssinian.1_0.jpg?itok=l0P3MGqz", false, 4),
( 5, 'Lali', 'Sheep', 'Corriedale', 8, "2018-05-15", 'Female', true, "https://cdn.britannica.com/34/534-050-29EAE303/Corriedale-ram.jpg", false, 5),
( 6, 'Tony', 'Wolf', 'Lobo-Artic', 1, "2024-06-02", 'Male', true, "https://wolfworlds.com/wp-content/uploads/Arctic-Wolf_624.jpg", false, 6),
( 7, 'Tobby', 'Raccoon', 'Boreal', 3, "2024-07-01", 'Male', true, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Raccoon_in_Central_Park_%2835264%29.jpg/1200px-Raccoon_in_Central_Park_%2835264%29.jpg", true, 7),
( 8, 'Odin', 'Dog', 'Bretón', 6, "2020-08-16", 'Male', true, "https://www.hola.com/horizon/square/da1b7c93f005-spaniel-breton-1t-t.jpg?im=Resize=(960),type=downsize", false, 8),
( 9, 'Luna', 'Butterfly', 'Monarca', 4, "2022-05-11", 'Female', false, "https://www.biologicaldiversity.org/assets/img/species/invertebrates/MonarchButterfly_Flickr_DebbieLong_FPWC.jpg", true, 9),
( 10, 'Princesa', 'Iguana', 'Marina', 2, "2023-10-12", 'Female', true, "https://upload.wikimedia.org/wikipedia/commons/f/ff/Marine-Iguana-Espanola.jpg", false, 10);

insert into Doctors values(1, 'Dr. Juan Perez', 'Exotic animal veterinarian', 313524875, 'juan@gmail.com', "juan123"),
(2, 'Dra. Laura Camacho', 'Veterinary Surgeon', 312547965, 'laura@gmail.com', "laura123"),
(3, 'Dr. Carlos Bernal', 'Veterinary dermatologist', 311548965, 'carlos@gmail.com', "carlos123"),
(4, 'Dra. Ana Martínez', 'Veterinary dentist', 310578642, 'ana@gmail.com', "ana123"),
(5, 'Dr. Roberto Díaz', 'Veterinary Cardiology', 315247965, 'roberto@gmail.com', "roberto123"),
(6, 'Dra. Carmen Sanchez', 'Veterinary Oncology', 316231789, 'carmen@gmail.com', "carmen123"),
(7, 'Dr. Javier lopez', 'Equine veterinarian', 314597820, 'javier@gmail.com', "javier123"),
(8, 'Dra. Alejandra Ramirez', 'Avian veterinarian', 312548502, 'alejandra@gmail.com', "alejandraa123"),
(9, 'Dr. Miguel Machuca', 'Animal behavior', 310548965, 'miguel@gmail.com', "miguel123"),
(10, 'Dra. Andrea Perez', 'Veterinary Surgeon', 312789420, 'andrea@gmail.com', "andrea123");

insert into Consult values(1, "2022-08-03", '10:00', 'General inquiry', 'reserved', 'Antiparasitic and Antibiotic', 1, 2),
(2, "2020-05-04", '06:00', 'Preventive consultation', 'Medical examinations were performed', 'Anti-inflammatories and Psychotropics', 2, 2),
(3, "2021-06-05", '12:00', 'Specialized consultation', 'Ultrasound performed', 'Take atinflammatories 1 daily', 3, 3),
(4, "2022-07-06", '11:00', 'General inquiry', 'Blood tests were performed', 'Take Psychotropics every 9 hours', 4, 4),
(5, "2023-08-07", '08:30', 'Preventive consultation', 'Biochemistry performed', 'Take antiparasitics', 5, 5),
(6, "2024-09-08", '05:20', 'Specialized consultation', 'A cytology was performed', 'Take analgesics every 5 hours', 6, 6),
(7, "2018-10-09", '04:10', 'General inquiry', 'Observed the signs of the animal', 'Take nutritional supplements', 7, 7),
(8, "2019-11-10", '01:00', 'Specialized consultation', 'Radiological studies were performed', 'Take antidiarrheal every 8 hours', 8, 8),
(9, "2018-12-11", '02:40', 'Preventive consultation', 'Medical examinations were performed', 'Take antibiotics', 9, 9),
(10, "2021-05-12", '03:00', 'General inquiry', 'Radiological studies were performed', 'Take psychotropics every 7 hours', 10, 10);

insert into Procedures values(1, 'Sterilization surgery', '2025-04-10', 'Sterilization of a male dog', 'Anesthesia, sutures, antibiotics', 'Recovery at home for 6 month', 1),
(2, 'Dental extraction', '2025-05-12', 'Removal of damaged teeth of a cat', 'Anesthesia and antibiotics', 'Rest and soft diet for 8 months', 2),
(3, 'Fracture repair', '2025-06-01', 'Surgery for the repair of a sheeps leg', 'Orthopedic plate and cast', 'Rest for 4 weeks', 3),
(4, 'Tumor surgery', '2025-07-03', 'Raccoon tumor removal', 'Anesthesia, sutures, antibiotics', 'Cage recovery for 2 months', 4),
(5, 'Ear cleaning', '2024-08-15', 'Cleaning of a dogs ears', 'Cleaning solution, cotton wool', 'Immediate recovery for 2 days', 5),
(6, 'Annual vaccination', '2025-09-20', 'Annual vaccination of a cat', 'Feline trivalent vaccine', 'Vaccines for 2 hours', 6),
(7, 'Parasite treatment', '2024-10-10', 'Deworming of an iguana with parasites', 'Oral dewormers', 'Home recovery for 2 months', 7),
(8, 'Eye surgery', '2025-05-25', 'Surgery to remove cataracts in a wolf', 'Anesthesia, saturations, eye medication', 'Rest for 2 weeks', 8),
(9, 'Endoscopy', '2024-12-06', 'Endoscopy examination', 'Anesthesia, endoscopic equipment', 'Cage recovery for 3 months', 9),
(10, 'Castration', '2023-01-15', 'Castration of a female cat', 'Anesthesia, susturas, antibiotics', 'Immediate recovery for 1 day', 10);

insert into  Vaccine_History values(1, 'Adjuvants', 2, "2024-12-02", "2025-05-03", 1),
(2, 'Antigens', 4, "2022-08-03", "2023-11-12", 2),
(3, 'Inactivators', 5, "2022-12-02", "2023-05-03", 3),
(4, 'Emulsions', 2, "2020-11-11", "2021-05-03", 4),
(5, 'Immunostimulants', 4, "2018-10-01", "2019-06-03", 5),
(6, 'Preservatives', 6, "2020-02-10", "2020-04-01", 6),
(7, 'Immunostimulants', 7, "2021-09-03", "2021-10-03", 7),
(8, 'Emulsions', 3, "2022-04-04", "2022-05-08", 8),
(9, 'Antigens', 6, "2023-12-05", "2024-01-08", 9),
(10, 'Antigens', 6, "2023-12-05", "2024-01-08", 9);

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

insert into Appointments values(1, '2024-10-12', '09:00', 'Confirmed', 'General consultation', 'Annual check-up', 2),
(2, '2025-05-05', '10:30', 'Pending', 'Vaccination', 'Rabies vaccination', 3),
(3, '2025-04-14', '05:20', 'Confirmed', 'Surgery', 'Sterilization', 5),
(4, '2025-04-16', '06:10', 'Canceled', 'Dermatological consultation', 'Skin problems', 2),
(5, '2025-04-18', '03:00', 'Confirmed', 'General check-up', 'Weight check', 6),
(6, '2025-04-20', '11:50', 'Confirmed', 'Emergency consultation', 'Leg trauma', 9),
(7, '2025-04-22', '08:00', 'Pending', 'Dental check-up', 'Dental check-up', 7),
(8, '2025-04-24', '15:10', 'Confirmed', 'Veterinary consultation', 'Eye check-up', 4),
(9, '2025-04-26', '12:00', 'Pending', 'Blood test', 'Health check', 10),
(10, '2025-04-28', '14:20', 'Confirmed', 'Vaccination', 'Distemper vaccination', 1);

insert into Medicines values(1, 'Amoxixiline', 'Antibiotic', 'Pharmaceuticals lios', 50, '2025-12-01', 10.000),
(2, 'Ibuprofen', 'Anti-inflammatory', 'Laboratory genfar', 22, '2024-12-10', 55.000),
(3, 'Paracetamol', 'Analgesic', 'Pharmaco', 100, '2023-10-05', 44.000),
(4, 'Cirpofloxacin', 'Antibiotic', 'Global pharmaceutica', 90, '2022-04-20',  44.000),
(5, 'Loratadine', 'Antihistamine', 'Delta Pharmaceutica', 75, '2023-06-01', 75.000),
(6, 'Omeprazole', 'Antibiotic', 'Delta Pharmaceutica', 15, '2022-05-08', 65.000),
(7, 'Losartan', 'Antihypertensive', 'MedTech laboratorio', 25, '2024-06-12', 62.000),
(8, 'Salmetrol', 'Bronchodilator', 'pharma laboratory', 18, '2023-08-04', 24.000),
(9, 'Metformin', 'Antidiabetic', 'PharmaLife', 55, '2021-10-20', 74.000),
(10, 'Aspirin', 'Anti-inflammatory', 'Laboratorio zeta', 86, '2018-03-15', 69.000);

insert into Products values(1, 'Medicamento', 'Global pharmaceuticals', 50, '2026-12-31', 50.000),
(2, 'Alimento', 'Delta Pharmaceutica', 55, '2025-05-15', 45.000),
(3, 'Accesorio', 'Laboratory pharma', 15, '2027-05-15', 65.000),
(4, 'Medicamento', 'Zeta laboratory', 45, '2024-09-20', 35.000),
(5, 'Alimento', 'PharmaLife', 13, '2025-06-01', 82.000),
(6, 'Accesorio', 'Pharmaco', 32, '2026-11-25', 54.000),
(7, 'Medicamento', 'Genfar Laboratory', 29, '2025-01-15', 32.000),
(8, 'Alimento', 'Lios Pharmaceuticals', 85, '2025-07-10', 62.000),
(9, 'Accesorio', 'Zeta Laboratory', 42, '2026-10-05', 74.000),
(10, 'Medicamento', 'Laboratory pharma', 43, '2024-12-30', 52.000);

insert into Inventary values(1, 'Delta pharmaceutica', 1, 2),
(2, 'Global pharmaceutica', 5, 6),
(3, 'Pharma laboratory', 5, 8),
(4, 'Zeta laboratory', 7, 8),
(5, 'PharmaLife', 3, 7),
(6, 'Pharmaco', 9, 10),
(7, 'Genfar Laboratory', 5, 4),
(8, 'Lios Pharmaceuticals', 2, 1),
(9, 'Zeta laboratory', 4, 4),
(10, 'Pharma laboratory', 5, 8);

insert into  Administrator values(1, 'Carlos Martinez', 313258974, 'carlos@gmail.com', 123456780, "carlos123"),
(2, 'Ana Gomez', 311254784, 'ana@gmail.com', 098745621, "ana123");

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

insert into Invoice values(1, 150.000, 'Cufe12547896520', 'INV001', 1, 2, 3),
(2, 99.000, 'Cufe54789654128', 'INV002', 2, 1, 8),
(3, 55.000, 'Cufe57896412304', 'INV004', 6, 2, 5),
(4, 89.000, 'Cufe89742031561', 'INV004', 8, 1, 3),
(5, 66.000, 'Cufe32145978528', 'INV005', 6, 2, 10),
(6, 55.000, 'Cufe95210547894', 'INV008', 3, 1, 8),
(7, 30.000, 'Cufe52103489751', 'INV009', 4, 2, 4),
(8, 65.000, 'Cufe52147896521', 'INV003', 1, 1, 3),
(9, 75.000, 'Cufe59784103210', 'INV001', 2, 2, 10),
(10, 85.000, 'Cufe89745631025', 'INV010', 10, 1, 8);

insert into Adoption values(1, 'Laura Gonzales', 313254795, 'laura@gmail.com', 'Calle 45 # 12 -34', "2025-02-10", 1, 2),
(2, 'Carlos Ramirez', 315120145, 'carlos@gmail.com', 'Avenida 23', "2021-05-15", 2, 1),
(3, 'Maria Lopez', 312054895, 'maria@gmail.com', 'Calle 10 # 34 - 12', "2020-10-13", 1, 4),
(4, 'Jose Martinez', 310245985, 'jose@gmail.com', 'Carrera 15 # 51 - 02', "2019-04-05", 2, 3),
(5, 'Isabel Perez', 314502318, 'isabel@gmail.com', 'Calle 11 # 15 - 04', "2013-08-26", 1, 6),
(6, 'Raul Torres', 310256479, 'raul@gmail.com', 'Calle 8 # 05 - 12',"2014-07-14", 2, 5),
(7, 'Patricia Diaz', 318452123, 'patricia@gmail.com', 'Avenida 9 # 45 - 15', "2025-01-23", 1, 8),
(8, 'Ricardo Herrera', 311521548, 'ricardo@gmail.com', 'Calle 20 # 07 - 20', "2024-05-29", 2, 7),
(9, 'Veronica Jimenez', 312854103, 'veronica@gmail.com', 'Calle 30 # 12 - 07', "2023-11-30", 1, 10),
(10, 'Luis Sanchez', 310547895, 'luis@gmail.com', 'Carrera 17 # 23 - 45', "2024-12-31", 2, 9);

insert into Visits_History values(1, 4, null, 1),
(2, 8, "Free nutritional counseling", 2),
(3, 2, null, 3),
(4, 5, null, 7),
(5, 10, "Free follow-up consultation", 9);