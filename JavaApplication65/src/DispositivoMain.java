
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javaapplication65.Dispositivo;
import javaapplication65.SmartPhone;
import javaapplication65.Tablet;

/**
 *
 * @author Itamar i Jordi
 */
public class DispositivoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dispositivo rellotge = new Dispositivo(100, "Huawei", "Rellotge Intel·ligent");
        SmartPhone android = new SmartPhone(300, "Nokia", "Plegable", "Android", false, false);
        SmartPhone iPhone = new SmartPhone(500, "Apple", "IPhone", "iOS", true, true);
        Tablet tablet = new Tablet(400, "Samsung", "Air", 16);
        Dispositivo nokia = new Dispositivo(100, "Alcatel", "365");

        System.out.println(rellotge);
        System.out.println(android);
        System.out.println(iPhone);
        System.out.println(tablet);
        System.out.println(nokia);

        System.out.println("\nPreus dispositiu: " + "\n\t" + rellotge.getMarca() + ", " + rellotge.getModel()
                + "\n\tPreu base: " + rellotge.getPreuBase() + "\n\tPreu final: " + rellotge.preuFinal());
        System.out.println("Preus dispositiu: " + "\n\t" + android.getMarca() + ", " + android.getModel()
                + "\n\tPreu base: " + android.getPreuBase() + "\n\tPreu final: " + android.preuFinal());
        System.out.println("Preus dispositiu: " + "\n\t" + iPhone.getMarca() + ", " + iPhone.getModel()
                + "\n\tPreu base: " + iPhone.getPreuBase() + "\n\tPreu final: " + iPhone.preuFinal());
        System.out.println("Preus dispositiu: " + "\n\t" + tablet.getMarca() + ", " + tablet.getModel()
                + "\n\tPreu base: " + tablet.getPreuBase() + "\n\tPreu final: " + tablet.preuFinal());
        System.out.println("Preus dispositiu: " + "\n\t" + nokia.getMarca() + ", " + nokia.getModel()
                + "\n\tPreu base: " + nokia.getPreuBase() + "\n\tPreu final: " + nokia.preuFinal());
    }
}
