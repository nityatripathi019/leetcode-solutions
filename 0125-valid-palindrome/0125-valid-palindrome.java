class Solution {
    public boolean isAlphanumeric(char ch){
        if(Character.isLetter(ch)||Character.isDigit(ch)){
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