package Doctors.Modelo;

public class Procedures {
    private int id_procedure;
    private String procedure_type;
    private String date1;
    private String description1;
    private String inputs;
    private String recovery_time;
    private int id_pets;

    public Procedures() {}

    public Procedures(int id_procedure, String procedure_type, String date1, String description1, String inputs, String recovery_time, int id_pets) {
        this.id_procedure = id_procedure;
        this.procedure_type = procedure_type;
        this.date1 = date1;
        this.description1 = description1;
        this.inputs = inputs;
        this.recovery_time = recovery_time;
        this.id_pets = id_pets;
    }

    public int getId_procedure() {
        return id_procedure;
    }

    public void setId_procedure(int id_procedure) {
        this.id_procedure = id_procedure;
    }

    public String getProcedure_type() {
        return procedure_type;
    }

    public void setProcedure_type(String procedure_type) {
        this.procedure_type = procedure_type;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getInputs() {
        return inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public String getRecovery_time() {
        return recovery_time;
    }

    public void setRecovery_time(String recovery_time) {
        this.recovery_time = recovery_time;
    }

    public int getId_pets() {
        return id_pets;
    }

    public void setId_pets(int id_pets) {
        this.id_pets = id_pets;
    }
    
}
