class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left=m-1;
        int right=n-1;
        int i=m+n-1;

        while(left>=0 && right>=0){

            if(nums1[left]>=nums2[right]){
                nums1[i]=nums1[left];
                left--;
                i--;
            }
            else{
                nums1[i]=nums2[right];
                right--;
                i--;
            }


        }

        
        while(right>=0){
            nums1[i]=nums2[right];
                right--;
                i--;
        }


    }
}

public class merge_two_sorted_array_inspace {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        new Solution().merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}