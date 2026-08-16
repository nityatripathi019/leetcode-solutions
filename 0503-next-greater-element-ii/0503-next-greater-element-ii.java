class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
         int n = nums.length;
        int nextGreater[]= new int [n];
       
        for(int i =2*n-1 ;i>=0;i--){
            //while 
            while(!s.isEmpty() && nums[s.peek()]<=nums[i%n]){
                s.pop();
            }
            //ifelse conditi
            if(s.isEmpty()){
            nextGreater[i%n]=-1;
            }else{
                nextGreater[i%n]=nums[s.peek()];
            }
            //push stack
            s.push(i%n);
        }
        return nextGreater;
    }
}