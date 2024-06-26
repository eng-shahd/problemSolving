
package lowestnumber;

import java.util.Scanner;

public class LowestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<arr.length ; i++){
        arr[i]= input.nextInt();
        }
        int low=arr[0];
        int index=1 ;
        for(int i=0 ; i<arr.length ; i++){
        
        if(arr[i]<low){
            low=arr[i];
            index=i+1;
        }
            
        }
        System.out.print(low+" "+index);
        
  }
}
