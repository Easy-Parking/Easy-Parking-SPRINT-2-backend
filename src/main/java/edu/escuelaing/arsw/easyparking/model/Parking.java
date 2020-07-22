/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.easyparking.model;

import java.util.ArrayList;

/**
 *
 * @author Vashi
 */
public class Parking {
    private String name;
    private int piso;
    private ArrayList<Slot> slots;

    public Parking() {
    }

    public Parking(String name, int piso, ArrayList<Slot> slots) {
        this.name = name;
        this.piso = piso;
        this.slots = slots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Slot> getSlots() {
        return slots;
    }

    public void setSlots(ArrayList<Slot> slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Parking{" + "name=" + name + ", piso=" + piso + ", slots=" + slots + '}';
    }


}
