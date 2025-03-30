package Administrator.Modelo;

public class Inventary {
    private int id_consult;
    private String name1;
    private String expiration_date;

    public Inventary() {
    }

    public Inventary(int id_consult, String name1, String expiration_date) {
        this.id_consult = id_consult;
        this.name1 = name1;
        this.expiration_date = expiration_date;
    }
    
    public int getId_Consult() {
        return id_consult;
    }

    public void setId_Consult(int id_consult) {
        this.id_consult = id_consult;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getExpirationDate() {
        return expiration_date;
    }

    public void setExpirationDate(String expiration_date) {
        this.expiration_date = expiration_date;
    }
}
