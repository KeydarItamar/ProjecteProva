/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javaapplication65.Dispositivo;
import javaapplication65.SmartPhone;
import javaapplication65.Tablet;
/**
 *
 * @author Itamar
 */
public class DispositivoMain {

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
        Tablet j = new Tablet(200, 200, "apple", "asd");
 
        
    }
}
