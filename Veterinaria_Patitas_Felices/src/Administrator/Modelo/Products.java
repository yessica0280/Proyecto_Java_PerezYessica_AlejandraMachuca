package Administrator.Modelo;

public class Products {
    private int id_product;
    private String type1;
    private String manufacturer;
    private int quantity;
    private String expiration_date;
    private int price;

    public Products() {
    }

    public Products(int id_product, String type1, String manufacturer, int quantity, String expiration_date, int price) {
        this.id_product = id_product;
        this.type1 = type1;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.expiration_date = expiration_date;
        this.price = price;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
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

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
