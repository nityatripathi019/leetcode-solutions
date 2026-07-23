class Solution {
     public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int piv =-1;
        int n=nums.length;
        //finding pivot 
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
            piv=i;
            break;
            }
        }
        if(piv==-1){
         Arrays.sort(nums);
         return;
        }
        //finding the righmost element>pivot
       for(int i=n-1;i>piv;i--){
        if(nums[i]>nums[piv]){
            swap(nums,i,piv);
            break;
        }
       }
      
      int j =piv+1;int k=nums.length-1;
      while(j<k){
        swap(nums,j,k);
        j++;
        k--;
      }

    }
}