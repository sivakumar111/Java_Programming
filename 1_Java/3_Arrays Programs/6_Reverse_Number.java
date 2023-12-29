//Program to print the elements of an array in reverse order
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        int[] arr = new int[] {5,4,3,2,1};
        System.out.println("Before reverse a number :");
        System.out.println(Arrays.toString(arr));
        System.out.println("After the reverse :");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }    
}

/*Output:
 * Before reverse a number :
 * [5, 4, 3, 2, 1]
 * After the reverse :
 * 1 2 3 4 5 
 */
