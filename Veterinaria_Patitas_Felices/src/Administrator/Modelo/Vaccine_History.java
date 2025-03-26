package Administrator.Modelo;

public class Vaccine_History {
    private int id_vaccine;
    private String name;
    private int lot;
    private String application_date;
    private String next_dose;
    private int id_pets;

    public Vaccine_History() {}

    public Vaccine_History(int id_vaccine, String name, int lot, String application_date, String next_dose, int id_pets) {
        this.id_vaccine = id_vaccine;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
