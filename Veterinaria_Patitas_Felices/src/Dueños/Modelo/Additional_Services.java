package Dueños.Modelo;

public class Additional_Services {
    private int id_services;
    private String type_service;
    private int id_owners;

    public Additional_Services(int id_services, String type_service, int id_owners) {
        this.id_services = id_services;
        this.type_service = type_service;
        this.id_owners = id_owners;
    }

    public Additional_Services() {
    }

    public int getId_services() {
        return id_services;
    }

    public void setId_services(int id_services) {
        this.id_services = id_services;
    }

    public String getType_service() {
        return type_service;
    }

    public void setType_service(String type_service) {
        this.type_service = type_service;
    }

    public int getId_owners() {
        return id_owners;
    }

    public void setId_owners(int id_owners) {
        this.id_owners = id_owners;
    }
}
