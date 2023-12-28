//Java Program to copy all elements of one array into another array
import java.util.*;
public class CopyArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int num = sc.nextInt();
        System.out.println("Enter the numbers");
        int[] arr1 = new int[num];
        for(int i=0; i<num; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(logic(arr1, num)));
        sc.close();
    }
    public static int[] logic(int[] arr1, int num){
        int[] arr2 = new int[num];
        arr2=arr1;
        return arr2;
    }
}

/*Output
 * Enter the size :5
 * Enter the numbers
 * 1 
 * 2
 * 3
 * 4
 * 5
 * [1, 2, 3, 4, 5]
 */
