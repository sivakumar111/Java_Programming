import java.util.Arrays;

public class DesendingOrder {
    public static void main(String[] args){
        int[] arr = new int[] {5, 4, 3, 2, 6, 7};
        System.out.println("Original Array :"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After the Sorting :"+Arrays.toString(arr));
    }
}

                                //(or)
// import java.util.Arrays;
// import java.util.Collections;

// public class DesendingOrder {

//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         Arrays.sort(arr);
//         Collections.reverse(Arrays.asList(arr));
//         System.out.println(Arrays.toString(arr));
//     }
// }

/*Output:
 * Original Array :[5, 4, 3, 2, 6, 7]
 * After the Sorting :[7, 6, 5, 4, 3, 2]
 */
