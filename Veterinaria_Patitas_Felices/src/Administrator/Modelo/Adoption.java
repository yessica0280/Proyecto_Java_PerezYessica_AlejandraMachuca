package Administrator.Modelo;

public class Adoption {
    private String full_name;
    private int phone;
    private String email;
    private String address;
    private String adoption_date;
    private int id_administrator;
    private int id_owners;

    public Adoption() {
    }

    public Adoption(String full_name, int phone, String email, String address, String adoption_date, int id_administrator, int id_owners) {
        this.full_name = full_name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.adoption_date = adoption_date;
        this.id_administrator = id_administrator;
        this.id_owners = id_owners;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdoption_date() {
        return adoption_date;
    }

    public void setAdoption_date(String adoption_date) {
        this.adoption_date = adoption_date;
    }

    public int getId_administrator() {
        return id_administrator;
    }

    public void setId_administrator(int id_administrator) {
        this.id_administrator = id_administrator;
    }

    public int getId_owners() {
        return id_owners;
    }

    public void setId_owners(int id_owners) {
        this.id_owners = id_owners;
    }
}
