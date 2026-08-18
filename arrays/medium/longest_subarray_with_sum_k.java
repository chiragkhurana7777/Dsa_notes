import java.util.*;

public class longest_subarray_with_sum_k {

    public static int longestSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int req = sum - k;

            if (map.containsKey(req)) {
                maxLen = Math.max(maxLen, i - map.get(req));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
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

        int ans = longestSubarray(nums, k);

        System.out.println("Longest subarray length: " + ans);

        sc.close();
    }
}