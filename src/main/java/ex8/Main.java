package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un sir de caractere: ");
        String text = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (Character.isUpperCase(c)) {
            uppercaseCount++;
        }
        else if (Character.isLowerCase(c)) {
            lowercaseCount++;
        }
        }
        System.out.println("Litere majuscule: " +uppercaseCount );
        System.out.println("Litere minuscule: " +lowercaseCount);
        scanner.close();
    }
    }