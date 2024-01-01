//Java Program to Count the Total Number of Punctuation Characters Exists in a String
import java.util.*;
public class Punctuation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentences :");
        String Ass= sc.nextLine();
        int count=0;
        for(int i=0; i<Ass.length(); i++){
            if(Ass.charAt(i)=='!' || Ass.charAt(i)=='.' || Ass.charAt(i)=='"' || Ass.charAt(i)=='-'|| Ass.charAt(i)=='?'|| Ass.charAt(i)==';' || Ass.charAt(i)==','){
                count++;
            }
        }
        System.out.println("The number of punctuation :"+count);
        sc.close();
    }
}
/*Output:
 * Enter the Sentences :
 * "He said, 'The mailman loves you.' I heard it with my own ears."
 * The number of punctuation :5
 */
