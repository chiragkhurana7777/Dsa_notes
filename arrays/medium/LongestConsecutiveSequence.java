import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        // Add all elements to HashSet
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        // Find the start of every sequence
        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = 1;
                int x=num;
                while(set.contains(x+1)){
                    current++;
                    x++;
                }
                longest = Math.max(longest, current);
            }
        }

        return longest;
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

        int result = longestConsecutive(nums);

        System.out.println("Longest consecutive sequence length: " + result);

        sc.close();
    }
}