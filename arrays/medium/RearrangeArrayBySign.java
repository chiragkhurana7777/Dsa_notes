import java.util.*;

public class RearrangeArrayBySign {

    public static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];

        int positive = 0;
        int negative = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[negative] = nums[i];
                negative += 2;
            } else {
                arr[positive] = nums[i];
                positive += 2;
            }
        }

        return arr;
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

        int[] result = rearrangeArray(nums);

        System.out.println("Rearranged array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}