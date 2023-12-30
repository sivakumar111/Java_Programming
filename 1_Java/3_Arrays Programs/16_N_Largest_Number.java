//Java Program to find Third Largest Number in an Array
public class Find_N_Number {
    public static void main(String[] args){
        int[] arr = new int[]{100,20,330,140,50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int num = 3;
        System.out.println(arr[arr.length-num]);
    }    
}

