// Zadanie 3 - operacje na tablicach

import java.util.Arrays;
import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica1 = {5, 10, 34, 52, 77, 91, 63, 88, 2, 19};
        int[] tablica2 = {75, 26, 17, 81, 49, 6, 97, 33, 7, 100};

        // Zadanie 3.1
        // Obliczanie sumy elementów poszczególnych tablic

        System.out.println();

        // instrukcja sumowania elementów tablicy1 i przypisanie tej wartości do nowej zmiennej
        int sumaTablica1 = Arrays.stream(tablica1).sum();
        // instrukcja wyświetlenia na ekranie sumy elementów tablicy nr 1
        System.out.println("Suma elementow Tablicy 1 wynosi:     " + sumaTablica1);
        int sumaTablica2 = Arrays.stream(tablica2).sum();
        System.out.println("Suma elementow Tablicy 2 wynosi:     " + sumaTablica2);
        System.out.println();

        // Zadanie 3.2
        // Znajdowanie maksymalnej i minimalnej wartości dla każdej z tablic

        // instrukcja wyszukująca największy element tablicy1 i zapisująca jego wartość do nowej zmiennej
        int maksimumTablica1 = Arrays.stream(tablica1).max().getAsInt();
        // instrukcja wyszukująca najmniejszy element tablicy1 i zapisująca jego wartość do nowej zmiennej
        int minimumTablica1 = Arrays.stream(tablica1).min().getAsInt();

        int maksimumTablica2 = Arrays.stream(tablica2).max().getAsInt();
        int minimumTablica2 = Arrays.stream(tablica2).min().getAsInt();

        System.out.println("Najwiekszy elementTablicy 1 ma wartosc:     " + maksimumTablica1);
        System.out.println("Najmniejszy elementTablicy 1 ma wartosc:    " + minimumTablica1);
        System.out.println("Najwiekszy elementTablicy 2 ma wartosc:     " + maksimumTablica2);
        System.out.println("Najmniejszy elementTablicy 2 ma wartosc:    " + minimumTablica2);
        System.out.println();

        // Zadanie 3.3
        // Obliczanie średniej wartości elementów każdej z tablic

        // instrukcja obliczająca średnią elementów tablicy1 i zapisująca jego wartość do nowej zmiennej typu Double
        Double sredniaTablica1 = Arrays.stream(tablica1).average().getAsDouble();

        Double sredniaTablica2 = Arrays.stream(tablica2).average().getAsDouble();

        System.out.println("Średnia elementów w Tablicy 1 ma wartosc:     " + sredniaTablica1);
        System.out.println("Średnia elementów w Tablicy 2 ma wartosc:     " + sredniaTablica2);
        System.out.println();

        // Zadanie 3.4
        // Tworzenie kopii aktualnych tablic

        // instrukcja tworząca kopię określonej tablicy i nadająca jej również odpowiednią wielkoćś
        int[] kopiaTablica1 = Arrays.copyOf(tablica1, tablica1.length);

        int[] kopiaTablica2 = Arrays.copyOf(tablica2, tablica2.length);

        System.out.print("Kopia Tablicy 1:     ");

        for (int i = 0; i < kopiaTablica1.length; i++) {
            System.out.print(kopiaTablica1[i] + " ");
        }
        System.out.println();
        System.out.print("Kopia Tablicy 2:     ");

        for (int i = 0; i < kopiaTablica2.length; i++) {
            System.out.print(kopiaTablica2[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Zadanie 3.5
        // Wyszukiwanie i wybieranie z tablicy wszystkich elementów
        // mniejszych lub większych od zadanego oraz utworzenie z nich
        // nowej tablicy

        Scanner scanner = new Scanner(System.in);

        // Podawanie przez użytkownika parametru, według którego ma być przeszukana tablica
        System.out.print("Podaj paramatr (liczba calkowita od 0 do 100), wedlug ktorego mam przeszukac obie tablice:  ");
        int zadanyParametr = scanner.nextInt();

        // instrukcja tworzy nową tablicę złożoną ze wszystkich elementów mniejszych
        // od zadanego parametru w Tablicy nr 1
        int[] elementyMniejszeTablica1 = Arrays.stream(tablica1).filter(el -> el < zadanyParametr).toArray();
        // instrukcja tworzy nową tablicę złożoną ze wszystkich elementów większych
        // od zadanego parametru w Tablicy nr 2
        int[] elementyWiekszeTablica2 = Arrays.stream(tablica2).filter(el -> el > zadanyParametr).toArray();

        System.out.println();
        // wyświetlenie wszystkich elementów mniejszych od założonego z tablicy nr 1
        System.out.print("Elementy mniejsze od "+zadanyParametr+" w Tablicy 1:     ");
        for (int i = 0; i < elementyMniejszeTablica1.length; i++) {
            System.out.print(elementyMniejszeTablica1[i] + " ");
        }
        System.out.println();
        System.out.println();
        // wyświetlenie wszystkich elementów większych od założonego z tablicy nr 2
        System.out.print("Elementy wieksze od "+zadanyParametr+" w Tablicy 2:      ");
        for (int i = 0; i < elementyWiekszeTablica2.length; i++) {
            System.out.print(elementyWiekszeTablica2[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Zadanie 3.6
        // Usuwanie z tablicy określonego elementów
        // i utworzenie nowej tablicy bez tego elementu

        // przypisanie założonej wartości elementu do usunięcia
        int elementDoUsuniecia = 52;

        // instrukcja wyszukująca (filtrowania) w tablicy wszystkich elementów innych niż element zadany
        // i utworzenie z nich nowej tablicy
        int[] nowaTablica = Arrays.stream(tablica1).filter(el -> el != elementDoUsuniecia).toArray();

        // wyświetlenie tablicy nr 1 po usunięciu zadanego elementu
        System.out.print("Tablica nr 1 po usunieciu jednego zadanego elementu (52):     ");
        for (int i = 0; i < nowaTablica.length; i++) {
            System.out.print(nowaTablica[i] + " ");
        }
        System.out.println();
        System.out.println();

        //public static int T[] concat(T[] tablica1, T[] tablica2) {
        // int len1 = tablica1.length;
        //int len2 = tablica2.length;
        // int[] tablNew = new int[tablica1.length+tablica2.length];

        // Zadanie 3.7
        // Łączenie  jedną, nową tablicę, Tablicy nr 1 i Tablicy nr 2

        // tworzenie kopii Tablicy nr 1 i zwiększanie jej rozmiaru o wielkość dodawanej Tablicy nr 2
        int[] tablicaPoPolaczeniu = Arrays.copyOf(tablica1, tablica1.length + tablica2.length);

        // dodawanie elementów Tablicy nr 2 do tablicy, mającej być połączeniem elementów
        // Tablicy nr 1 i Tablicy nr 2

        // sposób 1 - "ręcznie" w pętli
        //  for (int i = 0; i < tablica2.length; i++) {
        //      tablicaPoPolaczeniu[i + tablica1.length] = tablica2[i];
        //}


        // sposób 2 - za pomocą instrukcji systemowej
        // do utworzojej wcześniej kopii Tablicy nr 1 powiększonej do rozmiaru, będącego sumą rozmiarów
        // obu tablic, dodajemy Tablicę nr 2

        System.arraycopy(tablica2, 0, tablicaPoPolaczeniu, 0 + tablica1.length, tablica2.length);

        //System.arraycopy(tablica2, 0, tablicaPoPolaczeniu=Arrays.copyOf(tablica1, tablica1.length + tablica2.length), 0 + tablica1.length, tablica2.length);


        // wyświetlanie połączonych tablic
        System.out.print("Tablica, bedzca polaczeniem Tablicy nr 1 i Tablicy nr 2:      ");
        for (int i = 0; i < tablicaPoPolaczeniu.length; i++) {
            System.out.print(tablicaPoPolaczeniu[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Zadanie 3.8
        // znajdowanie ilości wystąpień podanej przez użytkownika wartości

        System.out.print("Jakiej liczby szukamy w Tablicy nr 2 (liczba calkowita od 0 do 100)?           ");
        int szukanaWartosc = scanner.nextInt();

        // instrukcja, która wyszukuje podany element i zlicza ilość jego wystąpień w tablicy
        long liczbaWystapien = Arrays.stream(tablica2).filter(el -> el == szukanaWartosc).count();

        System.out.print("Liczba wystapien wartosci "+szukanaWartosc+" w Tablicy nr 2:                                   "
                +liczbaWystapien);

        System.out.println();
        System.out.println();
    }
}
