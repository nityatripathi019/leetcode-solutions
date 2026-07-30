class Solution {
    public int findPairs(int[] nums, int k) {
      int left =0,right=1,count=0;
      Arrays.sort(nums);
      while(right<nums.length){
      if(left==right){
        right++;
        continue;
      }
      int diff = nums[right]-nums[left];
      if(diff<k){
        right++;
      }else if(diff>k){
        left++;
      }else{
        count++;
        left++;

        while(left<nums.length && nums[left]==nums[left-1]){
            left++;
        }
      }

      if(right<=left){
        right=left+1;
      }
    
      }
     return count;
    }
}