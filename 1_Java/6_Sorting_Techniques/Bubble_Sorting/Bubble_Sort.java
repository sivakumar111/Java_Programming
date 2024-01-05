import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    Swap(arr,j,j+1);
                }
            }
        }
    }
    public static void Swap(int[] arr,int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
