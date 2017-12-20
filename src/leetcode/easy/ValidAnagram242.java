package leetcode.easy;

import java.util.Arrays;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        } else if (s.length() != t.length()) {
            return false;
        } else {
            char[] a = s.toCharArray();
            Arrays.sort(a);

            System.out.println(Arrays.toString(a));

            char[] b = t.toCharArray();
            Arrays.sort(b);

            return String.valueOf(a).equals(String.valueOf(b));
        }
    }

    /* Alternative
        O(n)
        The idea is simple. It creates a size 26 int arrays as buckets for each letter in alphabet. It increments the bucket value with String s and decrement with string t.
        So if they are anagrams, all buckets should remain with initial value which is zero. So just checking that and return

        public boolean isAnagram(String s, String t) {
            int[] alphabet = new int[26];
            for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
            for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
            for (int i : alphabet) if (i != 0) return false;
            return true;
        }
     */

    public static void main(String args[]) {
        ValidAnagram242 obj = new ValidAnagram242();
        boolean ret = obj.isAnagram("manas", "sanma");
        System.out.println(ret);
    }
}
