package Functional_Programming;
import java.util.*;

public class Sum_of_odd_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers to do sum of odd numbers");
        
        int[] array= new int[10];
        int num=0;
       for(int i=0;i<array.length;i++){
        array[i]=scanner.nextInt();
       }
       scanner.close();
       for(int i=0;i<array.length;i++){
        if (i%2!=0) {
             num = num+i;         
        }
        
       }
       System.out.println("sum of odd numbers: "+num);

       
    }
    
}
