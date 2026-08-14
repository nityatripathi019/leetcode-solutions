class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
      int start=0;
      int end=0;
      int maxLength=0;
      while(end<s.length()){
        char ch = s.charAt(end);

        if(map.containsKey(ch) && map.get(ch)>=start){
            start=map.get(ch)+1;
        }
        map.put(ch,end);
        maxLength= Math.max(maxLength,end-start+1);
        end++;
      }
        
     return maxLength;     
    }
}