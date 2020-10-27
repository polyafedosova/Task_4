package ru.vsu.fedosova;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        int n = readQuantityAndDividend("n");
        int divisor_1 = readQuantityAndDividend("divisor_1");
        int divisor_2 = readQuantityAndDividend("divisor_2");

        int sum = sumNumbers(n, divisor_1, divisor_2);

        printSum(sum);
    }

    static int readQuantityAndDividend(String number)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s: ", number);
        return scanner.nextInt();
    }

    public static int meetConditions(int divisor_1, int divisor_2, int number)
    {
        if ((number > 0) && (number % divisor_1 == 0) && (number % divisor_2 != 0))
        {
            return number;
        }
        return 0;
    }

    public static int sumNumbers(int n, int divisor_1, int divisor_2)
    {
        int sum = 0;
        int count = 0;
        for(int i = 0; count < n; i++)
        {
            int number = meetConditions(divisor_1, divisor_2, i);
            sum = sum + number;
            if(number != 0) count++;
        }
        return sum;
    }

    static void printSum(int sum)
    {
        System.out.printf("Sum of numbers = %d", sum);
    }
}
