import java.util.Scanner;
// Pola klasy
public class Rower {
    private String typ;
    private String nazwa;
    private int liczbaPrzelozen;
    private String rodzajRamy;
    private int wielkoscKola;

    // Konstruktor domyślny
    public Rower() {
    }
    // Metoda dodawania obiektu klasy
    public void dodaj() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj typ roweru: ");
        typ = scanner.nextLine();

        System.out.print("Podaj nazwe roweru: ");
        nazwa = scanner.nextLine();

        System.out.print("Liczba przelozen: ");
        liczbaPrzelozen = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Rodzaj ramy: ");
        rodzajRamy = scanner.nextLine();

        System.out.print("Wielkosc kola: ");
        wielkoscKola = scanner.nextInt();

        scanner.close();
    }
    // Metoda drukowania obiektu
    public void drukuj() {
        System.out.println("Dane techniczne roweru: ");
        System.out.println("Typ: " + typ);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Liczba przelozen: " + liczbaPrzelozen);
        System.out.println("Rodzaj ramy: " + rodzajRamy);
        System.out.println("Wielkosc kola: " + wielkoscKola + " cali");
    }
    //Metoda main
    public static void main(String[] args) {

        // Kod w metodzie main
        // tworzenie obiektu klasy
        Rower rower1 = new Rower();

        // wywołanie motody dodawania danych do obiektu
        rower1.dodaj();

        // wywołanie metody drukowania danych obiektu
        rower1.drukuj();
    }
}
