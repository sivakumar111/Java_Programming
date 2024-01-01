//Java Program to count the total number of characters in a string
public class Count_Character{
    public static void main(String[] args){
        String word = "This is Kovvuri Siva Kumar Reddy";
        int count=0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Total number of characters in a string: " + count);
        System.out.println("Length of a string: " + word.length());
    }
}
/*Output:
 * Total number of characters in a string: 27
 * Length of a string: 32
 */
