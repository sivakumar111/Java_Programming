//Java Program to Find Square Root of a Number Without sqrt Method
import java.util.Scanner;  
public class SqrtNumber   
    {  
        public static void main(String[] args)    
            {   
                System.out.print("Enter a number: ");    
                Scanner sc = new Scanner(System.in);    
                int n = sc.nextInt();    
                System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
                sc.close();
            }   
        public static double squareRoot(int num)   
        {  
           //temporary variable  
            double t;  
            double sqrtroot=num/2;  
            do   
                {  
                    t=sqrtroot;  
                    sqrtroot=(t+(num/t))/2;  
                }while((t-sqrtroot)!= 0);  
            return sqrtroot;  
}  
}
