//This is Insection Sorting
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        InsectionSort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void InsectionSort(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
