package Administrator.Modelo;

public class Administrator {
    private int id_administrator;
    private String name;
    private int phone;
    private String email;
    private int nit;
    private String password;

    public Administrator() {}

    public Administrator(int id_administrator, String name, int phone, String email, int nit, String password) {
        this.id_administrator = id_administrator;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.nit = nit;
        this.password = password;
    }

    public int getId_administrator() {
        return id_administrator;
    }

    public void setId_administrator(int id_administrator) {
        this.id_administrator = id_administrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
