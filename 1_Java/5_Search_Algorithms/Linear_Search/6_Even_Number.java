import java.util.*;
public class Count_Even_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of a Array :");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Total number of even digits :"+evenNum(arr));
        sc.close();
    }
    public static int evenNum(int[] arr){
        int val=0;
        for(int i=0; i<arr.length; i++){
               int n = arr[i];
               if(single(n)){
                val++;
               }
        }
        return val;
    }
    public static boolean single(int n){
        int temp=n;
        int count=0;
        while(temp>0){
            int rem=temp%10;
            count++;
            temp=temp/10;
        }
        if(count%2==0){
            return true;
        }

        return false;
    }
}
/* Output:
Enter the size of a Array :5
12 345 2 6 7896
Total number of even digits :2*/
