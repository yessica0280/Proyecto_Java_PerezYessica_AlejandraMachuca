package Dueños.Vista;

public class updateAppointment {
    private int id_appointment;
    private String date;
    private String hour;
    private String state;
    private String process;
    private String reason;
    private int id_owner;

    public updateAppointment() {}

    public updateAppointment(int id_appointment, String date, String hour, String state, String process, String reason, int id_owner) {
        this.id_appointment = id_appointment;
        this.date = date;
        this.hour = hour;
        this.state = state;
        this.process = process;
        this.reason = reason;
        this.id_owner = id_owner;
    }

    public int getId_appointment() {
        return id_appointment;
    }

    public void setId_appointment(int id_appointment) {
        this.id_appointment = id_appointment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }
}
