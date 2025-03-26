package Administrator.Modelo;

public class Pets {
    private int id_pets;
    private String name1;
    private String species;
    private String race;
    private int age;
    private String date_of_birth;
    private String sex;
    private boolean microchip;
    private String photo;
    private boolean tattoo;
    private int id_owners;

    public Pets() {}

    public Pets(int id_pets, String name1, String species, String race, int age, String date_of_birth, String sex, boolean microchip, String photo, boolean tattoo, int id_owners) {
        this.id_pets = id_pets;
        this.name1 = name1;
        this.species = species;
        this.race = race;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.sex = sex;
        this.microchip = microchip;
        this.photo = photo;
        this.tattoo = tattoo;
        this.id_owners = id_owners;
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isMicrochip() {
        return microchip;
    }

    public void setMicrochip(boolean microchip) {
        this.microchip = microchip;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isTattoo() {
        return tattoo;
    }

    public void setTattoo(boolean tattoo) {
        this.tattoo = tattoo;
    }

    public int getId_owners() {
        return id_owners;
    }

    public void setId_owners(int id_owners) {
        this.id_owners = id_owners;
    }
}
