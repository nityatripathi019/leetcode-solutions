class Solution {
    public boolean isAlphanumeric(char ch){
        if(ch>='0'&&ch<='9' || ch>='a'&& ch<='z'||ch>='A'&&ch<='Z'){
            return true;
        }else{
           return false;
        }
    }
    public boolean isPalindrome(String s) {

      int start =0;int end = s.length()-1;
      while(start<end){
        if(!isAlphanumeric(s.charAt(start))){
        start++;continue;
        }if(!isAlphanumeric(s.charAt(end))){
            end--;continue;
        }else{
           if (Character.toLowerCase(s.charAt(start)) !=
                Character.toLowerCase(s.charAt(end))) {
                return false;
            }else{
                start++;end--;
            }
        }
      }
      return true;
    }
}