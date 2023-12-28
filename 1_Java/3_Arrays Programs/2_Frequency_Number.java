//Program to find the frequency of each element in the array
import java.util.*;
public class FrequencyArray {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of number :");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        FrequencyArrays(arr);
        sc.close();
    }

    public static void FrequencyArrays(int[] arr) {
        int[] fre = new int[arr.length];
        int visited=-1;
        for(int i=0; i<arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    fre[j]=visited;
                }
            }
            if(fre[i]!=visited){
                fre[i]=count;
            }
        }

        //Display 
        for(int i=0; i<fre.length; i++){
            if(fre[i]!=visited){
                System.out.println(arr[i]+" "+fre[i]);
            }
        }
    }
}
