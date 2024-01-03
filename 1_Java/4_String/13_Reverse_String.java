//Java Program to find Reverse of the string.
import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the String :");
        String name = sc.nextLine();
        String revStr="";
        for(int i=name.length()-1; i>=0; i--){
            revStr=revStr+name.charAt(i);
        }
        System.out.println("Original String :"+name);
        System.out.println("Reverse String :"+revStr);
        sc.close();
    }
}
/*Output:
 * Enter the String :Siva
 * Original String :Siva
 * Reverse String :aviS
 */
