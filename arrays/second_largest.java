import java.util.*;

public class second_largest {
    
    public static int second_large(int[] arr){
        int n=arr.length;
        if(n<2) return -1;

        int largest=arr[0];
        int second=Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second){
                second=arr[i];
            }
        }

        if(second==Integer.MIN_VALUE) return -1;

        return second;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size : ");
        int n=sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("the second largest is : "+ second_large(arr));
        

        sc.close();
    }
}