import java.util.*;

public class single_number {

    public static int singleNumber(int[] nums) {

        int ans = 0;

        for (int i : nums) {
            ans ^= i;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = singleNumber(nums);

        System.out.println("Single number: " + ans);

        sc.close();
    }
}