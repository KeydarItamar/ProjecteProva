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
      
    int preuBase; 
    String Marca;
    String Model;

    public Dispositivo(int preuBase, String Marca, String Model) {
        this.preuBase = preuBase;
        this.Marca = Marca;
        this.Model = Model;
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
        return "Dispositivo :" + ", Marca=" + Marca + ", Model=" + Model + "preuBase=" + preuBase;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Dispositivo(100, "Nokia", "365");
        new Dispositivo(100, "Nokia", "365");
        new Dispositivo(100, "Nokia", "365");
        new Dispositivo(100, "Nokia", "365");
        new Dispositivo(100, "Nokia", "365");
        
        SmartPhone s = new SmartPhone("os", "sdfsdfsdf", 111, "nokia", "2011");
       
 
        
    }
    
}
