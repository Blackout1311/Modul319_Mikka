import java.util.Scanner;


public class I3_Mikka_PasswortAbfrage {
    public static void main(String[] args) {
        String passwort = "098765";
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Passwort ein.");
        String eingabePasswort = in.next();

        while (counter < 3) {
            if (passwortVergleich(eingabePasswort, passwort)) {
                System.out.println("BERECHTIGT");
                break;
            } else {

                System.out.println("PASSWORT IST FALSCH!");
                counter++;
                if (counter == 3) {
                    System.out.println("KONTO WURDE GESPERT!");
                    break;
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