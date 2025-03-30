package Administrator.Modelo;

public class PetsAttended {
    private int id_pets;
    private String name1;
    private String species;
    private int age;
    private String procedure_type;
    private String description1;
    private String inputs;
    private int quantity;
    private String nameV;
    private String application_date;
    private String next_dose;

    public PetsAttended() {
    }

    public PetsAttended(int id_pets, String name1, String species, int age, String procedure_type, String description1, String inputs, int quantity, String nameV, String application_date, String next_dose) {
        this.id_pets = id_pets;
        this.name1 = name1;
        this.species = species;
        this.age = age;
        this.procedure_type = procedure_type;
        this.description1 = description1;
        this.inputs = inputs;
        this.quantity = quantity;
        this.nameV = nameV;
        this.application_date = application_date;
        this.next_dose = next_dose;
    }

    public int getId_pets() {
        return id_pets;
    }

    public void setId_pets(int id_pets) {
        this.id_pets = id_pets;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProcedure_type() {
        return procedure_type;
    }

    public void setProcedure_type(String procedure_type) {
        this.procedure_type = procedure_type;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameV() {
        return nameV;
    }

    public void setNameV(String nameV) {
        this.nameV = nameV;
    }

    public String getApplication_date() {
        return application_date;
    }

    public void setApplication_date(String application_date) {
        this.application_date = application_date;
    }

    public String getNext_dose() {
        return next_dose;
    }

    public void setNext_dose(String next_dose) {
        this.next_dose = next_dose;
    }
    
    
    
}
