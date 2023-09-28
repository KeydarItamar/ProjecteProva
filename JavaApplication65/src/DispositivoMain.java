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
        Dispositivo rellotge = new Dispositivo(100, "Rellotge Intel·ligent", "2");
        SmartPhone android = new SmartPhone(300, "Nokia", "Andrioid");
        SmartPhone iPhone = new SmartPhone(500, "Apple", "IPhone", "iOS", true, true);
        Tablet tablet = new Tablet(400, "Samsung", "Air", 16);
        Dispositivo nokia = new Dispositivo(100, "Nokia", "365");
        
        System.out.println(rellotge);
        System.out.println(android);
        System.out.println(iPhone);
        System.out.println(tablet);
        System.out.println(nokia);
        System.out.println("Preu final IPhone: "+ iPhone.preuFinalSmartPhone());
        
        
    }
}
