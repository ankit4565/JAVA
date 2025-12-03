package String;

import java.util.HashSet;

class LongestSubstring {
    static void main() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;

        }
        int longestSubstring =0;
        int j =0;

        while( j<s.length()){
            HashSet<Character> set = new HashSet<>();
            int currentSubstring =0;

             for(int i =j; i<s.length(); i++){
                 if(set.contains(s.charAt(i))) {
                    break;
                }
                 set.add(s.charAt(i));
                 currentSubstring++;


             }
            longestSubstring = Math.max(longestSubstring, currentSubstring);
             j++;
        }
        return longestSubstring;
    }
}