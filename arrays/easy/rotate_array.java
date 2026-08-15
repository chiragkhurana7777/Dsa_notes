//reversal approach: fails only one test - case on leetcode,but that's some leetcode problem
// It's a optimal solution with time: O(n) and space : O(1).

import java.util.*;

public class rotate_array {

    public static void swap(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k==0) return;

        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);

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
        System.out.print("enter no of shifts: ");
        int k = sc.nextInt();

        rotate(arr,k);

        for(int i: arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
