package Dueños.Modelo;

public class Appointments {
    private String date1;
    private String hour1;
    private String state;
    private String process1;
    private String reason;
    private int id_owners;

    public Appointments() {
    }

    public Appointments(String date1, String hour1, String state, String process1, String reason, int id_owners) {
        this.date1 = date1;
        this.hour1 = hour1;
        this.state = state;
        this.process1 = process1;
        this.reason = reason;
        this.id_owners = id_owners;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getHour1() {
        return hour1;
    }

    public void setHour1(String hour1) {
        this.hour1 = hour1;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProcess1() {
        return process1;
    }

    public void setProcess1(String process1) {
        this.process1 = process1;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getId_owners() {
        return id_owners;
    }

    public void setId_owners(int id_owners) {
        this.id_owners = id_owners;
    }
    
    
}
