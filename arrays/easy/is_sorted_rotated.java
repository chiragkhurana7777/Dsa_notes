
import java.util.*;

public class is_sorted_rotated {

    public static boolean check(int[] arr) {

        int n = arr.length;

        int asccount=0;
        int desccount=0;

        for (int i = 0; i < n; i++) {
            int next=arr[(i+1)%n];

            if(arr[i]>next) asccount++;
            if(arr[i]<next) desccount++;

        }
        
        return asccount<=1 || desccount<=1;

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
            System.out.println("yes it is sorted and rotated."); 
        }else {
            System.out.println("no, it is not sorted and rotated.");
        }



        sc.close();
    }
}
