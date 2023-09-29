/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication65;

/**
 *
 * @author Itamar i Jordi
 */
public class SmartPhone extends Dispositivo {
    String SistemaOperatiu;
    boolean accelerometre = false;
    boolean gps = true;

    public SmartPhone(int preuBase, String Marca, String Model) {
        super(preuBase, Marca, Model);
    }

    public SmartPhone(int preuBase, String Marca, String Model, String SistemaOperatiu, boolean accelerometre,
            boolean gps) {
        super(preuBase, Marca, Model);
        this.SistemaOperatiu = SistemaOperatiu;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }

    public String getSistemaOperatiu() {
        return SistemaOperatiu;
    }

    public void setSistemaOperatiu(String SistemaOperatiu) {
        this.SistemaOperatiu = SistemaOperatiu;
    }

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public double preuFinalSmartPhone() {
        double preu = super.preuFinal();
        if (isAccelerometre() && isGps())
            return preu * 1.15;
        else if (isAccelerometre())
            return preu * 1.10;
        return preu;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tSistema operatiu = " + SistemaOperatiu + "\n\tAcceleròmetre = " + accelerometre
                + "\n\tGPS = " + gps;
    }

}
