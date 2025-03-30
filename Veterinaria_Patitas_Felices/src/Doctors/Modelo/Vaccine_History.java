package Doctors.Modelo;

public class Vaccine_History {
    private int id_vaccine;
    private String name1;
    private int lot;
    private String application_date;
    private String next_dose;
    private int id_pets;

    public Vaccine_History() {}

    public Vaccine_History(int id_vaccine, String name1, int lot, String application_date, String next_dose, int id_pets) {
        this.id_vaccine = id_vaccine;
        this.name1 = name1;
        this.lot = lot;
        this.application_date = application_date;
        this.next_dose = next_dose;
        this.id_pets = id_pets;
    }

    public int getId_vaccine() {
        return id_vaccine;
    }

    public void setId_vaccine(int id_vaccine) {
        this.id_vaccine = id_vaccine;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public String getApplication_date() {
        return application_date;
    }

    public void setApplication_date(String application_date) {
        this.application_date = application_date;
    }

    public String getNext_dose() {
        return next_dose;
    }

    public void setNext_dose(String next_dose) {
        this.next_dose = next_dose;
    }

    public int getId_pets() {
        return id_pets;
    }

    public void setId_pets(int id_pets) {
        this.id_pets = id_pets;
    }
}
