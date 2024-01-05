import java.util.*;
public class Total_Wealth_Of_Customer {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number of rows :");
        int row=sc.nextInt();

        int[][] arr=new int[row][];

        for(int i=0; i<row; i++){
            System.out.print("Enter the Colum size "+i+" :");
            arr[i]=new int[sc.nextInt()];
        }

        System.out.println("Enter the Element");
        for(int i=0; i<row; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        logic(arr,row);
        sc.close();
    }
    public static void logic(int[][] arr, int row){
        for(int i=0; i<row; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of the each row :"+sum);
        }
    }
}
/*Output:
Enter the number of rows :3
Enter the Colum size 0 :1
Enter the Colum size 1 :2
Enter the Colum size 2 :3
Enter the Element
1 2 3 4 5 6 
Sum of the each row :1
Sum of the each row :5
Sum of the each row :15*/
