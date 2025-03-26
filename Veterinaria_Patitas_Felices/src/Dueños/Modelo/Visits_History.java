package Dueños.Modelo;

public class Visits_History {
    private int id_visit;
    private int quantity;
    private String profit;
    private int id_owners;

    public Visits_History() {}

    public Visits_History(int id_visit, int quantity, String profit, int id_owners) {
        this.id_visit = id_visit;
        this.quantity = quantity;
        this.profit = profit;
        this.id_owners = id_owners;
    }

    public int getId_visit() {
        return id_visit;
    }

    public void setId_visit(int id_visit) {
        this.id_visit = id_visit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public int getId_owners() {
        return id_owners;
    }

    public void setId_owners(int id_owners) {
        this.id_owners = id_owners;
    }
}
