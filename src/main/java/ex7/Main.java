package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un sir de caractere: ");
        String input = scanner.nextLine().toLowerCase();

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        String text = scanner.nextLine();

        int countVowels = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == text.charAt(i)) {
                    countVowels++;
                }
            }
        }

        System.out.println("Vowels count: " + countVowels);

        scanner.close();
    }
}

