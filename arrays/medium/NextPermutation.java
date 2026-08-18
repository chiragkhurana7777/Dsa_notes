import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        // Step 1: Find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, array is in descending order
        if (pivot == -1) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        // Step 3: Find the element just greater than pivot
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[pivot]) {

                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        // Step 4: Reverse the suffix
        int left = pivot + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}