import java.util.*;

/*nums = [3, 4, -7, 1, 3, 3, 1, -4, 2, 5, -2]
k = 7 */

public class subarray_with_sum_k {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int ans = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int needed = sum - k;

            ans += map.getOrDefault(needed, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays = " + result);

        sc.close();
    }
}