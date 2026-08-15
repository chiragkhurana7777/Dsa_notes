import java.util.*;

public class remove_dupliocates_sorted_array {
    
    public static int removeDuplicates(int[] nums) {
        int k=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size: ");
        int n = sc.nextInt();
        System.out.print("enter array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("array without duplicates: ");
        
        int k = removeDuplicates(arr);
        
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}