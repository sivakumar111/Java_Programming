import java.util.*;
public class Min_Value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of a Array :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0]; //Integer.MIN_VALUE; didn't use and Integer.MAX_VALUE; was used
        for(int i=0; i<n; i++)
        {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
