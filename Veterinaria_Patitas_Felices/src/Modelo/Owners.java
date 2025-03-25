package Modelo;

public class Owners {
    private int id;
    private String name1;
    private int identification;
    private String address;
    private int phone;
    private String email;
    private int emergency_contact;
    private String points;
    private String password1;

    public Owners(){}

    public Owners(int id, String name1, int identification, String address, int phone, String email, int emergency_contact, String points, String password1) {
        this.id = id;
        this.name1 = name1;
        this.identification = identification;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.emergency_contact = emergency_contact;
        this.points = points;
        this.password1 = password1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(int emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }
    
    
}
