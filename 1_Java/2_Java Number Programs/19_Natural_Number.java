import java.util.*;
public class NaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        System.out.println("The Natural Number :"+naturalnumber(num));
        sc.close();
    }
    public static int naturalnumber(int num){
        return num*(num+1)/2;
    }
}
/*Output
 * Enter the number :10
 * The Natural Number :55
 */
