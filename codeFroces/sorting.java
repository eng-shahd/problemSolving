
package sorting;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        int min;
        
        for(int i=0 ; i<arr.length ; i++){
         arr[i]= input.nextInt();
        }
        
        for(int i=0 ; i<(arr.length) ; i++){
            for(int y=i+1 ; y<arr.length ; y++){
                if(arr[i]>arr[y] ){
                 min=arr[i];
                 arr[i]=arr[y];
                 arr[y]=min;
                }
            }
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
