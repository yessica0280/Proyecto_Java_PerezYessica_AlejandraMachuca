package Administrator.Modelo;

public class StockMedicines {
    private int id_medicine;
    private int cant_stock;

    public StockMedicines() {
    }

    public StockMedicines(int id_medicine, int cant_stock) {
        this.id_medicine = id_medicine;
        this.cant_stock = cant_stock;
    }

    public int getId_medicine() {
        return id_medicine;
    }

    public void setId_medicine(int id_medicine) {
        this.id_medicine = id_medicine;
    }

    public int getCant_stock() {
        return cant_stock;
    }

    public void setCant_stock(int cant_stock) {
        this.cant_stock = cant_stock;
    }
}
