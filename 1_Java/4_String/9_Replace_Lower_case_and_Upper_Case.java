//Java Program to replace lower-case characters with upper-case and vice-versa
import java.util.*;
public class Change_case {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the String :");
        String name=sc.nextLine();
        StringBuffer newStr = new StringBuffer(name);

        for(int i=0; i<name.length(); i++){
            //Checking if the character was lower case are not
            if(Character.isLowerCase(name.charAt(i))){
                newStr.setCharAt(i,Character.toUpperCase(name.charAt(i)));
            }else if(Character.isUpperCase(name.charAt(i))){
                newStr.setCharAt(i,Character.toLowerCase(name.charAt(i)));
            }
        }
        System.out.println("After the Change the Sentence :"+newStr);
    }
}
/*Output:
 * Enter the String :Siva Kumar
 * After the Change the Sentence :sIVA kUMAR
 */
