package Doctors.Modelo;

/**
 *
 * @author Uniminuto Tibu
 */
public class Doctors {
    private int id_doctor;
    private String name1;
    private String speciality;
    private int phone;
    private String email;
    private String password;

    public Doctors() {}

    public Doctors(int id_doctor, String name1, String speciality, int phone, String email, String password) {
        this.id_doctor = id_doctor;
        this.name1 = name1;
        this.speciality = speciality;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
