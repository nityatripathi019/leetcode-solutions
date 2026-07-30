class Solution {
    public void moveZeroes(int[] nums) {
        int num2[]= new int[nums.length];
        int count=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
               num2[idx]=nums[i];
               idx++;
            }
        }
        while(idx<num2.length){
        num2[idx]=0;
        idx++;
        }
        
      for(int i=0;i<nums.length;i++){
        nums[i]=num2[i];
      }
    }
}