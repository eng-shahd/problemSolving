
package reversing;

import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] arrin= new int[n];
         int num=n-1;
        for(int i=0 ; i<arr.length ; i++){
        arr[i]= input.nextInt();
       
        }
       for(int i=0 ; i<arr.length ; i++){
           arrin[i]=arr[num-i];
           System.out.print(arrin[i]+" ");
       }
        
        
    }
    
}
