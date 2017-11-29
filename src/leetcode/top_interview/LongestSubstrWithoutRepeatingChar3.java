package leetcode.top_interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstrWithoutRepeatingChar3 {

    public int lengthOfLongestSubstring(String str) {
        Set<Character> charSet = new HashSet<>();

        int max=0, i=0,j=0;

        while(j<str.length()){
            if(!charSet.contains(str.charAt(j))){
                charSet.add(str.charAt(j));
                j++;
                max = Math.max(max, charSet.size());
            }else {
                charSet.remove(str.charAt(i));
                i++;
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }

    public static void main(String args[]){
        LongestSubstrWithoutRepeatingChar3 obj = new LongestSubstrWithoutRepeatingChar3();
        int i = obj.lengthOfLongestSubstring("abcdbcdd");
        System.out.println(i);
    }
}
