/*
    AUTORE: Antinea Caldara
    DATA: 03/04/2023
    ASSEGNAZIONE: Calcolare e stampare a video l'area e il perimetro di un triangolo rettangolo,
                  implementando la classe <Triangolo_Rettangolo>
*/
public class Main {

    public static void main(String[] args) {

        Triangolo_Rettangolo triangolo = new Triangolo_Rettangolo(10, 12);

        /* STAMPA DEI RISULTATI */
        System.out.println("L'area del triangolo rettangolo è: " + triangolo.Area() + ".");
        System.out.println("Il perimetro del triangolo rettangolo è: " + triangolo.Perimetro() + ".");

    }

}
