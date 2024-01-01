//Java Program to determine whether two strings are the anagram
import java.util.*;

public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String :");
        String str1=sc.nextLine();
        System.out.println();
        System.out.print("Enter the second String :");
        String str2=sc.nextLine();
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println();
            System.out.println("Not Anagram");
        }else{
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2)==true){
                System.out.println();
                System.out.println("Anagram");
            }else{
                System.out.println();
                System.out.println("Not Anagram");
            }
        }
        sc.close();
    }
}
/*Output:
 * Enter the first String :vasi
 * Enter the second String :siva
 * Anagram
 */
