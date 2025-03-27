package Administrator.Modelo;

public class Medicines {
    private int id_medicine;
    private String name1;
    private String type1;
    private String manufacturer;
    private int quantity;
    private String expiracion_date;
    private int price;

    public Medicines() {}

    public Medicines(int id_medicine, String name1, String type1, String manufacturer, int quantity, String expiracion_date, int price) {
        this.id_medicine = id_medicine;
        this.name1 = name1;
        this.type1 = type1;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.expiracion_date = expiracion_date;
        this.price = price;
    }

    public int getId_medicine() {
        return id_medicine;
    }

    public void setId_medicine(int id_medicine) {
        this.id_medicine = id_medicine;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiracion_date() {
        return expiracion_date;
    }

    public void setExpiracion_date(String expiracion_date) {
        this.expiracion_date = expiracion_date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
