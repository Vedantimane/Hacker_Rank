package Functional_Programming;
import java.util.*;
public class Reverse_a_List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stream of numberr to reverse: ");
        scanner.close();
        int number = scanner.nextInt();
        int digit = 0;
        int original_order = number;
        int reminder=0;
        
       while(number!=0){
                reminder=number%10;
                digit = digit*10+reminder;
                number=number/10;
            }

            System.out.println("Reverse order of "+original_order+" is "+digit);
        }

    }
    

