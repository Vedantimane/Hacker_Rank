package Functional_Programming;
import java.util.*;
public class Array_of_N_element {

    public static void Array(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        System.out.print("[ ");
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ]");
        scanner.close();

    }

    public static void main(String[] args) {
        Array();
        
    }
    
}
