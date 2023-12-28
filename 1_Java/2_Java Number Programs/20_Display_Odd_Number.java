// Java Program to Display Odd Numbers From 1 to 100
import java.util.*;

public class OddNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number :");
        int start = sc.nextInt();
        System.out.print("Enter the ending number :");
        int end =sc.nextInt();
        System.out.println();
        oddNumber(start, end);
        sc.close();
    }

    public static void oddNumber(int start, int end) {
        if(start>end){
            return;
        }
        for(int i=start; i<=end; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
/*Output:
 * Enter the starting number :10
 * Enter the ending number :100
 * 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 
 * 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 
 */
