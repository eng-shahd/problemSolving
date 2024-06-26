
package summation;

import java.util.Scanner;

public class Summation {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        long sum =0 ;
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
        arr[i]=input.nextInt();
        sum+=arr[i];
        }
        if(sum<0)
            sum=-sum;
       System.out.println(sum);
    }
    
    
}
