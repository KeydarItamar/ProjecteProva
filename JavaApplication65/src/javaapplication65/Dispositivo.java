/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication65;

/**
 *
 * @author Itamar
 */
public class Dispositivo {
      
    double preuBase; 
    String Marca;
    String Model;

    public Dispositivo(double preuBase, String Marca, String Model) {
        this.preuBase = preuBase;
        this.Marca = Marca;
        this.Model = Model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
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

    public double preuFinal() {
        return getPreuBase() * 2;
    }

    @Override
    public String toString() {
        return "Dispositivo :" + ", Marca=" + Marca + ", Model=" + Model + "preuBase=" + preuBase;
    }
    
}
