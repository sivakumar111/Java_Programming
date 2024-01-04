import java.util.*;

public class Search_In_Range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the elements "+i+" index :");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Starting range :");
        int Fn=sc.nextInt();
        System.out.print("Enter the Ending range :");
        int En = sc.nextInt();
        if(logic(arr, Fn, En, sc)){
            System.out.println("Element are found");
        }else{
            System.out.println("Element was not found");
        }
    }
    public static boolean logic(int[] arr, int Fn, int En, Scanner sc){
        if(arr.length==0){
            return false;
        }
        
        System.out.print("Enter the Targeted Value :");
        int num=sc.nextInt();
        for(int i=Fn; i<=En; i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}

/*Output:
Enter the Size :6
Enter the elements 0 index :55
Enter the elements 1 index :15
Enter the elements 2 index :26
Enter the elements 3 index :14
Enter the elements 4 index :100
Enter the elements 5 index :24
Enter the Starting range :2
Enter the Ending range :5
Enter the Targeted Value :100
Element are found*/
