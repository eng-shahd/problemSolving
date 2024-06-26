
package replacement;

import java.util.Scanner;

public class Replacement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<arr.length ; i++){
        arr[i]= input.nextInt();
        }
        
        for(int i=0 ; i<arr.length ; i++){
        
        if ( arr[i]<0)
            arr[i]=2;
        else if(arr[i]>0)
                arr[i]=1;
        System.out.print(arr[i]+" ");
        
        }
        
        
    }
    
}
