//Java Program to divide a string in 'N' equal parts.
import java.util.*;
public class N_Equal_Parts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String name = sc.nextLine();
        int len = name.length();
        System.out.print("Enter the N equal parts number :");
        int n=sc.nextInt(), chars=len/n;
        int temp=0;
        //Create new String
        String st[] =new String[n];
        if(len%n!=0){
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
        }else{
            for(int i=0; i<len; i+=chars){
                String part= name.substring(i, i+chars);
                st[temp]=part;
                temp++;
            }
        }

        for(int i=0; i<st.length; i++){
            System.out.println(st[i]);
        }

        sc.close();
    }
}

/*Output:
 * Enter the String :aaaabbbbcccc
 * Enter the N equal parts number :3
 * aaaa
 * bbbb
 * cccc
 */
