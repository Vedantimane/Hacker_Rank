package Functional_Programming;

import java.util.Scanner;

public class Filter_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array element");
        int number = scanner.nextInt();

        int[] array = new int[number];

        for(int i=0; i< number;i++){
            array[i]=scanner.nextInt();

        }
        System.out.println("your array entered elemnt");
        for(int i=0; i< number;i++){
           
            System.out.println(array[i]);

        }
        System.out.println("Enter a value to filter the array:");
        int filterValue = scanner.nextInt();  // Specify the value to filter by

        System.out.println("Filtered elements (less than " + filterValue + "):");
        for (int i = 0; i < number; i++) {
            if (array[i] < filterValue) {  // Check if the element is less than filterValue
                System.out.println(array[i]);
            }
        scanner.close();
        

    }
    
}
}