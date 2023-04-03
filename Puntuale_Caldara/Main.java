import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
  AUTORE: Antinea Caldara
  DATA: 03/04/2023
  ASSEGNAZIONE: Inserire nome e cognome e stampare a video un complimento
*/
public class Main {

    public static void main(String[] args) {

        /* METODO PER LA LETTURA DEGLI INPUT */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* DICHIARAZIONE DELLE VARIABILI */
        String nome = "";
        String cognome = "";

        /* INSERIMENTO NOME */
        System.out.println("Inserisci il tuo nome --> ");
        try {
            nome = br.readLine();
        }catch(Exception e) {
            System.out.println(e);
        }

        /* INSERIMENTO COGNOME */
        System.out.println("Inserisci il tuo cognome --> ");
        try {
            cognome = br.readLine();
        }catch(Exception e) {
            System.out.println(e);
        }

        /* STAMPA A VIDEO DEL NOME, COGNOME E DEL COMPLIMENTO */
        System.out.println("Ciao " + nome + " " + cognome + ",\n Hai un bel nome!!");
    }

}
