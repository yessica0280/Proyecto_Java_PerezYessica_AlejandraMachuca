# Happy Feet

## Descripción

En la actualidad, la gestión de datos es esencial para cualquier empresa que trabaje con varios servicios, 
en este caso Happy Feet ya que nos permite el manejo adecuado de los datos, los cuales son: Pets, Owners, 
Additional_Services, Doctors, Consult, Procedures, Vaccine_History, Health_History, Appointments, Medicines, 
Products, Inventary, Administrator, Details, Invoice, Adoption, Visit_History, este proyecto tiene como objetivo 
la construcción de un sistema de gestión de una veterinaria.

El sistema propuesto permitirá a la empresa almacenar información clave de la empresa sobre las entidades. 
Además se garantiza la integridad y consistencia de los datos.

## Tecnologías utilizadas
* Java.
* MySQLWorkbench.

## Estructura del proyecto
Aquí podrás observar todo lo utilizado para desarrollar el proyecto.

1. Administrator
   
   ![Captura de pantalla (52)](https://github.com/user-attachments/assets/4c3faf19-b324-483a-b620-ba515185b9af)

   ![Captura de pantalla (53)](https://github.com/user-attachments/assets/9e4a23de-1261-43e2-9fd7-3bca67ec8caa)

2. Doctors

   ![Captura de pantalla (54)](https://github.com/user-attachments/assets/21871d95-380d-4cbd-a794-ebedfd4b7bf7)

3. Owners

   ![Captura de pantalla (55)](https://github.com/user-attachments/assets/8ba5a445-e3cd-4470-86b8-c0a65066ec3d)


## Controladores

El controlador es la parte que recibe las peticiones del usuario y coordina la respuesta de la aplicación. 

 ### Administrator:
1. ControladorAdd.
2. ControladorAdministrator.
3. ControladorDelete.
4. ControladorReport.
5. ControladorUpdate.
6. ControladorView.

### Doctors:
1. ControladorDoctors.
2. ControladorProcedures.
3. Controlador_Vaccine.
4. Controlador_add.
5. Controlador_update.
6. Controlador_view.

### Owners:
1. ControladorAdd.
2. ControladorOwners.
3. ControladorUpdate.
4. ControladorView.

## Modelos

Es la parte de la aplicación que define los datos que contendrá.

### Administrator:
1. Conexión.
2. Consultas.
3. Pets.
4. Procedures.
5. Vaccine_History.

### Doctors:
1. Conexión.
2. Consultas.
3. Doctors.
4. Pets.
5. Procedures.
6. Vaccine_History.

### Owners:
1. Additional_Services.
2. Appointments.
3. Conexión.
4. Consultas.
5. Owners.
6. Pets.
7. Visits_History.

## Vistas

Es la representación visual de los datos y la interfaz del usuario (UI) de una aplicación.

### Administrator:
1. Vista_Administrator.
2. Vista_Delete.
3. Vista_Login.
4. Vista_add.
5. Vista_menu.
6. Vista_reports.
7. Vista_update.
8. Vista_view.

### Doctors:
1. Vista_Procedures.
2. Vista_Vaccine.
3. Vista_add.
4. Vista_login.
5. Vista_menu.
6. Vista_update.
7. Vista_view.


### Owners:
1. Add.
2. FrameU.
3. Menu.
4. Update.
5. View.

## Clases

### Administrator:
1. AdditionalServices.
2. Administrator.
3. Adoption.
4. Doctors.
5. Inventory.
6. Medicines.
7. Owners.
8. Pets.
9. PetsAttended.
10. Products.
11. Vaccine_History.
12. VeterinarianPerformence.

### Doctors:
1. Doctors.
2. Pets.
3. Procedures.
4. Vaccine_History.

### Owners:
1. Consultas.
2. Owners.
3. Pets.
4. Visits_History.


## Características

* Archivo main: Contiene la página principal para poder ejecutar la aplicación.
* Archivo Controlador: Contiene la funcionalidad de las páginas.
* Archivo Modelo: Contiene las clases y conexión de la página.
* Archivo Vista: Es el encargado del diseño de la página.

## Instrucciones

1. Clonar el repositorio cargado en GitHub.
2. Abrir una de las carpetas que están organizadas por apartados.
3. Abrir y ejecutar el archivo[main] de cada apartado.

## Desarrollado por
Alejandra Machuca Molina, Yessica Andrea Perez Machuca estudiantes de Campuslands como proyecto de filtro del modulo Java en conjunto con MySQL Workbench.
