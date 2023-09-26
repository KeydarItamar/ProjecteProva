/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication65;

/**
 *
 * @author Itamar
 */
public class Tablet extends Dispositivo{
    int pulsades;

    public Tablet(int pulsades, int preuBase, String Marca, String Model) {
        super(preuBase, Marca, Model);
        this.pulsades = pulsades;
    }

    public int getPulsades() {
        return pulsades;
    }

    public void setPulsades(int pulsades) {
        this.pulsades = pulsades;
    }

    public int getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(int preuBase) {
        this.preuBase = preuBase;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    @Override
    public String toString() {
        return "Tablet{" + "pulsades=" + pulsades + '}';
    }


    
    
}
