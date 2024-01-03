//Java Program to determine whether one string is a rotation of another
import java.util.*;
public class RotationOfString {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the String 1 :");
        String str1 = sc.nextLine();
        System.out.print("Enter the String 2 :");
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Both String Length was not Equal");
        }else{
            str1=str1.concat(str1);
            if(str1.indexOf(str2)!=-1){
                System.out.println("Second String is a rotation of another");
            }else{
                System.out.println("Second string was not a rotation of another");
            }
        }
        sc.close();
    }
}

/*Output:
 * Enter the String 1 :abcde
 * Enter the String 2 :ebcda
 * Second string was not a rotation of another
 */
