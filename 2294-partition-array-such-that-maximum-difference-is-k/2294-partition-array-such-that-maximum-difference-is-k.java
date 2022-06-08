class Solution {
    public int partitionArray(int[] nums, int k) {
        
        if(nums.length<=1) return nums.length;
        
        Arrays.sort(nums);
        int ans=1;
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-min >k)
            {
                min=nums[i];
                ans++;
            }
        }
        
        return ans;
    }
}