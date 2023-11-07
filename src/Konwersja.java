// Zadanie 2 - konwersja liczb

import java.util.Scanner;

public class Konwersja
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj DOUBLE: ");
        double double_b = scanner.nextDouble();

        System.out.print("Podaj INT: ");
        int int_a = scanner.nextInt();

        System.out.print("Podaj CHAR: ");
        char char_d = scanner.next().charAt(0);

        System.out.print("Podaj BOOLEAN (slownie): ");
        boolean boolean_c = scanner.nextBoolean();

        int DoubleToInt=(int)double_b;
        double IntToDouble=int_a;
        int ChatToInt=Character.getNumericValue(char_d);
        String BooleanToString=String.valueOf(boolean_c);

        System.out.println();

        System.out.println("DOUBLE to Int: " + DoubleToInt);
        System.out.println("INT to Double: " + IntToDouble);
        System.out.println("CHAR to Int: " + ChatToInt);
        System.out.println("BOOLEAN to String: " + BooleanToString);

        scanner.close();
    }
}
