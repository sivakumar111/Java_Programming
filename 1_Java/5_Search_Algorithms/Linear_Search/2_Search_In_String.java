import java.util.*;
public class Search_In_String {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the String :");
        String name = sc.nextLine();
        System.out.print("Enter the Character :");
        char ch = sc.next().charAt(0);
        if(logic(name, ch)){
            System.out.println("The Character was found in a given String");
        }else{
            System.out.println("The Character was not found in a given String");
        }
        sc.close();
    }
    public static boolean logic(String name, char ch){
        if(name.length()==0){
            return false;
        }

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)==ch){
                return true;
            }
        }
        return true;
    }
}

/*Output:
 * Enter the String :siva
 * Enter the Character :s
 * The Character was found in a given String
 */
