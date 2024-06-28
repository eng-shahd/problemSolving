
package luckyarray;

import java.util.Scanner;

public class LuckyArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=input.nextInt();
        }
        
        int min=arr[0];
        for(int i=0 ;i<arr.length;i++ ){
        if(arr[i]<min)
            min=arr[i];
        }
        int sum=0;
        for(int i=0 ; i<arr.length;i++){
        if(min==arr[i])
            sum++;
        }
        if(!(sum%2==0))
            System.out.print("Lucky");
        else
            System.out.print("Unlucky");

    }
    
}
