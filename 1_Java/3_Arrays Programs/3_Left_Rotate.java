//Program to left rotate the elements of an array
import java.util.*;
public class Leftshift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size :");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the numbers :");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        

        System.out.println("Enter the number of shift's");
        int num=sc.nextInt();

        for(int i=0; i<num; i++){
            int first=arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

/*Output
 * Enter the Size :5
 * Enter the numbers :1 2 3 4 5
 * Enter the number of shift's
 * 2
 * [3, 4, 5, 1, 2]
 */
