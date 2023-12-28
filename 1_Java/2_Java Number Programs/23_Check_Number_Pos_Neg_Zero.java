// Number was Positive or Negative Number or Equels to zero 
import java.util.*;
public class PositiveOrNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The given number was Positive Number");
        }else if(num<0){
            System.out.println("The given number was Negative Number");
        }else{
            System.out.println("The given number equels to zero");
        }
        sc.close();
    }
}

/*Output
 *  Enter the number :
 * 100
 * The given number was Positive Number
 */

