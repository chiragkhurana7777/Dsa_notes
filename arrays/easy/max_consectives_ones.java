class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans =0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) ans++;
            max=Math.max(max,ans);           
            if(nums[i]==0) ans=0;
        }
        return max;
    }
}