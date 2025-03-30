package Administrator.Modelo;

public class VeterinarianPerformance {
    private int id_doctor;
    private String name1;
    private String expiration_date;

    public VeterinarianPerformance() {
    }

    public VeterinarianPerformance(int id_doctor, String name1) {
        this.id_doctor = id_doctor;
        this.name1 = name1;
        this.expiration_date = expiration_date;
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
}
