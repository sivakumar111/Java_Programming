//Return a index value if the  element was found or return some other wall in Integer.MAX_VALUE or Integer.MIN_VALUE
import java.util.*;

public class Linear_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of a Array :");
        int num=sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Enter the element "+i+" index: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Logic(arr,sc));
    }
    public static int Logic(int[] arr, Scanner sc){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        System.out.print("Enter the Searching Element :");
        int n=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(n==arr[i]){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
