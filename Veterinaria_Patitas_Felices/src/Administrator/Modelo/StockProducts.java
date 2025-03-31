package Administrator.Modelo;

public class StockProducts {
    private int id_product;
    private int cant_stock;

    public StockProducts() {
    }

    public StockProducts(int id_product, int cant_stock) {
        this.id_product = id_product;
        this.cant_stock = cant_stock;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getCant_stock() {
        return cant_stock;
    }

    public void setCant_stock(int cant_stock) {
        this.cant_stock = cant_stock;
    }
}
