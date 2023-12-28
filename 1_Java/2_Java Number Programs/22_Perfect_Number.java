//Perfect Number 
import java.util.*;
public class PerfectSqure {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        if(logic(num)){
            System.out.println("The given number was perfect number");
        }else{
            System.out.println("The given number was not a perfect number");
        }
        sc.close();
    }
    public static boolean logic(int num){
        double sqt = Math.sqrt(num);
        return (sqt-Math.floor(sqt)==0);
    }
}

/*Output
 * Enter the number :144
 * The given number was perfect number
 */
