package com.nvwebjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int answer = scanner.nextInt();

        if (answer % 3 == 0 && answer % 5 == 0)
            System.out.println("FizzBuzz");
        else if (answer % 3 == 0)
            System.out.println("Buzz");
        else if (answer % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(answer);
    }
}
