use Veterinaria_Patitas_Felices;

insert into Pets values ( 1, "Booby", "Dog", "Bichón frisé", 4, 21-02-2021, "Male", true, true, false, 1),
( 2, "Mateo", "Dog", "Bergamasco", 2, 25-05-2023, "Male", false, true, false, 2),
( 3, "Osito", "Dog", "Bichón Boloñés", 5, 12-03-2020, "Male", false, false, false, 3),
( 4, "Diva", "Cat", "Abisinio", 2, 30-04-2023, "Female", false, false, false, 4),
( 5, "Lali", "Sheep", "Corriedale", 8, 15-05-2018, "Female", true, false, false, 5),
( 6, "Tony", "Wolf", "Lobo-Ártico", 1, 2-06-2024, "Male", true, true, false, 6),
( 7, "Tobby", "raccoon", "Boreal", 3, 1-07-2024, "Male", true, true, true, 7),
( 8, "Odin", "Dog", "Bretón", 6, 16-08-2020, "Male", true, false, true, 8),
( 9, "Luna", "Butterfly", "Monarca", 4, 11-05-2022, "Female", false, false, true, 9),
( 10, "Princesa", "Iguana", "Marina", 2, 12-10-2023, "Female", true, false, false, 10);

insert into Owners values (1, "Yessica Andrea Perez Machuca", 5631489752, "Calle 24 av 33", 3132459782, "yessica@gamil.com", 3125478964, "Descuentos", 2), 
(2, "Alejandra Machuca Molina", 8975621403, "Calle 12 av 12", 3112547896, "alejandra@gamil.com", 3152147895, "Consulta gratis", 3), 
(3, "Camilo Machuca Molina", 1002547896, "Calle 2 av central", 3105478963, "camilo@gamil.com", 3102478563, "Descuentos", 5), 
(4, "Liceth Carolina Ortega Machuca", 51005478965, "Calle 24 barrio porvenir", 3148759643, "lictha@gamil.com", 3115896742, "Consulta gratis", 3),
(5, "Esperanza Machuca Molina", 5631489752, "Calle 24 barrio el puerto", 3125789654, "esperanza@gamil.com", 3125478989, "Descuentos", 1),  
(6, "Leidy Machuca Molina", 1005248975, "Calle 22 av 13", 3132498745, "yleidy@gamil.com", 3104596874, "Consulta gratis", 2), 
(7, "Ruben Dario Perez Bernal", 1005236987, "Calle 12 barrio belen", 3113597752, "ruben@gamil.com", 3128975634, "Descuentos", 8), 
(8, "Yurley Botello Garcia", 1008974236, "Calle 12 barrio prados", 3108564789, "yurlei@gamil.com", 3115975632, "Consula gratis", 3), 
(9, "Karla Valentina Parada Perez", 1003124789, "Calle 12 av 34", 3184597563, "karla@gamil.com", 3108975634, "Descuentos", 1), 
(10, "Zully Fernanda Ortiz Avendaño", 1009786541, "Calle 12 av 5", 3135978641, "zully@gamil.com", 3115236987, "Consulta gratiss", 2);

insert into  Vaccine_History values(1, 1, "Adyuvantes", 2, 02-12-2024, 03-5-2025),
(2, 2, "Antígenos", 4, 03-08-2022, 12-11-2023),
(3, 3, "Inactivadores", 5, 02-12-2022, 03-05-2023),
(4, 4, "Emulsiones", 2, 11-11-2020, 03-05-2021),
(5, 5, "Inmunoestimulantes", 4, 01-10-2018, 03-06-2019),
(7, 7, "Conservantes", 6, 10-02-2020, 01-04-2020),
(8, 8, "Inmunoestimulantes", 7, 03-09-2021, 03-10-2021),
(9, 9, "Emulsiones", 3, 04-04-2022, 08-05-2022),
(10, 10, "Antígenos", 6, 05-12-2023, 08-01-2024);

insert into Consult values(1, 03-08-2022, 10:00, "Consulta general", "reservado", "Atiparasitarios y Antibiotico", 1, 2),
(2, 04-05-2020, 06:00, "Consulta preventiva", "Se realizo exaenes medicos", "Atiinflamatorios y Psicotrópicos", 2, 2);