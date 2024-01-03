//string is palindrome
import java.util.*;
public class String_Palindrom {
    public static void main(String[] args){
        Scanner sc  =  new Scanner (System.in);
        System.out.print("Enter the name :");
        String name = sc.nextLine();
        name=name.toLowerCase();
        if(logic(name)){
            System.out.println("The String is palindrom");
        }else{
            System.out.println("The String was not a Palindrom");
        }
        sc.close();
    }

    public static boolean logic(String name) {
        for(int i=0; i<name.length()/2; i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
/*Output:
 * Enter the name :Amma
 * The String is palindrom
 */
