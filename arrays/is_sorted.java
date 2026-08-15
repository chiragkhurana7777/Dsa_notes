
import java.util.*;

public class is_sorted {

    public static boolean check(int[] arr) {

        int n = arr.length;
        boolean ascending = true;
        boolean decending = true;


        for (int i = 1; i < n; i++) {
        
            if (arr[i] < arr[i - 1]) {
                ascending = false;
            }

            if (arr[i] > arr[i - 1]) {
                decending = false;
            }

        }

        return ascending || decending;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (check(arr)) {
            System.out.println("yes it is sorted."); 
        }else {
            System.out.println("no, it is not sorted.");
        }

        sc.close();
    }
}
