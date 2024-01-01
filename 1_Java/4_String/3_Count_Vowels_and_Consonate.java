//Java Program to count the total number of vowels and consonants in a string
import java.util.Scanner;

public class Count_Vowels_Consonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String str = sc.nextLine();
        int vCount=0;
        int cCount=0;
        for(int i=0; i<str.length(); i++){
             //Checks whether a character is a vowel    
             if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }  
        System.out.println("Number of vowels: "+vCount);
        System.out.println("Number of Consonaats: "+cCount);
       sc.close();
    }
}

/*Output:
 * Enter the Sentence :
"This is a really simple sentence"
Number of vowels: 10
Number of Consonaats: 16
 */
