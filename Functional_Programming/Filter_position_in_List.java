package Functional_Programming;
import java.util.*;

public class Filter_position_in_List {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("enter 10 numbers for array");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(" 10 numbers for array");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" | ");
        }
        System.out.println();
        System.out.println("the array numbers on odd position are");
        for(int i=0;i<array.length;i++){
            if (i%2 !=0) {
                System.out.println("position "+i+" is "+array[i]);
                
            }
        }
    }
    
}
