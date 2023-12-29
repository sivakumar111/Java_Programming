//Java Program to right rotate the elements of an array
import java.util.*;

public class Rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        System.out.print("Enter the number of shifts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        System.out.println("Shifted array: " + Arrays.toString(arr));

        sc.close();
    }
}
/*Output:
Enter the number of shifts: 3
Shifted array: [3, 4, 5, 1, 2] */
