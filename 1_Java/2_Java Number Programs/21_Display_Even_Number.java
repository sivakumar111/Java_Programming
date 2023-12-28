// Java Program to Display Even Numbers From 1 to 100
import java.util.*;

public class EvenNumbers{
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
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
/*Output
 * Enter the starting number :10
 * Enter the ending number :100
 * 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 
 * 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 
 */
