package ru.vsu.fedosova;

import java.util.Scanner;
import java.util.Locale;

public class Main
{

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        int n = readNumber("n");
        int a = readNumber("a");
        int b = readNumber("b");

        int sum = sumNumbers(n, a, b);

        printSum(sum);
    }

    static int readNumber(String number)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s: ", number);
        return scanner.nextInt();
    }

    public static boolean meetConditions(int a, int b, int x)
    {
        return (x > 0) && (x % a == 0) && (x % b != 0);
    }

    public static int sumNumbers(int n, int a, int b)
    {
        int sum = 0;
        int count = 0;
        for(int i = 0; count < n; i++)
        {
            if (meetConditions(a, b, i)) {
                sum = sum + i;
                count++;
            }
        }
        return sum;
    }

    static void printSum(int sum)
    {
        System.out.printf("Sum of numbers = %d", sum);
    }
}
