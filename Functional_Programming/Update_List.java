package Functional_Programming;

public class Update_List {
    public static void main(String[] args) {
        int[] array =new int[] {12,5,-8,-6,-9,-78,-1};

        for(int i=0;i<array.length;i++){
            if(array[i] <0){
                array[i] = array[i]*-1;
            }

        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    
}
