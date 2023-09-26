/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication65;

/**
 *
 * @author Itamar
 */
public class SmartPhone extends Dispositivo{
    String SistemaOperatiu;
        String Hardware;
        boolean accelerometre= false;

        public SmartPhone(int preuBase, String Marca, String Model) {
            super(preuBase, Marca, Model);
        }

        public SmartPhone(String SistemaOperatiu, String Hardware, int preuBase, String Marca, String Model) {
            super(preuBase, Marca, Model);
            this.SistemaOperatiu = SistemaOperatiu;
            this.Hardware = Hardware;
        }

        public String getSistemaOperatiu() {
            return SistemaOperatiu;
        }

        public void setSistemaOperatiu(String SistemaOperatiu) {
            this.SistemaOperatiu = SistemaOperatiu;
        }

        public String getHardware() {
            return Hardware;
        }

        public void setHardware(String Hardware) {
            this.Hardware = Hardware;
        }

        public boolean isAccelerometre() {
            return accelerometre;
        }

        public void setAccelerometre(boolean accelerometre) {
            this.accelerometre = accelerometre;
        }

        @Override
        public String toString() {
            return "Smartphone: " + "SistemaOperatiu=" + SistemaOperatiu + ", Hardware=" + Hardware + ", accelerometre=" + accelerometre;
        }
        
    
}
