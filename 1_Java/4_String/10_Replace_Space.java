import java.util.*;
public class Replace_Space {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Name :");
        String name = sc.nextLine();
        char ch='-';

        //Logic (Method)
        name =name.replace(' ',ch);
        System.out.println("Output: "+name);
    }
}

/*Output:
 * Enter the Name :Kovvuri Siva Kumar Reddy
 * Output: Kovvuri-Siva-Kumar-Reddy
 */
