import java.util.*;

public class LeadersInArray {

    public static List<Integer> leaders(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        int max = nums[n - 1];

        // Rightmost element is always a leader
        ans.add(max);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] > max) {
                max = nums[i];
                ans.add(nums[i]);
            }
        }

        // Leaders were found from right to left
        Collections.reverse(ans);

        return ans;
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

        List<Integer> result = leaders(nums);

        System.out.println("Leaders in the array:");
        System.out.println(result);

        sc.close();
    }
}