import java.time.LocalDateTime;
import java.util.Scanner;


public class I3_Mikka_PasswortAbfrage {
    public static LocalDateTime gesperrtZeit = LocalDateTime.now();
    public static void main(String[] args) {
        String passwort = "098765";
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Passwort ein.");
        String eingabePasswort = in.next();

        while (true) {
            if (passwortVergleich(eingabePasswort, passwort)) {
                System.out.println("BERECHTIGT");
                break;
            } else {
                System.out.println("PASSWORT IST FALSCH!");
                counter++;
                if (counter == 3) {
                    System.out.println("KONTO WURDE GESPERT!");
                        while (gesperrtZeit.getSecond() <= gesperrtZeit.getSecond()+ 3){
                            if (//user was eingibt)
                            System.out.println("Du kannst noch nichts schreiben");
                    }
                    counter=0;
                }
                berechneVersuche(counter);
                eingabePasswort = in.next();
            }
        }
    }
    static boolean passwortVergleich(String eingabe, String erwartet) {
        return eingabe.equals(erwartet);
    }

    static void berechneVersuche(int counter) {
        int neueAnzahlVeruche = 3 - counter;
        System.out.printf("Noch %d Versuche.\n", neueAnzahlVeruche);
    }
}