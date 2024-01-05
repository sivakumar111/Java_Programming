//Initial find the given array was in Ascending or Descending order
/*Order Agnostic in Binary Search in java
If we didn’t know if the given value was Ascending or Descending order.
 */

import java.util.*;

public class Order_Agnostic_Binary_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of a Array :");
        int num =sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements in a array :");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target value :");
        int n=sc.nextInt();
        System.out.println(BinarySearch(arr,n));
        sc.close();
    }
    public static int BinarySearch(int[] arr, int n){
        int start =0;
        int end = arr.length-1;
        boolean isAscending=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==n){
                return mid;
            }

            if(isAscending){
                if(n>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(n<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

/*Output:
Enter the size of a Array :5
Enter the elements in a array :
5 4 3 2 1 
Enter the target value :3
2
 */
