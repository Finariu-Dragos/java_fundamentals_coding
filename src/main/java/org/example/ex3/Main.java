package org.example.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Numărul " + number + " este par.");
        } else {
            System.out.println("Numărul " + number + " este impar.");
        }
        scanner.close();
    }
    }
