import java.util.*;
public class Selection_Sorting{
    public static void main(String[] args){
        int[] arr={5,4,1,6,3,7,2};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sorting(int[] arr){
        int size=arr.length;
        for(int i=0; i<arr.length; i++){
            int last=size-1-i;
            int elementMax=eleMax(arr,0,last); //It will reserves a index value
            swap(arr,elementMax,last);
        }
    }

    public static void swap(int[] arr, int elementMax, int last) {
        int temp=arr[elementMax];
        arr[elementMax]=arr[last];
        arr[last]=temp;
    }

    public static int eleMax(int[] arr, int start, int last) {
        int max=start;
        for(int i=start; i<=last; i++){
            if(arr[i]>arr[max])
            {
                max=i; //It will give a index value 
            }
        }
        return max;
    }
}

/*Output:
[1, 2, 3, 4, 5, 6, 7] */
