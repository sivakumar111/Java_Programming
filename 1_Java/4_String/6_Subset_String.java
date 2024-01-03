//Java Program to find all subsets of a string
import java.util.*;
public class Subset_String{
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String name = sc.nextLine();
        int len=name.length();
        int temp=0;
        String[] array = new String[len*(len+1)/2];
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                array[temp]=name.substring(i, j+1);
                temp++;
            }
        }
        
        //System.out.println(Arrays.toString(array));

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}

/*Output:
 * Enter the String :SIVA
 * S SI SIV SIVA I IV IVA V VA A
 */
