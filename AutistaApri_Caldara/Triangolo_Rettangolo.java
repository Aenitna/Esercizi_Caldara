/* CREAZIONE DELLA CLASSE <TRIANGOLO_RETTANGOLO */
public class Triangolo_Rettangolo {

    /* VARIABILI */
    private double base = 0;
    private double altezza = 0;

    /* COSTRUTTORE */
    public Triangolo_Rettangolo(double base, double altezza) {

        this.base = base;
        this.altezza = altezza;

    }

    /* CALCOLO DELL'AREA */
    public double Area() {

        return (base * altezza)/2;

    }

    /* CALCOLO DEL PERIMETRO */
    public double Perimetro() {

        double ipotenusa = 0;

        ipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altezza, 2)); // calcolo dell'ipotenusa

        return base + altezza + ipotenusa;

    }

}
