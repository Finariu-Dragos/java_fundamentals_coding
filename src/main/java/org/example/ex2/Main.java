package org.example.ex2;

public class Main {
    public static void main(String[] args) {
        int sumWhile = 0;
        int sumDoWhile = 0;
//        for (int i=0; i<10; i++)
//        {
//            sum += i;
//        }

        //while
        int number = 0;
        while (number<10)
        {
            sumWhile += number;
            number++;
        }
        System.out.println("Sum with while: " + sumWhile);

        //do-while
        int number1 = 0;
        do {
            sumDoWhile+=number1;
            number1++;
        } while (number1<10);

        System.out.println("Sum with do-while: " + sumDoWhile);
        }
    }
