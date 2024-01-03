//Java Program to find the longest repeating sequence in a string
import java.util.*;
public class Langest_Repeating_Sequency {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the String :");
       String name = sc.nextLine();
       String lrs="";

       int n=name.length();
       for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            String x = lcp(name.substring(i,n), name.substring(j,n));
            if(x.length()>lrs.length()){
                lrs=x;
            }
        }
       }
       System.out.println("Longest repeating sequence :"+lrs);
       sc.close();
    }

    public static String lcp(String s, String t) {
        int n=Math.min(s.length(), t.length());
        for(int i=0; i<n; i++){
            if(s.charAt(i)!=t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }
}

/*Output:
 * Enter the String :acbdfghybdf
 * Longest repeating sequence :bdf
 */
