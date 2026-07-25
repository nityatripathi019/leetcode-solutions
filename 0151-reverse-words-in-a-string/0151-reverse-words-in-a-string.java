class Solution {
    public String reverseWords(String str) {
     String reverse = new StringBuilder(str).reverse().toString();
    String newStr = "";

    for (int i = 0; i < reverse.length(); i++) {
      // skip spaces

      while (i < reverse.length() && reverse.charAt(i) == ' ') {
        i++;
      }
      String word = "";
      while (i < reverse.length() && reverse.charAt(i) != ' ') {
        word += reverse.charAt(i);
        i++;
      }
      String output = new StringBuilder(word).reverse().toString();
      if (output.length() > 0) {
        newStr += " " + output;
      }
          
    }
     return newStr.trim();   
    }
}
