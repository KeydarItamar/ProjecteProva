package javaapplication65;

public interface GammaAlta {
    default boolean isGammaAlta() {
        return preuFinalSmartPhone() > 700.00;
    }

    double preuFinalSmartPhone();
}
