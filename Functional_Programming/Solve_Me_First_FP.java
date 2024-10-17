/*This is an introductory challenge. The purpose of this challenge is to give you a working I/O template in your preferred language. It includes scanning  integers from STDIN, calling a function, returning a value, and printing it to STDOUT.

Your task is to scan two numbers,  and  from STDIN, and print the sum  on STDOUT.

Note: The code has been saved in a template that you can submit if you want. */

package Functional_Programming;

import java.util.Scanner;
 
public class Solve_Me_First_FP{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter Second number");
        int b = scanner.nextInt();
        scanner.close();
        int sum = a+b;
        System.out.println(sum);


    }

}