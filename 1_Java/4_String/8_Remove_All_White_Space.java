import java.util.*;
public class RemoveSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the name :");
        String name = sc.nextLine();
        name=name.replaceAll("\\s+", "");
        System.out.println("String After remove all the white space :"+name);
        sc.close();
    }
}
/*Output:
 * Enter the name :Kovvuri Siva Kumar Reddy
 * String After remove all the white space :KovvuriSivaKumarReddy
 */

 //String After remove all the white space :Siva@Kumar@Reddy
