import java.util.*;

public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size : ");
        int n=sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
        int largest=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        System.out.println("the largest element is "+largest);


        sc.close();
    }
}