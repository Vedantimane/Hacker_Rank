package Functional_Programming;
import java.util.Scanner;



public class Hello_world_n_times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you want display hello world");
        int num = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=num;i++){
            System.out.println("Hello World "+i);
        }
        
    }
    
}
