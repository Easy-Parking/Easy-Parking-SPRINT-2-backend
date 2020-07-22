package edu.escuelaing.arsw.easyparking.dto;

import edu.escuelaing.arsw.easyparking.model.Parking;
import java.util.ArrayList;

public class UserDTO {

    private String id;
    private String name;
    private String rol;
    private String email;
    private String password;
    private ArrayList<Parking> parkings;

    public UserDTO() {
    }
    
    public UserDTO(String id, String name, String rol, String email, String password, ArrayList<Parking> parkings) {
        this.id = id;
        this.name = name;
        this.rol = rol;
        this.email = email;
        this.password = password;
        this.parkings = parkings;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Parking> getParkings() {
        return parkings;
    }

    public void setParkings(ArrayList<Parking> parkings) {
        this.parkings = parkings;
    }

}